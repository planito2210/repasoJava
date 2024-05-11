
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Estudiante {
    private String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}

public class Leo01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        List<Estudiante> alumnosList = new ArrayList<>();
        int n;

        System.out.print("Ingrese el número de alumnos a registrar: ");
        n = Integer.parseInt(teclado.nextLine());

        if (n <= 0)
            System.out.println("No es válido el número ingresado");
        else {
            for (int i = 0; i < n; i++) {
                System.out.println("Ingrese el nombre del alumno " + (i + 1) + ": ");
                nombre = teclado.nextLine();
                alumnosList.add(new Estudiante(nombre));
            }
        }
        for (Estudiante e : alumnosList)
            System.out.println(e);
        teclado.close();
    }

}
