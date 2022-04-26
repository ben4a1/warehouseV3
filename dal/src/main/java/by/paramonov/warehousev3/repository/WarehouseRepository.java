package by.paramonov.warehousev3.repository;

import by.paramonov.warehousev3.entity.WarehouseEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WarehouseRepository extends CrudRepository<WarehouseEntity, Long> {
    List<WarehouseEntity> findAllByOwner(String owner);
}
