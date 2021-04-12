import generated.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import javax.swing.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args){
        miScanner inst = null;
        miParser parser = null;
        ParseTree tree = null;




        CharStream input=null;
        CommonTokenStream tokens = null;
        MyErrorListener errorListener = null;
        try {
            input = CharStreams.fromFileName("test.txt");
            inst = new miScanner(input);
            tokens = new CommonTokenStream(inst);
            parser = new miParser(tokens);

            errorListener = new MyErrorListener();

            inst.removeErrorListeners();
            inst.addErrorListener( errorListener );

            parser.removeErrorListeners();
            parser.addErrorListener ( errorListener );

            try {
               tree = parser.program();

            }catch(RecognitionException e){
                System.out.println("Error!!!");
                e.printStackTrace();
            }

            if (!errorListener.hasErrors()) {
                System.out.println("Compilación Exitosa!!\n");
                java.util.concurrent.Future<JFrame> treeGUI = org.antlr.v4.gui.Trees.inspect(tree, parser);
                treeGUI.get().setVisible(true);
            }
            else {
                System.out.println("Compilación Fallida!!\n");
                System.out.println(errorListener.toString());
            }

        }
        catch(IOException | InterruptedException | ExecutionException e){
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