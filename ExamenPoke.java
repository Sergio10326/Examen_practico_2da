package examenpoke;

import java.util.Scanner;

public class ExamenPoke { // Clase main declarada

    public static void main(String[] args) {
        Pokedex pokedex = new PokedexImpl();
        Scanner scanner = new Scanner(System.in); // Escáner necesario para recoger la entrada del usuario por consola e implementar la interfaz
        
        while (true) {
            System.out.println("Bienvenido a la RótomDex (soy de Pokémon Sol y Luna)! Necesitas ayuda con algo?");
            System.out.println(""
                            + ""); // Este tipo de sout se hace para añadir un enter
            System.out.println("1. Añade un nuevo Pokémon a la RótomDex");
            System.out.println("2. Registrar un nuevo ataque para un Pokémon concreto"); // Opciones del menú, se usa un while true y se cambia el valor en case 5
            System.out.println("3. Buscardor de Pokémon");
            System.out.println("4. Listado de las especies registradas");
            System.out.println("5. Salir");
            System.out.println(""
                            + "");
            System.out.print("Ingrese su opción: ");
            int opcion = scanner.nextInt(); // Se recoge en la variable "opcion" lo que ha introducido el usuario
            System.out.println(""
                            + "");
            switch (opcion) {
                case 1:
                    // Agregar un nuevo Pokémon
                    System.out.print("Ingrese el nombre del Pokémon: ");
                    String nombrePokemon = scanner.next();
                    System.out.print("Ingrese el tipo del Pokémon: ");
                    String tipoPokemon = scanner.next();
                    System.out.print("Ingrese el nivel del Pokémon: ");
                    int nivelPokemon = scanner.nextInt();
                    Pokemon nuevoPokemon = new Pokemon(nombrePokemon, tipoPokemon, nivelPokemon);
                    pokedex.agregarPokemon(nuevoPokemon);
                    System.out.println(""
                            + "");
                    System.out.println("¡Pokemon agregado correctamente!");
                    System.out.println(""
                            + "");
                    break;
                case 2:
                    // Registrar un nuevo ataque para un Pokémon
                    System.out.print("Ingrese el nombre del Pokémon al que desea registrar un ataque: ");
                    String nombreBuscar = scanner.next();
                    Pokemon pokemonBuscar = pokedex.buscarPokemon(nombreBuscar);
                    if (pokemonBuscar != null) {
                        System.out.print("Ingrese el nombre del ataque: ");
                        String nombreAtaque = scanner.next();
                        System.out.print("Ingrese el tipo del ataque: ");
                        String tipoAtaque = scanner.next();
                        System.out.print("Ingrese el poder del ataque: ");
                        int poderAtaque = scanner.nextInt();
                        Ataque nuevoAtaque = new Ataque(nombreAtaque, tipoAtaque, poderAtaque);
                        pokemonBuscar.agregarAtaque(nuevoAtaque);
                        System.out.println(""
                            + "");
                        System.out.println("Ataque registrado correctamente para el Pokémon " + nombreBuscar);
                    } else {
                        System.out.println(""
                            + "");
                        System.out.println("El Pokémon " + nombreBuscar + " no está registrado en la RótomDex.");
                        System.out.println(""
                            + "");
                    }
                    System.out.println(""
                            + "");
                    break;
                case 3:
                    // Buscar un Pokémon por su nombre
                    System.out.print("Ingrese el nombre del Pokémon que desea buscar: ");
                    String nombreBuscarPokemon = scanner.next();
                    System.out.println(""
                            + "");
                    pokedex.mostrarInformacionPokemon(nombreBuscarPokemon);
                    System.out.println(""
                            + "");
                    break;
                case 4:
                    // Mostrar todos los Pokémon registrados
                    pokedex.mostrarInformacion();
                    System.out.println(""
                            + "");
                    break;
                case 5:
                    // Salir del programa, se cambia el valor del true inicial del bucle con System.exit(0).
                    System.out.println("¡Espero verte pronto!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida."); // Se comprueba que la opción introducida por el usuario sea una de las disponibles en el menú
            }
        }
    }
}

