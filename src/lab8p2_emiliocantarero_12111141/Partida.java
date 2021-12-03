package lab8p2_emiliocantarero_12111141;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;


public class Partida implements Serializable{
    private String nombre;
    private Date fecha;
    ArrayList<Estrella> estrellas = new ArrayList();
    ArrayList<Jugador> jugadores = new ArrayList();

    private static final long SerialVersionUID = 777L;
    
    public Partida() {
    }

    public Partida(String nombre, Date fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Estrella> getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(ArrayList<Estrella> estrellas) {
        this.estrellas = estrellas;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
