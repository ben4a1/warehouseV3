package by.paramonov.warehousev3.controller;

import by.paramonov.warehousev3.mapper.WarehouseToDtoMapper;
import by.paramonov.warehousev3.model.Warehouse;
import by.paramonov.warehousev3.service.WarehouseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
