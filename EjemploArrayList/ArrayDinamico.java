package EjemploArrayList;

public class ArrayDinamico<T>{
    private Object[] a;

    ArrayDinamico(int size){
        this.a = new Object[size];
    }


    public int length() {
        return a==null?0:a.length;
    }


    public void set(int pos, T v) {
        if(pos > a.length){
            System.out.println("No se puede, esa posición está fuera del array");
        }
        this.a[pos]=v;
    }


    public T remove(int pos) {
        if(this.a.length==1)
            this.a = null;

        Object[] aux = new Object[this.a.length-1];

        for(int i = 0;i<pos;i++)
            aux[i]=this.a[i];

        for(int i = pos+1; i<a.length;i++)
            aux[i]=this.a[i];

        T value = (T)this.a[pos];

        this.a = aux;

        return value;
    }


    public T push(T v) {
        Object[] aux = new Object[this.a.length+1];

        for(int i = 0; i<a.length-1;i++)
            aux[i]=this.a[i];
            
        aux[a.length] = v;

        T value = (T)aux;

        return value;
    }


    public T pop() {
        if(this.a.length==1)
            this.a = null;

        Object[] aux = new Object[this.a.length-1];
        for(int i = 0; i<a.length-1;i++)
            aux[i]=this.a[i];

        T value = (T) this.a[this.a.length-1];
        this.a = aux;

        return value;
    }


    public T get(int pos) {
        return (T) this.a[pos];
    }
}
