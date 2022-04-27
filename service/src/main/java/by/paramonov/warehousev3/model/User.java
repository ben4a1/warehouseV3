package by.paramonov.warehousev3.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Value;

import java.util.UUID;

@Value
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    String username;
    String email;
    String firstName;
    String lastname;
    Role role;
}
