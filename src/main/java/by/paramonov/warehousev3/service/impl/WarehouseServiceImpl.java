package by.paramonov.warehousev3.service.impl;

import by.paramonov.warehousev3.entity.WarehouseEntity;
import by.paramonov.warehousev3.exception.WarehouseNotFoundException;
import by.paramonov.warehousev3.mapper.WarehouseToEntityMapper;
import by.paramonov.warehousev3.model.Warehouse;
import by.paramonov.warehousev3.repository.WarehouseRepository;
import by.paramonov.warehousev3.service.WarehouseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

//Service layer
@Service
@RequiredArgsConstructor
public class WarehouseServiceImpl implements WarehouseService {
    private final WarehouseRepository warehouseRepository;
    private final WarehouseToEntityMapper mapper;

    @Override
    public Warehouse getWarehouseById(UUID id) {
        WarehouseEntity warehouseEntity = warehouseRepository.findById(id).
                orElseThrow(() -> new WarehouseNotFoundException("Warehouse is not exists"));
        return mapper.warehouseEntityToWarehouse(warehouseEntity);
    }

    @Override
    public List<Warehouse> getAllWarehouses() {
        Iterable<WarehouseEntity> warehouseEntities = warehouseRepository.findAll();

        ArrayList<Warehouse> warehouses = new ArrayList<>();
        for (WarehouseEntity warehouseEntity : warehouseEntities) {
            warehouses.add(mapper.warehouseEntityToWarehouse(warehouseEntity));
        }
        return warehouses;
    }

    @Override
    public void addWarehouse(Warehouse warehouse) {
        WarehouseEntity warehouseEntity = mapper.warehouseToWarehouseEntity(warehouse);
        warehouseRepository.save(warehouseEntity);
    }
}
