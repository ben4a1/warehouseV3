package by.paramonov.warehousev3.repository.service;

import by.paramonov.warehousev3.model.Warehouse;

import java.util.List;

public interface WarehouseService {
    // getting warehouse by id
    Warehouse getWarehouseById(Long id);

    List<Warehouse> getAllWarehouses();
    void addWarehouse(Warehouse warehouse);
    List<Warehouse> findAllWarehousesByOwner(String owner);
}
