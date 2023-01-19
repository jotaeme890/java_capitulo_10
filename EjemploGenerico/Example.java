package EjemploGenerico;
public class Example {
    public static void main(String[] args) {
        MyObject<Integer> o1 = new MyObject <Integer>(10);
        MyObject<String> o2 = new MyObject <String>("Hola");

        System.out.println("Objeto 1: " + o1.get());
        System.out.println("Objeto 2: " + o2.get());

        Pair<String, MyObject<Integer>> p1 = new Pair<String, MyObject<Integer>>("Clave 1:",new  MyObject<>(10));
        Pair<String, MyObject<Double>> p2 = new Pair<String, MyObject<Double>>("Clave 2:",new  MyObject<>(10.5));
        
        //AL FINAL SE HACE UN p1.getValue().get() YA QUE p1.getValue() DEVUELVE UN OBJETO DE TIPO V, ES DECIR MyObject Y ESTA CLASE A SU VEZ TIENE EL MÉTODO .get PARA OBTENER LOS DATOS
        System.out.println("Pair 1: " + "Key: "+ p1.getKey() + " Value: " + p1.getValue().get());
        System.out.println("Pair 2: " + "Key: "+ p2.getKey() + " Value: " + p2.getValue().get());
    }
}
