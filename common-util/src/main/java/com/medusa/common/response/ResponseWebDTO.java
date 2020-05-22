package com.medusa.common.response;

import lombok.Data;

@Data
public class ResponseWebDTO<T> {

    private int code;

    private String msg;

    private T data;

    public static <T> ResponseWebDTO<T> SUCCESS(T data) {
        ResponseWebDTO<T> dto = new ResponseWebDTO<>();
        dto.setCode(200);
        dto.setMsg("成功");
        dto.setData(data);
        return dto;
    }

    public static <T> ResponseWebDTO<T> SUCCESS() {
        ResponseWebDTO<T> dto = new ResponseWebDTO<>();
        dto.setCode(200);
        dto.setMsg("成功");
        return dto;
    }

    public static <T> ResponseWebDTO<T> FAILURE() {
        ResponseWebDTO<T> dto = new ResponseWebDTO<>();
        dto.setCode(500);
        dto.setMsg("失败");
        return dto;
    }

    public static <T> ResponseWebDTO<T> FAILURE(String msg) {
        ResponseWebDTO<T> dto = new ResponseWebDTO<>();
        dto.setCode(501);
        dto.setMsg(msg);
        return dto;
    }

}
