package by.paramonov.warehousev3.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "role")
@AttributeOverride(name = "id", column = @Column(name = "role_id"))
public class RoleEntity extends BaseEntity{

    @Column(name = "name")
    private String name;
}




