package com.dongwt.java.problems.model;

/**
 * Created by dongwt on 2018/1/29.
 */
public enum SexEnums {

    MAN(1,"男"),WOMAN(2,"女") ;

    private Integer code;

    private String desc;

    SexEnums(Integer code,String desc){
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
