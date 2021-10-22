package org.prateekgupta.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
@Getter
public class UserDTO {
    private int id;
    private String name;
    private int accountNUmber;
    private String ifscCode;
    private String address;

}
