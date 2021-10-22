package org.prateekgupta.entity;



import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@Entity
@Table(name = "user_details")
public class UserEntity {
    @Id
    private int id;
    private String name;
    private int accountNUmber;
    private String ifscCode;
    private String address;
}