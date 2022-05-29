package com.candy.common.lang;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result implements Serializable {
    //200是正常，其他是异常
    private int code;
    private String msg;
    private Object data;

    public  static  Result succ(Object data){
        return succ(200,"查询成功",data);
    }
    public  static  Result succ(int code,String msg,Object data){
        Result r= new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }
    public  static  Result fail(String msg){
        return fail(msg,null);
    }
    public  static  Result fail(String msg,Object data){
        return fail(400,msg,data);
    }
    public  static  Result fail(int code,String msg,Object data){
        Result r= new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }
}
