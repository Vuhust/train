package com.mycompany.train.controller;

import com.mycompany.train.aop.anotation.MapResult;
import com.mycompany.train.entiry.User;
import com.mycompany.train.model.UserModel;
import com.mycompany.train.repository.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class MyController {


    private final UserRepo userRepo;

    @GetMapping("/add")
    public String sayHello() {
        userRepo.save(new User());
        return "Hello, World!";
    }

    @GetMapping("/get")
    @MapResult
    public Object echo() {
        System.out.println(1);
        List<Map<String,Object>> data = userRepo.findsdsds(10);
        userRepo.getAllByPassword(null);
        return 1;
    }
}
