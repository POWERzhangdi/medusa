package com.medusa.auth.controller.vo;

import com.medusa.common.constant.Const;
import lombok.Data;

@Data
public class UserWebVO {

    private Long userId = Const.CONST_LONG_PACKAGE;

    private String name = Const.CONST_STRING;

    private String url = Const.CONST_STRING;

}
