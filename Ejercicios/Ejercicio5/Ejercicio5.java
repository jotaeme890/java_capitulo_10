/**
 * 5 Realiza de nuevo el ejercicio de la colección de discos pero utilizando esta vez
 * una lista para almacenar la información sobre los discos en lugar de un array
 * convencional. Comprobarás que el código se simplifica notablemente ¿Cuánto
 * ocupa el programa original hecho con un array? ¿Cuánto ocupa este nuevo
 * programa hecho con una lista?
 * 
 * @author jotaeme
 */

package Ejercicios.Ejercicio5;

import java.util.*;


public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList<Discos> n = new ArrayList<>();

        int opcion = 0;
        int i = 0;
        int opcionListado;

        String codigoIntro;
        String titulo;
        String autor;
        String genero;
        int duracion;
        String duracionIntroducidaString;

        do {
            System.out.println();
            System.out.println("¿Qué es lo que quiere hacer? ");
            System.out.println("1. Crear Disco");
            System.out.println("2. Borrar Disco");
            System.out.println("3. Listar Discos");
            System.out.println("4. Modificar Disco");
            System.out.println("5. Salir");
            System.out.print("Opción: ");

            opcion = Integer.parseInt(sc.nextLine());


            switch (opcion) {
                case 1:
                    System.out.println();
                    System.out.println("Alta de artículo");
                    System.out.println("----------------");

                    System.out.print("Dime el código del nuevo disco: ");
                    
                    codigoIntro = sc.nextLine();
                    //BUSCAREMOS DICHO DISCO CON UN CODIGO IGUAL AL INTRODUCIDO PARA VER SI EXISTE EN EL ARRAYLIST
                    while (n.contains(new Discos(codigoIntro,"", "", "", 0))) {
                        System.out.println("Ese código ya existe, dime otro:");
                        System.out.print("Introduzca otro código: ");
                        codigoIntro = sc.next();
                    }

                    System.out.print("Título: ");
                    titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    autor = sc.nextLine();
                    System.out.print("Género: ");
                    genero =sc.nextLine();
                    System.out.print("Duración: ");
                    duracion = Integer.parseInt(sc.nextLine());
                    //AÑADIMOS UN NUEVO DISCO AL RRAYLIST CON LOS DATOS INTRODUCIDOS
                    n.add(new Discos(codigoIntro, titulo, autor,genero,duracion));
                    break;

                case 2:
                    System.out.println();
                    System.out.println("Borrar disco");
                    System.out.println("-----------------------------");
                    System.out.println("Dime el código del disco que quieres borrar: ");
                    codigoIntro = sc.nextLine();
                    System.out.print(codigoIntro);
                    //SI NO CONTIENE EL ARRAYLIST UN DISCO CON ESE CÓDIGO ES QUE NO EXISTE
                    if (!n.contains(new Discos(codigoIntro,"", "", "", 0))) {
                        System.out.println("Lo siento, el código introducido no existe.");
                    } else {
                        //ASÍ BORRAMOS EL DISCO CON LA PRIMERA INCIDENCIA EN EL CÓDIGO QUE LE PASAMOS
                        n.remove(n.indexOf(new Discos(codigoIntro,"", "", "", 0)));
                        System.out.println("Album borrado correctamente");
                    }
                    break;

                case 3:
                    System.out.println();
                    System.out.println("Listado de artículos");
                    
                    System.out.println("--------------------");

                    do {
                    System.out.println("1. Completo");
                    System.out.println("2. Por autor");
                    System.out.println("3. Por género");
                    System.out.println("4. En un rango de duración");
                    System.out.println("5. Menú principal");
                    System.out.print("Introduzca una opción: ");
                    opcionListado = Integer.parseInt(sc.nextLine());

                    switch (opcionListado) {
                        case 1:
                        //EN ESTE CASO SOLO LISTAREMOS TODO EL ARRAY
                            for (Discos discos : n) {
                                System.out.println(discos);
                            }
                            break;

                        case 2:
                            System.out.print("Introduzca el autor: ");
                            autor = sc.nextLine();

                            for (Discos discos : n) {
                                if (discos.getAutor().equals(autor)) {
                                System.out.println(discos);
                                }
                            }
                            break;

                        case 3:
                            System.out.print("Introduzca el género: ");
                            genero = sc.nextLine();

                            for (Discos discos : n) {
                                if (discos.getGenero().equals(genero)) {
                                System.out.println(discos);
                                }
                            }
                            break;

                        case 4:
                            System.out.print("Introduzca el rango mínimo de duracion: ");
                            int limiteinf = Integer.parseInt(sc.nextLine());
                            System.out.print("Introduzca el rango máximo de duracion: ");

                            int limitemax = Integer.parseInt(sc.nextLine());
                            for (Discos discos : n) {
                                if (discos.getDuracion()<=limitemax && discos.getDuracion()>=limiteinf) {
                                System.out.println(discos);
                                }
                            }
                            break;
                    
                        default:
                            break;
                    }
                    } while (opcionListado !=5 );

                    break;

                case 4:
                    System.out.println();
                    System.out.println("Modificar disco");
                    System.out.println("-----------------------------");
                    System.out.print("Por favor, dime el código del disco cuyos datos desea cambiar: ");
                    codigoIntro = sc.nextLine();
                    //SI EL ARRAYLIST NO CONTIENE ESE CÓDIGO ES QUE NO EXISTE
                    while (!n.contains(new Discos(codigoIntro,"", "", "", 0))) {
                    System.out.print("Ese código no existe.\nDime otro código: ");
                    codigoIntro = sc.nextLine();
                    }
                    //AHORA VAMOS A BUSCAR EL ÍNDICE QUE TIENE EL DISCO CON EL CODIGO INTRODUCIDO   
                    i = n.indexOf(new Discos(codigoIntro,"", "", "", 0));
                    //GRACIAS AL GET PODEMOS BUSCAR EL ELEMENTO EN ESA POSICION, POR LO QUE AL TENER EL ÍNDICE GUARDADO CON LA PRIMERA OCURRENCIA DEL DISCO, SABEMOS A QUE DISCO NOS REFERIMOS
                    System.out.println("Dime los nuevos datos del disco o INTRO para dejarlos igual");
                    System.out.println("Código: " + n.get(i).getCodigo());

                    System.out.print("Nuevo código: ");
                    codigoIntro = sc.nextLine();
                    if (!codigoIntro.equals("")) {
                        n.get(i).setCodigo(codigoIntro);
                    }

                    System.out.println("Autor: " + n.get(i).getAutor());
                    System.out.print("Nuevo autor: ");
                    autor = sc.nextLine();
                    if (!autor.equals("")) {
                        n.get(i).setAutor(autor);
                    }

                    System.out.println("Título: " + n.get(i).getTitulo());
                    System.out.print("Nuevo título: ");
                    titulo = sc.nextLine();
                    if (!titulo.equals("")) {
                        n.get(i).setTitulo(titulo);
                    }

                    System.out.println("Género: " + n.get(i).getGenero());
                    System.out.print("Nuevo género: ");
                    genero = sc.nextLine();
                    if (!genero.equals("")) {
                        n.get(i).setGenero(genero);
                    }

                    System.out.println("Duración: " + n.get(i).getDuracion());
                    System.out.print("Duración: ");
                    duracionIntroducidaString = sc.nextLine();
                    if (!duracionIntroducidaString.equals("")) {
                        n.get(i).setDuracion(Integer.parseInt(duracionIntroducidaString));
                    }
                    break;
            
                default:
                    break;
            }
        } while (opcion!=5);
        sc.close();
    }
}
