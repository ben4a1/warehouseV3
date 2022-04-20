package by.paramonov.warehousev3.model;

import lombok.Value;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Service layer
@Value
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String owner;
    String name;
}
