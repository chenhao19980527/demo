package com.example.demo.controller;


import com.example.demo.bean.Person;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


//@ComponentScan("指定Controller") 在主文件中 加配置
@RestController
@Validated // 校验 数据
public class HelloController {

    @RequestMapping("hello")
    public String hello() {
        HashMap map = new HashMap();

        return "hello SpringBoot";
    }

    @RequestMapping(value = "getPerson", method = RequestMethod.POST)
    public Person getPerson() {
        Person person = new Person(1, "zhangsan");
        return person;
    }

    @RequestMapping(value = "getcar/{id}")
    public String demo1(@PathVariable(name = "id") String id, String name) {
        return name + id;
    }

    @RequestMapping(value = "getPerson1")
    public Person getPerson1(@RequestBody Person p) {
        System.out.println(p);
        return p;
    }

    @RequestMapping(value = "getPerson2/{group:[0-9a-zA-Z_]+}")
    public String getPerson2(@PathVariable(name = "group") String url) {
        System.out.println(url);
        return "p";
    }

    @RequestMapping(value = "getPerson3/{group}")
    public String getPerson3(
            @NotBlank(message = "email不能为空") // 元素不能为空
            @Email(message = "不符合邮箱规格")
            @PathVariable(name = "group") String url) {
        System.out.println(url);
        return "p";
    }


}
