package by.paramonov.warehousev3.service;

import by.paramonov.warehousev3.model.Warehouse;

import java.util.List;
import java.util.UUID;

public interface WarehouseService {
    // getting warehouse by id
    Warehouse getWarehouseById(UUID id);

    List<Warehouse> getAllWarehouses();
    void addWarehouse(Warehouse warehouse);
    List<Warehouse> findAllWarehousesByOwner(String owner);
}
