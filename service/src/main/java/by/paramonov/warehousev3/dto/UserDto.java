package by.paramonov.warehousev3.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class UserDto {
    private UUID id;

    @NotNull(message = "username cannot be null")
    @Min(value = 3, message = "not less than 3 chars")
    private String username;

    @Email(message = "Email should be valid")
    private String email;

    @NotNull(message = "password cannot be null")
    @Min(value = 8, message = "not less than 8 chars")
    private String password;

    @NotNull(message = "firstname cannot be null")
    @Min(value = 2, message = "not less than 2 chars")
    private String firstname;

    @NotNull(message = "lastname cannot be null")
    @Min(value = 2, message = "not less than 2 chars")
    private String lastname;


}
