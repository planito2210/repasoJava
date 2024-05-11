package com.ejercicios;

import java.util.Scanner;

//EJERCICIO LECTURA ENTRADA Y OPERACION DE DATOS
public class ejercicio02 {
    /*
     * Realiza un programa que calcule la nota que hace falta sacar en el segundo
     * examen de la asignatura Programación para obtener la media deseada. Hay
     * que tener en cuenta que la nota del primer examen cuenta el 40% y la del
     * segundo examen un 60%. Ejemplo:
     * Introduce la nota del primer examen: 7
     * ¿Qué nota quieres sacar en el trimestre? 8.5
     * Para tener un 8.5 en el trimestre necesitas sacar un 9.5 en el segundo
     * examen.
     */
    public static void main(String[] args) {
        double cal1 = 0, cal2 = 0, des = 0;
        // calificacion 1er examen, calificacion 2do examen y calificacion deseada
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce la calificacion obtenida en el primer examen: ");
        cal1 = Double.parseDouble(s.nextLine());
        System.out.println("Introduce la calificacion que deseas obtener: ");
        des = Double.parseDouble(s.nextLine());
        /*
         * Calculo de calificacion necesaria
         * si cal1=40% y cal2=60%
         * des=cal1*0.4+cal2*0.6
         * despejando cal2
         * cal2=(des-cal1*0.4)/0.6
         */
        cal2 = (des - cal1 * 0.4) / 0.6;
        System.out.println("Necesitas una calificacion de " + cal2 + " en el siguiente examen.");
        if (cal2 > 10)
            System.out.println("Cagaste carnalito");
        s.close();
    }
}