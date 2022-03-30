package chapter4;


//Encuentre los puntajes promedio de las pruebas para cada estudiante en la clase. Hay 24 estudiantes y 4 pruebas.

import java.util.Scanner;

public class NestedLoops{
    public static void main(String[] args) {
        int numeroEstudiantes = 24;
        int numeroPruebas = 4;
        double puntaje;
        double total = 0;
        double promedio = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<numeroEstudiantes;i++){
            for (int j=0; j<numeroPruebas;j++){
                System.out.println("ingrese el puntaje de la prueba #" + (j+1));
                puntaje = scanner.nextDouble();
                total += puntaje;

            }
            promedio = total/numeroPruebas;
            System.out.println("El puntaje promedio del estudiante " + (i+1) + " es de "+ promedio);
        }
    }

}
