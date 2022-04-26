package by.paramonov.warehousev3.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "role")
@Getter
@Setter
@AttributeOverride(name = "id", column = @Column(name = "role_id"))
public class RoleEntity extends BaseEntity{

    @Column(name = "name")
    private String name;
}
