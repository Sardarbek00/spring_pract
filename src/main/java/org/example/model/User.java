package org.example.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    long id;
    String name;
    String lastName;
    Passport passport;
    static Long counter = 0L;


    public User(String name, String lastName, Passport passport) {
        this.name = name;
        this.lastName = lastName;
        this.passport = passport;
        this.id = counter++;
    }
}
