package by.paramonov.warehousev3.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


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
