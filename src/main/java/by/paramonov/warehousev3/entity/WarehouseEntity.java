package by.paramonov.warehousev3.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

//dal layer
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "warehouse")
public class WarehouseEntity extends BaseEntity {

    private String owner;
    private String name;

}
