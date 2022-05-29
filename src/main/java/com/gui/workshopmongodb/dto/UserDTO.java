package com.gui.workshopmongodb.dto;

import com.gui.workshopmongodb.domain.User;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

public @Data class UserDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private String id;
    private String name;
    private String email;

    public UserDTO() {

    }

    public UserDTO(User obj) {
        id = obj.getId();
        name = obj.getName();
        email = obj.getEmail();
    }

}
