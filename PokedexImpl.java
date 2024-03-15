package examenpoke;

import java.util.ArrayList;

public class PokedexImpl implements Pokedex {
    private ArrayList<Pokemon> pokemones;

    public PokedexImpl() {
        this.pokemones = new ArrayList<>();
    }

    public void agregarPokemon(Pokemon pokemon) {
        pokemones.add(pokemon);
    }

    public Pokemon buscarPokemon(String nombre) {
        for (Pokemon pokemon : pokemones) {
            if (pokemon.getNombre().equalsIgnoreCase(nombre)) {
                return pokemon;
            }
        }
        return null; // Si no se encuentra el Pokémon, se devuelve null
    }

    public void mostrarInformacion() {
        System.out.println("Pokémon registrados en la Pokédex:");
        System.out.println(""
                            + "");
        for (Pokemon pokemon : pokemones) {
            System.out.println("Nombre: " + pokemon.getNombre());
            System.out.println("Tipo: " + pokemon.getTipo());
            System.out.println("Nivel: " + pokemon.getNivel());
            ArrayList<Ataque> ataques = pokemon.getAtaques();
            System.out.println("Ataques:");
            for (Ataque ataque : ataques) {
                System.out.println("- Nombre: " + ataque.getNombre()); // Método implementado
                System.out.println("  Tipo: " + ataque.getTipo());
                System.out.println("  Poder: " + ataque.getPoder());
            }
            if (!pokemon.getInformacionAdicional().isEmpty()) {
                System.out.println("Información adicional:");
                for (String clave : pokemon.getInformacionAdicional().keySet()) {
                    System.out.println("- " + clave + ": " + pokemon.obtenerInformacionAdicional(clave)); // Se imprime la información
                }
            }
            System.out.println("---------------------");
        }
    }

    public void mostrarInformacionPokemon(String nombre) {
        Pokemon pokemon = buscarPokemon(nombre);
        if (pokemon != null) {
            System.out.println("Información de " + nombre + ":");
            System.out.println("Nombre: " + pokemon.getNombre());
            System.out.println("Tipo: " + pokemon.getTipo());
            System.out.println("Nivel: " + pokemon.getNivel());
            ArrayList<Ataque> ataques = pokemon.getAtaques();
            System.out.println("Ataques:");
            for (Ataque ataque : ataques) {
                System.out.println("- Nombre: " + ataque.getNombre());
                System.out.println("  Tipo: " + ataque.getTipo());
                System.out.println("  Poder: " + ataque.getPoder());
            }
            if (!pokemon.getInformacionAdicional().isEmpty()) {
                System.out.println("Información adicional:");
                for (String clave : pokemon.getInformacionAdicional().keySet()) {
                    System.out.println("- " + clave + ": " + pokemon.obtenerInformacionAdicional(clave));
                }
            }
        } else {
            System.out.println("El Pokémon " + nombre + " no está registrado en la Pokédex."); // Se controlan posibles errores a la hora de introducir el nombre
        }
    }
}
