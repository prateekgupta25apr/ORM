package org.prateekgupta.service;

import org.prateekgupta.dao.Dao;
import org.prateekgupta.dao.DaoImpl;
import org.prateekgupta.dto.UserDTO;
import org.prateekgupta.entity.UserEntity;

public class ServiceImpl implements Service{
    @Override
    public String validateAndSave(UserDTO dto) {
        UserEntity entity=new UserEntity();
        if (dto !=null){
            entity.setId(dto.getId());
            entity.setName(dto.getName());
            entity.setEmail(dto.getEmail());
            entity.setDob(dto.getDob());
            entity.setGender(dto.getGender());
        }
        Dao dao=new DaoImpl();
        return dao.save(entity);
    }
}
