package Exceptions;

public class ExcepcionExistencia extends Exception {
    public ExcepcionExistencia() {
        super("El valor a comprar sobrepasa la existencia del producto." +
                "\nInt"+ 'é' +"ntelo nuevamente...");
    }
}
