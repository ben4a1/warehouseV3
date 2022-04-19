package by.paramonov.warehousev3.controller;

import by.paramonov.warehousev3.dto.AddWarehouseRequest;
import by.paramonov.warehousev3.mapper.WarehouseToDtoMapper;
import by.paramonov.warehousev3.model.Warehouse;
import by.paramonov.warehousev3.service.WarehouseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController()
@RequestMapping("/warehouses")
@RequiredArgsConstructor
public class WarehouseController {

    private final WarehouseService warehouseService;
    private final WarehouseToDtoMapper warehouseToDtoMapper;

    @GetMapping("/{id}")
    public Warehouse getWarehouseById(@PathVariable UUID id) {
        return warehouseService.getWarehouseById(id);
    }

    @GetMapping
    public List<Warehouse> getAllWarehouses(){
        return warehouseService.getAllWarehouses();
    }

    @PostMapping
    public void addWarehouse(@RequestBody AddWarehouseRequest request){
        warehouseService.addWarehouse(warehouseToDtoMapper
                        .addWarehouseRequestToWarehouse(request));
    }
}
