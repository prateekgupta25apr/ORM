package org.prateekgupta.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class UserDTO {
    private int id;
    private String name;
    private String email;
    private String dob;
    private String gender;
}
