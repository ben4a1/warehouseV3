package by.paramonov.warehousev3.dto;

import lombok.Data;

//data transfer object
@Data
public class WarehouseRequest {
    private String owner;
    private String name;
}
