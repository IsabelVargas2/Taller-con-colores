public class Arbol {
    
    private double ancho; 
    private double largo; 
    private String tipo;
    private String color;
    private int edad; 
 
    public Arbol(double ancho, double largo, String tipo, String color, int edad) {
        this.ancho = ancho;
        this.largo = largo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
    }

    //Atributos
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Métodos 
    public void crecer(int anos) {
        this.edad += anos;
    }

    public double calcularSuperficie() {
        return ancho * largo;
    }

    public String mostrarDetalles() {
        return "Tipo: " + tipo + ", Color: " + color + ", Ancho: " + ancho + "m, Largo: " + largo + "m, Edad: " + edad + " años.";
    }

    public String cambiarColor(String nuevoColor) {
        this.color = nuevoColor;
        return "El color del árbol ha sido cambiado a " + nuevoColor;
    }
    
    public boolean esJoven() {
        return edad < 10; 
    }
}
