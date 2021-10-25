package org.prateekgupta.service;

import org.prateekgupta.dao.Dao;
import org.prateekgupta.dao.DaoImpl;
import org.prateekgupta.dto.LoginDTO;
import org.prateekgupta.dto.UserDTO;
import org.prateekgupta.entity.LoginEntity;
import org.prateekgupta.entity.UserEntity;

import java.util.Objects;

public class ServiceImpl implements Service {
    @Override
    public String validateAndSave(UserDTO dto) {
        UserEntity entity = new UserEntity();
        if (dto != null) {
            if (dto.getId() > 0) entity.setId(dto.getId());
            else return "Invalid id";

            if (!dto.getName().equals("")) entity.setName(dto.getName());
            else return "Invalid name";

            if (!dto.getEmail().equals("")) entity.setEmail(dto.getEmail());
            else return "Invalid email";

            entity.setDob(dto.getDob());
            entity.setGender(dto.getGender());

            if (dto.getPassword().equals(dto.getConfirmPassword()))
                entity.setPassword(dto.getPassword());
            else return "Password mismatch";
        }
        Dao dao = new DaoImpl();
        return dao.save(entity);
    }

    @Override
    public String validateAndLogin(LoginDTO dto) {
        if (!Objects.isNull(dto)) {
            if (!dto.getEmail().equals("")) {
                if (dto.getPassword().equals(dto.getConfirmPassword())) {
                    Dao dao = new DaoImpl();
                    LoginEntity entity = dao.getByEmail(dto.getEmail());
                    if (entity.getPassword().equals(dto.getPassword())) {
                        return "Login successful";
                    } else
                        return "Login failed";
                } else return "Passwords mismatch";
            } else return "Invalid email";
        } else return "Invalid email and password";
    }

    @Override
    public UserDTO getById(int id) {
        Dao dao = new DaoImpl();
        UserEntity entity = dao.getById(id);
        UserDTO dto = new UserDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setGender(entity.getGender());
        dto.setDob(entity.getDob());
        dto.setPassword(entity.getPassword());
        dto.setEmail(entity.getEmail());
        return dto;
    }

    @Override
    public String updatePassword(String password, int id) {
        if (id > 0) {
            if (!(password.equals(""))) {
                Dao dao=new DaoImpl();
                return dao.updatePassword(password,id);
            }else return "Invalid password";
        }else return "Invalid id";
    }
}
