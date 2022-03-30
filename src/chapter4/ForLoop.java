package chapter4;

//Escriba un programa de caja que escanee un número determinado de artículos y calcule el costo

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        // datos de entrada
        int cantidadItems;
        double precio;
        double total = 0;
        System.out.println("cantidad de items");
        Scanner scanner = new Scanner(System.in);
        cantidadItems = scanner.nextInt();


        for(int i=0; i < cantidadItems; i++){
            System.out.println("Igrese el precio del item " + (i+1));
            precio = scanner.nextDouble();
            total += precio;
        }
        scanner.close();
        System.out.println("El precio total es de: $" + total);

    }

}
