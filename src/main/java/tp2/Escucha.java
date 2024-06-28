package tp2;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import tp2.compiladorParser.DeclaracionContext;
import tp2.compiladorParser.InstruccionContext;
import tp2.compiladorParser.ProgramaContext;
import tp2.compiladorParser.BloqueContext;

public class Escucha extends compiladorBaseListener {
    private Integer nodos = 0;
    private Integer hojas = 0;
    private TablaSimbolos tablaSimbolos = new TablaSimbolos();

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        // TODO Auto-generated method stub
        nodos++;
        // System.out.println("Entro a NODO");
    }

    @Override
    public void enterInstruccion(InstruccionContext ctx) {
        // TODO Auto-generated method stub
        // System.out.println("Entro a INSTRUCCION");
    }

    @Override
    public void enterPrograma(ProgramaContext ctx) {
        // TODO Auto-generated method stub

        System.out.println("Comienza la compilacion");
        tablaSimbolos.addContexto();
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        // TODO Auto-generated method stub
        // System.out.println("Salgo de NODO");
    }

    @Override
    public void exitPrograma(ProgramaContext ctx) {
        // TODO Auto-generated method stub
        System.out.println("Fin de la compilacion");
        tablaSimbolos.mostrarTablaSimbolos();
        tablaSimbolos.delContexto();
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        // TODO Auto-generated method stub
        hojas++;
        System.out.println("Estoy en una HOJA --> " + node.getText());
    }
    
    @Override
    public void enterDeclaracion(DeclaracionContext ctx) {

        System.out.println(" inicio : " + ctx.getText());
    }

    @Override
    public void exitDeclaracion(DeclaracionContext ctx) {
        String tipo = ctx.getChild(0).getText();
        System.out.println("  tipo  : " + tipo);

        String nombre = ctx.getChild(1).getText();
        System.out.println("  nombre: " + nombre);

        TipoDato tipoDato;
        if (tipo.equals("int")) {
            tipoDato = TipoDato.INT;
        }
        else if (tipo.equals("float")) {
            tipoDato = TipoDato.FLOAT;
        }
        else{
            tipoDato = TipoDato.STRING;
        }
        Identificador identificador = new Identificador(nombre, tipoDato);
        tablaSimbolos.addIdentificador(identificador);
        System.out.println("  fin   : " + ctx.getText());

    }

    @Override
    public String toString() {
        return "Escucha [nodos=" + nodos + ", hojas=" + hojas + "]";
    }

    @Override
    public void enterBloque(BloqueContext ctx) {
        System.out.println("entrando a un nuevo contexto");
        tablaSimbolos.addContexto();
    }
    @Override
    public void exitBloque(BloqueContext ctx) {
        System.out.println("saliendo de un contexto");
        tablaSimbolos.mostrarTablaSimbolos();
        tablaSimbolos.delContexto();
    }
    
}
