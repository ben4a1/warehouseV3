package by.paramonov.warehousev3.controller;

import by.paramonov.warehousev3.dto.AddWarehouseRequest;
import by.paramonov.warehousev3.mapper.WarehouseToDtoMapper;
import by.paramonov.warehousev3.model.Warehouse;
import by.paramonov.warehousev3.service.WarehouseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/warehouses")
@RequiredArgsConstructor
public class WarehouseController {

    private final WarehouseService warehouseService;
    private final WarehouseToDtoMapper warehouseToDtoMapper;

    @GetMapping("/{id}")
    public Warehouse getWarehouseById(@PathVariable Long id) {
        return warehouseService.getWarehouseById(id);
    }

    @GetMapping
    public List<Warehouse> getAllWarehouses(@RequestParam(required = false)String owner){
        if (owner != null)
            return warehouseService.findAllWarehousesByOwner(owner);
        return warehouseService.getAllWarehouses();
    }

    @PostMapping
    public void addWarehouse(@RequestBody AddWarehouseRequest request){
        warehouseService.addWarehouse(warehouseToDtoMapper
                        .addWarehouseRequestToWarehouse(request));
    }
}
