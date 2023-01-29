/**
 * 13 Modifica el programa Gestisimal realizado anteriormente añadiendo las siguientes mejoras:
 * • Utiliza una lista en lugar de un array para el almacenamiento de los datos.
 * 
 * • Comprueba la existencia del código en el alta, la baja y la modificación de
 * artículos para evitar errores.
 * 
 * • Cambia la opción “Salida de stock” por “Venta”. Esta nueva opción permitirá hacer una venta de varios artículos y 
 * emitir la factura correspondiente.
 * 
 * Se debe preguntar por los códigos y las cantidades de cada artículo que
 * se quiere comprar. Aplica un 21% de IVA.
 * 
 * @author jotaeme
 */

package Ejercicios.Ejercicio13;

import java.util.*;

public class Ejercicio13 {
    //! PARA AÑADIR LOS ELEMENTOS A ESTE ARRAY
    static ArrayList <Articulo> a = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //! PARA OBTENER LOS ELEMENTOS
        HashMap <String, Integer> lineas = new HashMap<>();
        //! PARA LA OPCIÓN DEL SWITCH
        int opcion = 0;
        int opcion2 = 0;
        //! DATOS QUE INTRODUCE EL USUARIO
        String codigo = "";
        String descripcion = "";
        double precioV;
        double precioC;
        int stock = 0;
        //! PARA SABER LA POSICION DEL ARTICULO EN EL ARRAY
        int i = 0;
        //! PARA MODIFICAR LOS DATOS DE PRECIOS Y STOCK
        String precioCString = "";
        String precioVString = "";
        String stockString = "";
        //! PARA EL TOTAL DE LAS FACTURAS
        int elementosFactura = 0;
        int unidades = 0;
        double subtotal;
        double baseImponible;

