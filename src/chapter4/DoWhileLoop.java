package chapter4;

/*Escriba un programa que le permita a un usuario ingresar dos números y luego resuma los dos números.
El usuario debería poder repetir esta acción hasta que indique que ha terminado.*/

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int numero1, numero2;
        int suma;
        boolean again;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Ingrese el primer número");
            numero1 = scanner.nextInt();
            System.out.println("Ingrese el segundo número");
            numero2 = scanner.nextInt();
            suma = numero1 + numero2;
            System.out.println("La suma es de:" + suma);
            System.out.println("Desea continuar? para continuar true o false salir ");
            again = scanner.nextBoolean();

        }while (again);

    }
}
