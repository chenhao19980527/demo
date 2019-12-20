package com.example.demo.bean;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor  //带参构造函数
@NoArgsConstructor   //无参构造函数
public class Person {

    private Integer id;
    private String name;
//    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",timezone = "GTM+8")
//    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
//    private Date createTime;

}