        do {
            System.out.println("\n\nG E S T I S I M A L");
            System.out.println("===================");
            System.out.println("1. Listado");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Modificación");
            System.out.println("5. Entrada de mercancía");
            System.out.println("6. Venta");
            System.out.println("7. Salir");
            System.out.print("Introduzca una opción: ");
            opcion = Integer.parseInt(System.console().readLine());

            switch (opcion) {
                case 1:
                    System.out.println("\nLISTADO\n=======");
                    //! LISTAMOS TODO EL ARRAYLIST DE Articulo
                    for(Articulo articulos : a) {
                        System.out.println(articulos);
                    }
                    break;

                case 2:
                    System.out.println("\nNUEVO ARTÍCULO\n==============");
                    System.out.println("Código: ");
                    //! VEMOS SI EXISTE O NO EL CÓDIGO INTRODUCIDO
                    do {
                        codigo = sc.nextLine();
                        if(posicion(codigo) == -1){
                            System.out.println("Ese código ya existe, dime otro: ");
                        }
                    } while (posicion(codigo) != -1);
                    //! CUANDO NO EXISTA SE SALDRÁ DEL DO-WHILE Y LE DAREMOS LOS VALORES
                    System.out.println("Descripción: ");
                    descripcion = sc.nextLine();
                    System.out.print("Precio de compra: ");
                    precioC = Double.parseDouble(System.console().readLine());
                    System.out.print("Precio de venta: ");
                    precioV = Double.parseDouble(System.console().readLine());
                    System.out.print("Stock: ");
                    stock = Integer.parseInt(System.console().readLine());
                    //! AÑADIMOS AL ARRAYLIST UN NUEVO ARTICULO CON LOS DATOS QUE NOS DA EL USUARIO
                    a.add(new Articulo(codigo, descripcion, precioC, precioV, stock));

                    break;

                case 3:
                    System.out.println("\nBAJA\n====");
                    System.out.print("Por favor, introduzca el código del artículo: ");
                    codigo = System.console().readLine();
                    //! SI NO EXISTE EL ARTICULO
                    if (posicion(codigo) == -1) {
                        System.out.println("Lo siento, el código introducido no existe.");
                        //! SI EXISTE LA FUNCION posicion NOS DARA EL INDICE Y LA PODREMOS BORRAR
                    } else {
                        a.remove(posicion(codigo));
                        System.out.println("articulo borrado.");
                    }
                    break;

                case 4:
                    System.out.println("\nMODIFICACIÓN\n============");
                    System.out.print("Por favor, introduzca el código del artículo cuyos datos desea cambiar: ");
                    
                    do {
                        codigo = sc.nextLine();
                        if (posicion(codigo) == -1) {
                            System.out.println("Lo siento, ese código no existe, dime otro:");
                        }
                    } while (posicion(codigo) != -1);
                    //! LE DAMOS AL ÍNDICE i EL VALOR DE LA POSICIÓN EN EL ARRAYLIST DEL ARTÍCULO, ASÍ AL HACER get(i) IREMOS A ESE ELEMENTO
                    i = posicion(codigo);

                    System.out.println("Dime los nuevos datos: ");
                    System.out.println("Código: " + a.get(i).getCodigo());
                    System.out.print("Nuevo código: ");
                    codigo = sc.nextLine();
                    if (!codigo.equals("")) {
                        a.get(i).setCodigo(codigo);
                    }

                    System.out.println("Descripción: " + a.get(i).getDescripcion());
                    System.out.print("Nueva descripción: ");
                    descripcion = sc.nextLine();
                    if (!descripcion.equals("")) {
                        a.get(i).setDescripcion(descripcion);
                    }

                    System.out.println("Precio de compra: " + a.get(i).getPrecioDeCompra());
                    System.out.print("Nuevo precio de compra: ");
                    precioCString = sc.nextLine();
                    if (!precioCString.equals("")) {
                        a.get(i).setPrecioDeCompra(Double.parseDouble(precioCString));
                    }

                    System.out.println("Precio de venta: " + a.get(i).getPrecioDeVenta());
                    System.out.print("Nuevo precio de venta: ");
                    precioVString = System.console().readLine();
                    if (!precioVString.equals("")) {
                        a.get(i).setPrecioDeVenta(Double.parseDouble(precioVString));
                    }

                    System.out.println("Stock: " + a.get(i).getStock());
                    System.out.print("Nuevo stock: ");
                    stockString = System.console().readLine();
                    if (!stockString.equals("")) {
                        a.get(i).setStock(Integer.parseInt(stockString));
                    }

                    break;

                case 5:
                    System.out.println("\nENTRADA DE MERCANCÍA\n====================");
                    System.out.print("Por favor, introduzca el código del artículo: ");
                    
                    do {
                        codigo = sc.nextLine();
                        if(posicion(codigo) == -1){
                            System.out.println("Lo siento eae código no existe, dime otro:");
                        }
                    } while (posicion(codigo) != -1);

                    i = posicion(codigo);
                    System.out.print("Entrada de mercancía del siguiente artículo: " + a.get(i));

                    System.out.println("¿Cuánta cantidad ha entrado?");
                    stock = Integer.parseInt(sc.nextLine());
                    a.get(i).setStock(stock + a.get(i).getStock());
                    System.out.println("La mercancía ha entrado en el almacén.");

                    break;

                case 6:
                    System.out.println("\nVENTA\n=====");
                    do {
                        System.out.println("\n1. Añadir artículo");
                        System.out.println("2. Generar factura");
                        System.out.println("3. Cancelar");
                        System.out.print("Introduzca una opción: ");
                        opcion2 = Integer.parseInt(sc.nextLine());

                        switch (opcion2) {
                            case 1:
                                System.out.print("Por favor, introduzca el código del artículo: ");
                                codigo = System.console().readLine();
                                i = posicion(codigo);
                                if (i == -1) {
                                System.out.println("No hay ningún artículo con ese código.");
                                } else{
                                    System.out.println(a.get(i));
                                    if(lineas.containsKey(codigo)){
                                        elementosFactura = lineas.get(codigo);
                                    } else{
                                        elementosFactura = 0;
                                    }
                                    System.out.println("Unidades en la factura provisional: " + elementosFactura);
                                    System.out.print("Unidades que quiere incorporar a la factura: ");
                                    unidades = Integer.parseInt(sc.nextLine());
                                    //! SI ES MENOR EL STOCK QUE LO QUE SE QUIERE
                                    if ((a.get(i).getStock()) - elementosFactura < unidades) {
                                        System.out.println("No hay suficiente stock");
                                        //! SI HAY SUFICIENTE, SE BUSCA SI EL HASMAP TIENE ESE CODIGO
                                    } else if (lineas.containsKey(codigo)) {
                                        //! SE AÑADE AL HASMAP DICHO ELEMENTO PERO SUMANDOLE LA CANTIDAD DE UNIDADES QUE TIENE
                                        lineas.put(codigo, lineas.get(codigo) + unidades);
                                        } else {
                                        lineas.put(codigo, unidades);
                                    }
                                }

                                System.out.println("\n\n CÓDIGO | DESCRIPCIÓN | UNIDADES | PRECIO UNID. | SUBTOTAL");
                                System.out.println("------------------------------------------------------------------");
                                for (Map.Entry pareja: lineas.entrySet()) {
                                    codigo = pareja.getKey().toString();
                                    i = posicion(codigo);
                                    unidades = Integer.parseInt(pareja.getValue().toString());
                                    subtotal = unidades * a.get(i).getPrecioDeVenta();
                                    System.out.printf(" %6s | %17s | %8d | %12.2f | %8.2f\n", codigo, a.get(i).getDescripcion(), unidades, a.get(i).getPrecioDeVenta(), subtotal);
                                }

                                break;

                            case 2:
                                baseImponible = 0;
                                System.out.println("\n\n CÓDIGO | DESCRIPCIÓN | UNIDADES | PRECIO UNID. | SUBTOTAL");
                                System.out.println("----------------------------------------------------------------");

                                for (Map.Entry pareja: lineas.entrySet()) {
                                    //! EL CODIGO ES CADA CLAVE DEL HASHMAP
                                    codigo = pareja.getKey().toString();
                                    //! SE BUSCA SU INDICE
                                    i = posicion(codigo);
                                    //! LAS UNIDADES PASAA SER CADA VALOR DEL HASHMAP PASADO A STRING
                                    unidades = Integer.parseInt(pareja.getValue().toString());
                                    subtotal = unidades * a.get(i).getPrecioDeVenta();
                                    //! IMPRIMIMOS POR PANTALLA
                                    System.out.printf(" %6s | %15s | %8d | %12.2f | %8.2f\n", codigo, a.get(i).getDescripcion(), unidades, a.get(i).getPrecioDeVenta(), subtotal);
                                    baseImponible += subtotal;
                                    a.get(i).setStock(a.get(i).getStock() - unidades); // decrementa el stock
                                }

                                System.out.println("----------------------------------------------------------------");
                                System.out.printf(" BASE IMPONIBLE: %8.2f \n", baseImponible);
                                System.out.printf(" IVA (21%%): %8.2f \n", baseImponible * 0.21);
                                System.out.printf(" TOTAL: %8.2f \n", baseImponible * 1.21);
                                System.out.println("\n\nFactura generada.\nPulse INTRO para volver al menú principal.");
                                sc.nextLine();

                                break;

                            default:
                                break;
                        }
                    }while (opcion2 != 3);
                }   
        } while (opcion!=7);
        sc.close();
    }

    /**
     * ESTA FUNCIÓN LA USAREMOS PARA SABER SI UN CÓDIGO EXISTE O NO
     * @param codigo
     * @return Posición del artículo o -1 si no existe 
     */
    static public int posicion(String codigo) {
        int i = -1;
        for (Articulo aux : a) {
            i++;
            if (aux.getCodigo().equals(codigo)) {
                return i;
            }
        }
        return -1;
    }
}
