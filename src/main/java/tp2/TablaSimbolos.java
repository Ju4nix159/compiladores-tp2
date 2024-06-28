package tp2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TablaSimbolos {
    private List<Contexto> contextos = new ArrayList<>();

    public void addContexto() {
        // Implementación para agregar un contexto
        contextos.add(new Contexto());

    }

    public void delContexto() {
        // Implementación para eliminar un contexto
        contextos.remove(contextos.size() - 1);

    }

    public Identificador buscarIdentificador(String nombre) {
        // Implementación para buscar un identificador en todos los contextos
        return null;
    }

    public Identificador buscarIdentificadorLocal(String nombre) {
        // Implementación para buscar un identificador en el contexto actual
        return null;
    }

    public void addIdentificador(Identificador identificador) {
        // Implementación para agregar un identificador al contexto actual
        contextos.get(contextos.size() - 1).addIdentificador(identificador);
    }

    public void mostrarTablaSimbolos() {
        System.out.println("Tabla de simbolos" + contextos.size());
        if (contextos.isEmpty()) {
            System.out.println("No hay contextos");
            return;
        }
        for (Contexto contexto : contextos) {
            Map<String, Identificador> identificadores = contexto.getIdentificadores();
            for (Identificador identificador : identificadores.values()) 
            {

            }
            contexto.mostrarIdentificadores();
            System.out.println("===============");
        }
    }
}
