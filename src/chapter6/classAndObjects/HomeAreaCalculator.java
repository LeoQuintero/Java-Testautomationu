package chapter6.classAndObjects;

public class HomeAreaCalculator {
    public static void main(String[] args) {
        /**************************
         *RECTANGLE1
         ***************************/

        // Creamos una instancia de la clase rectángulo
        Rectangle habitacion1 = new Rectangle(); // inicialmente largo y ancho estan inicializados con 0 por el dafault constructor
        habitacion1.setAncho(25);
        habitacion1.setLargo(50);
        double areaDeHabitación1 = habitacion1.calcularArea();
        //System.out.println("el area de la habitación 01 es de: " + areaDeHabitación1);

        /**************************
         *RECTANGLE2
         ***************************/
        Rectangle habitacion2 = new Rectangle(30, 75);
        double areaDeHabitacion2 = habitacion2.calcularArea();

        double totalAreas = areaDeHabitación1 + areaDeHabitacion2;

        System.out.println("El área total de las dos habitaciones es de: " + totalAreas );
    }
}
