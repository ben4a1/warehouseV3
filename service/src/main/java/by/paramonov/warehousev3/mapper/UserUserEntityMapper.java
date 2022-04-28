package by.paramonov.warehousev3.mapper;

import by.paramonov.warehousev3.entity.UserEntity;
import by.paramonov.warehousev3.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserUserEntityMapper {

    UserEntity userToUserEntity(User user);

    User userEntityToUser(UserEntity userEntity);
}
