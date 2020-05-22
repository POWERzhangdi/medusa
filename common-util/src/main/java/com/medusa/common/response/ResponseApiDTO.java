package com.medusa.common.response;

import lombok.Data;

import java.io.Serializable;


@Data
public class ResponseApiDTO<T> implements Serializable {

    private static final long serialVersionUID = 1065512248033883560L;
    private int code;

    private String msg;

    private T data;

    public static <T> ResponseApiDTO<T> SUCCESS(T data) {
        ResponseApiDTO<T> dto = new ResponseApiDTO<>();
        dto.setCode(200);
        dto.setMsg("成功");
        dto.setData(data);
        return dto;
    }

    public static <T> ResponseApiDTO<T> SUCCESS() {
        ResponseApiDTO<T> dto = new ResponseApiDTO<>();
        dto.setCode(200);
        dto.setMsg("成功");
        return dto;
    }

    public static <T> ResponseApiDTO<T> FAILURE() {
        ResponseApiDTO<T> dto = new ResponseApiDTO<>();
        dto.setCode(500);
        dto.setMsg("失败");
        return dto;
    }

    public static <T> ResponseApiDTO<T> FAILURE(String msg) {
        ResponseApiDTO<T> dto = new ResponseApiDTO<>();
        dto.setCode(501);
        dto.setMsg(msg);
        return dto;
    }
}
