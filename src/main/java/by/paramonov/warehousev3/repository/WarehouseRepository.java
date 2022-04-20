package by.paramonov.warehousev3.repository;

import by.paramonov.warehousev3.entity.WarehouseEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface WarehouseRepository extends CrudRepository<WarehouseEntity, UUID> {
    List<WarehouseEntity> findAllWarehousesByOwner(String owner);
}
