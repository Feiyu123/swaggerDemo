package com.example.swagger.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created By Liurenquan on 2018/11/17
 */
@Data  //生成Getter,Setter,equals,hashCode,toString方法
@Builder //表示可以进行Builder方式初始化
@AllArgsConstructor //提供一个包含所有变量的构造方法
@NoArgsConstructor //提供一个无参构造方法
public class User {

    private int id;
    private String username;
    private int age;
    private Date ctm;
}
