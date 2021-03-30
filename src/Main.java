import generated.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import sun.rmi.transport.proxy.RMIHttpToPortSocketFactory;

import javax.swing.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args){
        miScanner inst = null;
        miParser parser = null;
        ParseTree tree = null;




        CharStream input=null;
        CommonTokenStream tokens = null;
        try {
            input = CharStreams.fromFileName("test.txt");
            inst = new miScanner(input);
            tokens = new CommonTokenStream(inst);
            parser = new miParser(tokens);

            tree = parser.program();

            System.out.println("Compilación Exitosa !! \n");

            //java.util.concurrent.Future<JFrame> treeGUI = org.antlr.v4.gui.Trees.inspect(tree, parser);
            //treeGUI.get().setVisible(true);

        }/*
        catch(InterruptedException e){
            e.printStackTrace();
        }
        catch(ExecutionException e){
            e.printStackTrace();
        }*/
        catch(IOException e){
            e.printStackTrace();
        }

    }


}

/*
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
 */