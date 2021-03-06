package com.example.demo.controllers;

import com.example.demo.utils.Utils;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ejercicio {
    // http://localhost:8080/
    @GetMapping("/")
    public String greet(){
        return "Bienvenido al servidor backend de Angela";
    }
    // http://localhost:8080/aleatorio
    @GetMapping("/aleatorio")
    public String numberRandom(){
        long r = Math.round(Math.random()*100);
        return r + "";
    }
    //http://localhost:8080/palindromo/ana
    @GetMapping("/palindromo/{name}")
    public String Palindrome(@PathVariable String name){
        boolean palindrome = Utils.isPalindrome(name);
        return palindrome ? "Si es palindormo" : "No es palindromo";
       // if  (name.equals(reversedName)) return "Si es palindromo";
       // else return "No es palindromo";
    }
}
