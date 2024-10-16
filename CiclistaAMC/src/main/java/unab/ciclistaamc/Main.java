/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package unab.ciclistaamc;

public class Main {
    public static void main(String[] args) {
            
        CiclistaAMC ciclista = new CiclistaAMC("Carlos", 28, "Team AMC", 45.5, 12);
        
  
        Bicicleta bicicleta = new Bicicleta("Giant", 7.8, "Carretera");
        
        
        Equipo equipo = new Equipo("Team AMC", 2);
        
      
        Competencia competencia = new Competencia("Vuelta a Colombia", "Bogotá");
        
        
        System.out.println("Nombre del ciclista: " + ciclista.getNombre());
        System.out.println("Marca de la bicicleta: " + bicicleta.getMarca());
        System.out.println("Nombre del equipo: " + equipo.getNombre());
        System.out.println("Ubicación de la competencia: " + competencia.getUbicacion());
    }
}


class CiclistaAMC {
    private String nombre;
    private int edad;
    private String equipo;
    private double velocidadMaxima;
    private int numeroCompetencias;

    public CiclistaAMC(String nombre, int edad, String equipo, double velocidadMaxima, int numeroCompetencias) {
        this.nombre = nombre;
        this.edad = edad;
        this.equipo = equipo;
        this.velocidadMaxima = velocidadMaxima;
        this.numeroCompetencias = numeroCompetencias;
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

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getNumeroCompetencias() {
        return numeroCompetencias;
    }

    public void setNumeroCompetencias(int numeroCompetencias) {
        this.numeroCompetencias = numeroCompetencias;
    }
}


class Bicicleta {
    private String marca;
    private double peso;
    private String tipo;

    public Bicicleta(String marca, double peso, String tipo) {
        this.marca = marca;
        this.peso = peso;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}


class Equipo {
    private String nombre;
    private int ranking;

    public Equipo(String nombre, int ranking) {
        this.nombre = nombre;
        this.ranking = ranking;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
}


class Competencia {
    private String nombre;
    private String ubicacion;

    public Competencia(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}


