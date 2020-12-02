package com.example.redflix;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import com.example.redflix.vistas.Ventana;


@SpringBootApplication
public class RedflixApplication {

    public static void main(String[] args) {
       
        new Ventana().setVisible(true);

    }
    public static void ejecutarSpring(){
        String[] argVacio = {};
        SpringApplication.run(RedflixApplication.class, argVacio);
    }

}
