package org.prateekgupta.service;

import org.prateekgupta.dto.LoginDTO;
import org.prateekgupta.dto.UserDTO;

public interface Service {
    String validateAndSave(UserDTO dto);
    UserDTO getById(int id);
    String validateAndLogin(LoginDTO dto);
    String updatePassword(String password,int id);
}
