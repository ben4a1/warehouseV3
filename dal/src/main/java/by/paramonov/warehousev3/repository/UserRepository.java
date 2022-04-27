package by.paramonov.warehousev3.repository;

import by.paramonov.warehousev3.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, UUID> {

    UserEntity findByUsername(String username);
}
