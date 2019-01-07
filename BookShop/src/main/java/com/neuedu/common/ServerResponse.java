package com.neuedu.common;

import lombok.Data;

/**
 * f服务端返回到前端高复用的相应对象
 */
@Data
public class ServerResponse<T> {
    private int status; //返回到前端的状态码
    private  T data;//返回给前端的数据
    private  String msg;//当status!=0时，封装了错误信息
}
