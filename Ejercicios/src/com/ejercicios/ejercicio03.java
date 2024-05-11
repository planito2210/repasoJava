package com.ejercicios;

import java.util.Scanner;

//EJERCICIO BUCLES Y DECISIONES
public class ejercicio03 {
    /*
     * Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce
     * su jugada y luego el usuario 2. Si alguno de los usuarios introduce una
     * opción incorrecta, el programa deberá mostrar un mensaje de error.
     * Ejemplo 1:
     * Turno del jugador 1 (introduzca piedra, papel o tijera): papel
     * Turno del jugador 2 (introduzca piedra, papel o tijera): papel
     * Empate
     * Ejemplo 2:
     * Turno del jugador 1 (introduzca piedra, papel o tijera): papel
     * Turno del jugador 2 (introduzca piedra, papel o tijera): tijera
     * Gana el jugador 2
     * Ejemplo 3:
     * Turno del jugador 1 (introduzca piedra, papel o tijera): piedra
     * Turno del jugador 2 (introduzca piedra, papel o tijera): tijera
     * Gana el jugador 1
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String jug1, jug2;// jugadas
        boolean jug1v = false, jug2v = false;// banderas de jugadas validas
        boolean jug1g = false, jug2g = false; // banderas de jugador ganador
        System.out.println("Jugador 1 introduzca su jugada (piedra, papel o tijera): ");
        jug1 = s.nextLine();
        // se verifica la entrada
        while (!jug1v) {
            // si es una jugada valida, la bandera se vuelve true
            switch (jug1) {
                case "piedra":
                case "papel":
                case "tijeras":
                    jug1v = true;
                    break;
                // si es jugada invalida, la bandera se vuelve false
                default:
                    jug1v = false;
                    break;
            }
            if (!jug1v) {
                // si la entrada es invalida, se debe reingresar y validar de nuevo
                System.out.println("Jugada invalida, vuelva a ingresarla: ");
                jug1 = s.nextLine();
            }
            // si la entrada es valida no se cicla con while
        }
        System.out.println("Jugador 2 introduzca su jugada (piedra, papel o tijera): ");
        jug2 = s.nextLine();
        while (!jug2v) {
            // si es una jugada valida, la bandera se vuelve true
            switch (jug2) {
                case "piedra":
                case "papel":
                case "tijeras":
                    jug2v = true;
                    break;
                // si es jugada invalida, la bandera se vuelve false
                default:
                    jug2v = false;
                    break;
            }
            if (!jug2v) {
                // si la entrada es invalida, se debe reingresar y validar de nuevo
                System.out.println("Jugada invalida, vuelva a ingresarla: ");
                jug2 = s.nextLine();
            }
            // si la entrada es valida no se cicla con while
        }
        // se evalua la jugada 1
        switch (jug1) {
            case "piedra":
                // si la jugada fue piedra, se determina el ganador dependiendo de la jugada 2
                switch (jug2) {
                    case "piedra":
                        // empate, nadie gana
                        jug1g = false;
                        jug2g = false;
                        System.out.println("Piedra vs Piedra = Empate.");
                        break;
                    case "papel":
                        // papel vence, jugador 2 gana
                        jug1g = false;
                        jug2g = true;
                        System.out.println("Piedra vs Papel = Papel vence.");
                        break;
                    default:
                        // debido a las validaciones previas, el unico caso que pudiera haber es
                        // tijeras, quienes pierden contra piedra, gana jugador 1
                        jug1g = true;
                        jug2g = false;
                        System.out.println("Piedra vs Tijeras = Piedra vence.");
                        break;
                }
                break;
            case "papel":
                // si la jugada fue papel, se determina el ganador dependiendo de la jugada 2
                switch (jug2) {
                    case "piedra":
                        // papel vence, jugador 1 gana
                        jug1g = true;
                        jug2g = false;
                        System.out.println("Papel vs Piedra = Papel vence.");
                        break;
                    case "papel":
                        // empate, nadie gana
                        jug1g = false;
                        jug2g = false;
                        System.out.println("Papel vs Papel = Empate.");
                        break;
                    default:
                        // debido a las validaciones previas, el unico caso que pudiera haber es
                        // tijeras, quienes ganan contra papel, gana jugador 2
                        jug1g = false;
                        jug2g = true;
                        System.out.println("Papel vs Tijeras = Tijeras vence.");
                        break;
                }
                break;
            default:
                // debido a las validaciones previas, el unico caso que falta es tijeras, se
                // determina el ganador dependiendo de la jugada 2
                switch (jug2) {
                    case "piedra":
                        // piedra vence, jugador 2 gana
                        jug1g = false;
                        jug2g = true;
                        System.out.println("Tijeras vs Piedra = Piedra vence.");
                        break;
                    case "papel":
                        // tijeras vencen, jugador 1 gana
                        jug1g = true;
                        jug2g = false;
                        System.out.println("Tijeras vs Papel = Tijeras vence.");
                        break;
                    default:
                        // debido a las validaciones previas, el unico caso que pudiera haber es
                        // tijeras, produciendo empate, nadie gana
                        jug1g = false;
                        jug2g = false;
                        System.out.println("Tijeras vs Tijeras = Empate.");
                        break;
                }
                break;
        }
        if (jug1g) {
            System.out.println("Jugador 1 gana.");
        } else if (jug2g) {
            System.out.println("Jugador 2 gana.");
        } else
            System.out.println("Nadie gana.");
        s.close();
    }
}
