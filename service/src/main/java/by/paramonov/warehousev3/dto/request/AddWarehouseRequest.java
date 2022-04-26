package by.paramonov.warehousev3.dto.request;

import lombok.Data;

//data transfer object
@Data
public class AddWarehouseRequest {
    private String owner;
    private String name;
}
