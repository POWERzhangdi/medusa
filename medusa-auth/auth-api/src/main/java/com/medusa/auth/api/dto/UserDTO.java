package com.medusa.auth.api.dto;

import com.medusa.common.constant.Const;
import lombok.Data;

import java.io.Serializable;

@Data
public class UserDTO implements Serializable {
    private static final long serialVersionUID = -7515847906354890165L;

    private Long userId = Const.CONST_LONG_PACKAGE;

    private String name = Const.CONST_STRING;

    private String url = Const.CONST_STRING;

}
