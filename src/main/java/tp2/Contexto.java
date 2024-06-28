package tp2;

import java.util.HashMap;
import java.util.Map;

public class Contexto {
    private Map<String, Identificador> identificadores = new HashMap<>();
    

    // Métodos para manejar los identificadores
    public void addIdentificador(Identificador identificador) {
        // Implementación para agregar un identificador
        identificadores.put(identificador.getNombre(), identificador);
        System.out.println("Identificador agregado: " + identificador.getNombre() + identificadores.size());
        
    }

    public Identificador buscarIdentificador(String nombre) {
        // Implementación para buscar un identificador
        
        
        return null;
    }

    public void mostrarIdentificadores() {
        System.out.println("Identificadores del contexto" + identificadores.size());

        for (Map.Entry<String, Identificador> entry : identificadores.entrySet()) {
            System.out.println("Identificador: " + entry.getKey());
            System.out.println("Tipo: " + entry.getValue().getTipoDato());
            System.out.println("Inicializada: " + entry.getValue().isInicializada());
            System.out.println("Utilizada: " + entry.getValue().isUtilizada());
            System.out.println("---------------");

        }
    }

    // Getters y setters
    public Map<String, Identificador> getIdentificadores() {
        return identificadores;
    }

    public void setIdentificadores(Map<String, Identificador> identificadores) {
        this.identificadores = identificadores;
    }

}
