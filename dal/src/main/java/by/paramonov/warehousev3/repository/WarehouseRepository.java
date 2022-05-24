package by.paramonov.warehousev3.repository;

import by.paramonov.warehousev3.entity.WarehouseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface WarehouseRepository extends JpaRepository<WarehouseEntity, UUID> {
    List<WarehouseEntity> findAllByOwner(String owner);
}
