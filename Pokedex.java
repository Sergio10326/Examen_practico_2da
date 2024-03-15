package examenpoke;

public interface Pokedex {
    void agregarPokemon(Pokemon pokemon);
    Pokemon buscarPokemon(String nombre); // Se usa la interfaz para permitir la utilización de todos estos métodos generados en anteriores clases con la implementación de la RótomDex
    void mostrarInformacion();
    void mostrarInformacionPokemon(String nombre);
}
