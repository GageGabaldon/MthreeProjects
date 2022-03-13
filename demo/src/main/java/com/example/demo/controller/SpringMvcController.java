/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ggman
 */
@RestController
@RequestMapping("/api")
public class SpringMvcController {
    
    @GetMapping
    public String[] helloWorld() {
        String[] result = {"Hello", "World", "!"};
        return result;
    }
    
    
}
