package org.example.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Passport {

    Long id;
    String name;
    int uniqueNumber;

}
