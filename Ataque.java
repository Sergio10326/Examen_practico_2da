package examenpoke;

public class Ataque {
    private String nombre;
    private String tipo; // Clase con los atributos necesarios para los ataques creada
    private int poder;

    public Ataque(String nombre, String tipo, int poder) {
        this.nombre = nombre;
        this.tipo = tipo; // Método declarado, se recogen los atributos de la clase
        this.poder = poder;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
}
