package by.paramonov.warehousev3.mapper;

import by.paramonov.warehousev3.dto.WarehouseRequest;
import by.paramonov.warehousev3.model.Warehouse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface WarehouseToDtoMapper {
    Warehouse addWarehouseRequestToWarehouse(WarehouseRequest warehouseRequest);
}
