package lab8p2_emiliocantarero_12111141;


public class Jugador {
    private String nombre;
    private double velocidad;

    public Jugador() {
    }

    public Jugador(String nombre, double velocidad) {
        this.nombre = nombre;
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
