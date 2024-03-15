package examenpoke;

import java.util.ArrayList;
import java.util.HashMap; // Importadas las librerías necesarias
import java.util.Map;

public class Pokemon {
    private String nombre;
    private String tipo;
    private int nivel;
    private ArrayList<Ataque> ataques; // Se crea un ArrayList para almacenar aquí los atributos de los ataques
    private Map<String, String> informacionAdicional; // Se crea un Map para almacenar la información de los Pokémon y asociar la búsqueda a futuro con el nombre directamente,de esta forma queda el nombre como clave.

    public Pokemon(String nombre, String tipo, int nivel) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        this.ataques = new ArrayList<>();
        this.informacionAdicional = new HashMap<>(); // Se usa HashMap ya que el orden en la RótomDex original va por número, no por nombre u orden alfabético, y es la opción más similar sin añadir una opción no pedida en el examen
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

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void agregarAtaque(Ataque ataque) {
        this.ataques.add(ataque);
    }

    public ArrayList<Ataque> getAtaques() {
        return this.ataques;
    }

    public void agregarInformacionAdicional(String clave, String valor) {
        this.informacionAdicional.put(clave, valor);
    }

    public String obtenerInformacionAdicional(String clave) {
        return this.informacionAdicional.get(clave);
    }

    public Map<String, String> getInformacionAdicional() {
        return this.informacionAdicional;
    }
}
