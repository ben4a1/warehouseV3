package by.paramonov.warehousev3.mapper;

import by.paramonov.warehousev3.entity.WarehouseEntity;
import by.paramonov.warehousev3.model.Warehouse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface WarehouseToEntityMapper {

    WarehouseEntity warehouseToWarehouseEntity(Warehouse warehouse);
    Warehouse warehouseEntityToWarehouse(WarehouseEntity warehouseEntity);
}
