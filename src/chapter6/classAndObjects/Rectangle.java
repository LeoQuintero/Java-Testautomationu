package chapter6.classAndObjects;

public class Rectangle {
    // variables globales conocidos también como campos
    // principio de POO es encapsulamiento dond elos campos son privados
    private double largo;
    private double ancho;

    // Default Constructor - porque no tiene lista de parámetros
    public Rectangle() {
        largo = 0;
        ancho = 0;
    }

    public Rectangle(double largo, double ancho ) {
        this.largo = largo;
        setAncho(ancho);
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double  getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double calcularPerimetro() {
        return (2 * largo) + (2 * ancho);
    }

    public double calcularArea() {
        return ancho * largo;
    }

}
