package chapter5;

import java.util.Scanner;

//escriba un método que le pregunte a un usuario su nombre, luego lo salude por su nombre
public class Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.next();
        saludarPorNombre(nombre);
    }

    public static void saludarPorNombre(String nombre) {
        System.out.println("Hola " + nombre);

    }
}
