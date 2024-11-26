import exception.AritmeticaException;

public interface Aritmetica<T> {

    public T add(T t);
    public T multiply(T t) throws AritmeticaException;
    public T subtract(T t) throws AritmeticaException;
    public T divide(T t);
    
}
