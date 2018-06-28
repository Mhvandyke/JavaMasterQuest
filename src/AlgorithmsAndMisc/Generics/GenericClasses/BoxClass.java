package AlgorithmsAndMisc.Generics.GenericClasses;

public class BoxClass<T> {


    // T stands for "type"

    private T t;


    public void set (T t){this.t = t;}
    public T get(){return t;}

}
