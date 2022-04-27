package by.paramonov.warehousev3.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Value;

import java.util.UUID;


//Service layer
@Value
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    String owner;
    String name;
}
