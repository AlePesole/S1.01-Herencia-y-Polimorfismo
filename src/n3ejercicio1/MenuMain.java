package n3ejercicio1;

import java.util.Scanner;

public class MenuMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorNoticieroDeportivo gestor = new GestorNoticieroDeportivo();

        boolean menuEjecucion = true;
        while(menuEjecucion) {
            System.out.println("""
                    |---------Gestor-Noticiero-Deportivo---------|
                    | 1) Introducir redactor.                    |
                    | 2) Eliminar redactor.                      |
                    | 3) Introducir noticia en un redactor.      |
                    | 4) Eliminar noticia de un redactor.        |
                    | 5) Mostrar todas las noticias por redactor.|
                    | 6) Calcular precio de la noticia.          |
                    | 7) Calcular puntuación de la noticia.      |
                    | 8) Lista redactores.                       |
                    |--------------------------------------------|
                    | 0) Salir.                                  |
                    |____________________________________________|""");

            System.out.print("Tu elección: ");
            int menuOpcion = sc.nextInt();
            sc.nextLine();
            switch(menuOpcion) {
                case 1: { //Introducir redactor
                    System.out.println("Introducir nombre del redactor:");
                    String nombre = sc.nextLine();
                    System.out.println("Introducir dni del redactor:");
                    String dni = sc.nextLine();

                    Redactor redactor = new Redactor(nombre, dni);
                    boolean completado = gestor.introducirRedactor(redactor);
                    if(!completado) {
                        System.out.println("Redactor no añadido, ya existe un redactor con el mismo dni.");
                    } else {
                        System.out.println("Redactor añadido, " + redactor);
                    }
                    break;
                }
                case 2: { //Eliminar redactor
                    System.out.println("Introducir dni del redactor a eliminar:");
                    String dni = sc.nextLine();
                    boolean completado = gestor.eliminarRedactor(dni);
                    if(!completado) {
                        System.out.println("Redactor no eliminado, no existe un redactor con el dni indicado.");
                    } else {
                        System.out.println("Redactor eliminado correctamente");
                    }
                    break;
                }
                case 3: { //Añadir noticia a un redactor
                    System.out.println("Dni del redactor: ");
                    String dni = sc.nextLine();
                    if(!gestor.existenciaRedactor(dni)) {
                        System.out.println("Dni incorrecto o redactor no existente.");
                        break;
                    }

                    System.out.println("Introducir titular: ");
                    String titular = sc.nextLine();

                    System.out.println("""
                        Deporte de la noticia a añadir:
                        |----------Deportes--------|
                        | 1- Futbol                |
                        | 2- Baloncesto            |
                        | 3- Tenis                 |
                        | 4- Motociclismo          |
                        | 5- F1                    |
                        |__________________________|""");
                    int menuDeporte = sc.nextInt();
                    sc.nextLine();

                    Noticia noticia = switch(menuDeporte) {
                        case 1: {
                            System.out.println("•Noticia de Futbol");
                            System.out.println("Introducir competición: ");
                            String competicion = sc.nextLine();
                            System.out.println("Introducir club: ");
                            String club = sc.nextLine();
                            System.out.println("Introducir jugador: ");
                            String jugador = sc.nextLine();
                            yield new NoticiaFutbol(titular, competicion, club, jugador);
                        }
                        case 2: {
                            System.out.println("•Noticia de Baloncesto");
                            System.out.println("Introducir competición: ");
                            String competicion = sc.nextLine();
                            System.out.println("Introducir club: ");
                            String club = sc.nextLine();
                            yield new NoticiaBaloncesto(titular, competicion, club);
                        }
                        case 3: {
                            System.out.println("•Noticia de Tenis");
                            System.out.println("Introducir competición: ");
                            String competicion = sc.nextLine();
                            System.out.println("Introducir tenista: ");
                            String tenista = sc.nextLine();
                            yield new NoticiaTenis(titular, competicion, tenista);
                        }
                        case 4: {
                            System.out.println("•Noticia de Motociclismo");
                            System.out.println("Introducir equipo: ");
                            String equipo = sc.nextLine();
                            yield new NoticiaMoto(titular, equipo);
                        }
                        case 5: {
                            System.out.println("•Noticia de F1");
                            System.out.println("Introducir escudería: ");
                            String escuderia = sc.nextLine();
                            yield new NoticiaF1(titular, escuderia);
                        }
                        default: {
                            System.out.println("Elección fuera del rango (1-5), noticia no creada");
                            yield null;
                        }
                    };

                    boolean completado = gestor.introducirNoticia(dni, noticia);
                    if(!completado) {
                        System.out.println("Dni no encontrado o noticia no creada");
                    } else {
                        System.out.println("Añadir texto a tu noticia: ");
                        String texto =  sc.nextLine();
                        gestor.modificarTextoNoticia(dni, titular, texto);
                        System.out.println("Noticia añadida correctamente");
                    }
                    break;
                }
                case 4: { //Eliminar noticia de un redactor
                    System.out.println("Dni del redactor: ");
                    String dni = sc.nextLine();
                    System.out.println("Introducir titular a eliminar: ");
                    String titular = sc.nextLine();

                    boolean completado = gestor.eliminarNoticia(dni, titular);
                    if(!completado) {
                        System.out.println("Dni o titular incorrecto, no se pudo eliminar la noticia.");
                    } else {
                        System.out.println("Noticia eliminada correctamente");
                    }
                    break;
                }
                case 5: { //Mostrar Noticias de un redactor
                    System.out.println("Dni del redactor: ");
                    String dni = sc.nextLine();

                    boolean completado = gestor.mostrarNoticiasRedactor(dni);
                    if(!completado) {
                        System.out.println("Dni incorrecto o redactor no existente");
                    }
                    break;
                }
                case 6: { // Calcular precio noticia
                    System.out.println("Dni del redactor: ");
                    String dni = sc.nextLine();
                    System.out.println("Titular de la noticia: ");
                    String titular = sc.nextLine();

                    double precio = gestor.calcularPrecioNoticia(dni, titular);
                    if(precio == -1) {
                        System.out.println("Titular o dni incorrecto");
                    } else {
                        System.out.println("El precio de la noticia es: " + precio + "€");
                    }
                    break;
                }
                case 7: { // Calcular puntuación noticia
                    System.out.println("Dni del redactor: ");
                    String dni = sc.nextLine();
                    System.out.println("Titular de la noticia: ");
                    String titular = sc.nextLine();

                    int puntuacion = gestor.calcularPuntuacionNoticia(dni, titular);
                    if(puntuacion == -1) {
                        System.out.println("Titular o dni incorrecto");
                    } else {
                        System.out.println("La puntuación de la noticia es: " + puntuacion + " puntos");
                    }
                    break;
                }
                case 8: { //Mostrar datos redactores
                    System.out.println("♦ Lista de redactores: ");
                    gestor.listaRedactores();
                    break;
                }
                case 0: { // Salir menu
                    System.out.println("Menu cerrado");
                    menuEjecucion = false;
                    break;
                }
                default: {
                    System.out.println("Opción no reconocida");
                }
            }
        }
    }
}