package EjemploGenerico;
public class MyObject <T> {
    private T value;

    public MyObject(){
        this.value = null;
    }

    public MyObject(T v){
        this.value = v;
    }

    public T get(){
        return this.value;
    }

    public void set(T v){
        this.value = v;
    }
}

/*
public class Array<T>{
    private T[] array;

    public void add(T object){    
        array[1] = object;
    }
}

    // Array dinamico
    ArrayDinamico<Integer> a1 = new ArrayDinamico<Integer>();
    ArrayDinamico<Double> a2 = new ArrayDinamico<Double>();
*/
