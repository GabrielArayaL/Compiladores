import generated.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;



import javax.swing.*;
import java.io.FileReader;
import java.util.List;

public class Main {
    public static void main(String[] args){
        miScanner inst = null;

        CharStream input=null;
        CommonTokenStream tokens = null;

        try {
            input = CharStreams.fromFileName("test.txt");
            inst = new miScanner(input);

            List<Token> lista = (List<Token>) inst.getAllTokens();
            for (Token t : lista)
            System.out.println(miScanner.VOCABULARY.getSymbolicName(t.getType()) + ":" + t.getText() + "\n");
        }
        catch(Exception e){System.out.println("No hay archivo");e.printStackTrace();}
    }
}

