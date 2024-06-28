package tp2;
import java.util.List;

public class Funcion extends Identificador {
    private List<TipoDato> argumentos;

    // Getters y setters

    public List<TipoDato> getArgumentos() {
        return argumentos;
    }

    public void setArgumentos(List<TipoDato> argumentos) {
        this.argumentos = argumentos;
    }
}
