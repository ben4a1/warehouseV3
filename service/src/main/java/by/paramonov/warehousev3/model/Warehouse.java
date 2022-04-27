package by.paramonov.warehousev3.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Value;


//Service layer
@Value
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String owner;
    String name;
}
