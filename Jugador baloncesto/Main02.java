
public class Main02 {
   
    static class Jugador {
       
        private String nombre;
        private int edad;
        private String posicion;
        private int numero;
        private String equipo;

      
        public Jugador(String nombre, int edad, String posicion, int numero, String equipo) {
            this.nombre = nombre;
            this.edad = edad;
            this.posicion = posicion;
            this.numero = numero;
            this.equipo = equipo;
        }

       
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getPosicion() {
            return posicion;
        }

        public void setPosicion(String posicion) {
            this.posicion = posicion;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public String getEquipo() {
            return equipo;
        }

        public void setEquipo(String equipo) {
            this.equipo = equipo;
        }

      
        public void entrenar() {
            System.out.println(nombre + " está entrenando para mejorar su tiro.");
        }

        public void jugar() {
            System.out.println(nombre + " está jugando en la posición de " + posicion + ".");
        }

        public void anotarPunto() {
            System.out.println(nombre + " ha anotado un punto.");
        }

        public void hacerAsistencia() {
            System.out.println(nombre + " ha hecho una asistencia.");
        }

        public void mostrarDatos() {
            System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Posición: " + posicion + ", Número: " + numero + ", Equipo: " + equipo);
        }
    }

    public static void main(String[] args) {
       
        Jugador[] jugadores = new Jugador[3];

        jugadores[0] = new Jugador("LeBron James", 39, "Ala-pívot", 23, "Los Angeles Lakers");
        jugadores[1] = new Jugador("Stephen Curry", 36, "Base", 30, "Golden State Warriors");
        jugadores[2] = new Jugador("Kevin Durant", 35, "Ala", 7, "Phoenix Suns");

        
        for (int i = 0; i < jugadores.length; i++) {
            System.out.println("Jugador " + (i + 1) + ": " + jugadores[i].getNombre());
        }

        for (Jugador jugador : jugadores) {
            jugador.mostrarDatos();
        }
    }
}
