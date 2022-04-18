package by.paramonov.warehousev3.model;

import lombok.Value;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Value
public class Warehouse {
    @Id
    @GeneratedValue
    private UUID id;
    private String owner;
}
