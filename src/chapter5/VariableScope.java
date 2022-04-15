package chapter5;
/*Escriba un programa de 'verificación de crédito instantánea' que apruebe a cualquiera que
gane más de $25,000 y tenga un puntaje de crédito de 700 o mejor. Rechazar todos los demás.*/

import java.util.Scanner;

public class VariableScope {
    // Inicializamos variables
    // Son variable globales para la clase
    static int salarioRequerido = 25000;
    static int scoreRequerido = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // variables locales para el método
        double salario = obtenerSalario();
        int creditScore =  obtenerScoreCredito();
        scanner.close();
        boolean calificacion =  calificaciónUsuario(creditScore,salario);

        // Notifica al usuario
        notificarUsuario(calificacion);

    }


    public static double obtenerSalario() {
        System.out.println("Ingresar su salario");
        double salario = scanner.nextDouble();
        return salario;
    }
    public static int obtenerScoreCredito() {
        System.out.println("Ingresar su puntaje de crédito");
        int score = scanner.nextInt();
        return score;
    }

    private static boolean calificaciónUsuario(int creditScore, double salario) {
        if(creditScore >= scoreRequerido && salario >= salarioRequerido ) {
            return true;
        }
        else{
            return false;
        }
    }

    private static void notificarUsuario(boolean estaCalificado) {
        if (estaCalificado) {
            System.out.println( "Felicitaciones!! ha sido aprobado");
        }
        else {
            System.out.println("Lo sentimos, Se ha rechazado");
        }

    }

}
