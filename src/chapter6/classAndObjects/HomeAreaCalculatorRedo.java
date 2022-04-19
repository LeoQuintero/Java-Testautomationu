package chapter6.classAndObjects;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Creamos una instancia de la clase para incluir los métodos en su estado.
        HomeAreaCalculatorRedo calculadora = new HomeAreaCalculatorRedo();

        // No tuvimos que importar la clase Rectangle porque esta en el mismo paquete
        Rectangle cocina = calculadora.conseguirHabitacion();
        Rectangle baño = calculadora.conseguirHabitacion();

        double area = calculadora.calcularAreaTotal(cocina, baño);

        System.out.println("El area total es de:" + area);

        calculadora.scanner.close();
    }

    private double calcularAreaTotal(Rectangle rectangulo1, Rectangle rectangulo2) {
        return  rectangulo1.calcularArea() + rectangulo2.calcularArea();
    }

    private Rectangle conseguirHabitacion() {

        System.out.println("Ingrese el largo de la habitación: ");
        double largo = scanner.nextDouble();
        System.out.println("Ingrese el ancho de la habitación: ");
        double ancho = scanner.nextDouble();

        return new Rectangle(largo, ancho);
    }
}
