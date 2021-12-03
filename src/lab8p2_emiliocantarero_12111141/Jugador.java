package lab8p2_emiliocantarero_12111141;

import java.io.IOException;
import java.io.Serializable;
import javax.swing.JOptionPane;

public class Jugador implements Serializable{

    private String nombre;
    private double velocidad;

    private static final long SerialVersionUID = 222L;
    
    public Jugador() {
    }

    public Jugador(String nombre, double velocidad) throws IOException {

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
