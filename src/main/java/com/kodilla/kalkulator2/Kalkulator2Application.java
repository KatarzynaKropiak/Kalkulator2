package com.kodilla.kalkulator2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Kalkulator2Application {

        public static int addition(int a, int b) {
            return a + b;
        }

        public static int subtraction(int a, int b) {
            return a - b;
        }

        public static void main(String[] args) {
            SpringApplication.run(Kalkulator2Application.class, args);

            int a = 3;
            int b = 4;
            System.out.println(a + " - " + b + " = " + subtraction(a, b));
            System.out.println(a + " + " + b + " = " + addition(a, b));
        }

    }


