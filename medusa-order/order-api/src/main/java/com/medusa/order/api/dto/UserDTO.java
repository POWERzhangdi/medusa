package com.medusa.order.api.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDTO implements Serializable {

    private static final long serialVersionUID = -2461315939096833750L;
    private Long userId;

    private String name;

    private String url;

    public UserDTO() {
    }
}
