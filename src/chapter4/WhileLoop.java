package chapter4;

/*Cada empleado de la tienda gana $15 por hora.Escriba un programa que le permita a un gerente
ingresar el número de horas semanales trabajadas por cada empleado y calcular su salario.No permita horas extras.*/

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        //    Datos de entrada
        int tarifaHora = 15;
        double salario;
        double horasTrabajadas;
        int maximoHorasSemana = 40;

        System.out.println("Ingrese las horas laboradas por semana:");
        Scanner scanner = new Scanner(System.in);
        horasTrabajadas = scanner.nextDouble();

        while (horasTrabajadas > maximoHorasSemana || horasTrabajadas < 1){
            System.out.println("ingrese un valor menor o igual 40 como horas laboradas");
            horasTrabajadas = scanner.nextDouble();
        }

        scanner.close();
        salario = horasTrabajadas*tarifaHora;
        System.out.println("El salario es de: $" + salario);

    }


}
