package org.example;

public class Main {
   public static void main(String[] args) {
       // System.out.println("Hello world!");

       Calculator cal = new Calculator();

       cal.multiplication(2,3);
       cal.division(4,2);

       System.out.println(cal.multiplication(2,3));
       System.out.println(cal.division(4,2));
    }


}