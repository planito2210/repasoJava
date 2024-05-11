package com.ejercicios;

import java.util.Scanner;

//EJERCICIO LECTURA Y SALIDA DATOS
public class ejercicio01 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = s.nextLine();
        System.out.print("Introduce tu edad: ");
        int edad = Integer.parseInt(s.nextLine());
        System.out.println("Tu nombre es " + nombre + " y tu edad es " + edad);
        s.close();
    }
}