package lab8p2_emiliocantarero_12111141;


public class Estrella {
    private double distancia;
    private String descripcion;
    private String nombre;

    public Estrella() {
    }

    public Estrella(double distancia, String descripcion, String nombre) {
        this.distancia = distancia;
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
