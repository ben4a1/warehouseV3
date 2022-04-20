package by.paramonov.warehousev3.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

//dal layer
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "warehouse")
@AttributeOverride(name = "id", column = @Column(name = "warehouse_id"))
public class WarehouseEntity extends BaseEntity {

    private String owner;
    private String name;

}
