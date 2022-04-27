package by.paramonov.warehousev3.service;

import by.paramonov.warehousev3.dto.UserDto;
import by.paramonov.warehousev3.entity.UserEntity;

import javax.validation.ValidationException;

public interface UserService {
    UserDto createUser(UserDto userDto)throws ValidationException;

    UserEntity findByUsername(String username);

}
