package Exceptions;

public class ExcepcionValor extends Exception {
    ExcepcionValor(){
        super("El valor no es v" + 'á' + "lido." +
                "Int"+ 'é' +"ntelo nuevamente.");
    }
}
