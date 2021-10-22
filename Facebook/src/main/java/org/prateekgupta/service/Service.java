package org.prateekgupta.service;

import org.prateekgupta.dto.UserDTO;

public interface Service {
    String validateAndSave(UserDTO dto);
}
