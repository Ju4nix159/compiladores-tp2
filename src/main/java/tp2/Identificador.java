package tp2;

public class Identificador {
    private String nombre;
    private TipoDato tipoDato;
    private boolean inicializada;
    private boolean utilizada;

    // Getters y setters

    public Identificador(String text, TipoDato i) {
        this.inicializada = false;
        this.utilizada = false;
        this.nombre = text;
        this.tipoDato = i;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoDato getTipoDato() {
        return tipoDato;
    }

    public void setTipoDato(TipoDato tipoDato) {
        this.tipoDato = tipoDato;
    }

    public boolean isInicializada() {
        return inicializada;
    }

    public void setInicializada(boolean inicializada) {
        this.inicializada = inicializada;
    }

    public boolean isUtilizada() {
        return utilizada;
    }

    public void setUtilizada(boolean utilizada) {
        this.utilizada = utilizada;
    }
}
