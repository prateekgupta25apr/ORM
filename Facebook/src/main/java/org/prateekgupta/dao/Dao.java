package org.prateekgupta.dao;

import org.prateekgupta.entity.LoginEntity;
import org.prateekgupta.entity.UserEntity;

public interface Dao {
    String save(UserEntity entity);
    UserEntity getById(int id);
    LoginEntity getByEmail(String email);
    String updatePassword(String password,int id);
}
