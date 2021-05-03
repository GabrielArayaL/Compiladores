package com.Javamaster;


import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
@Service
public class projectService {

    public String main(String body){

        generated.miScanner inst = null;
        generated.miParser parser = null;
        ParseTree tree = null;
        CharStream input=null;
        CommonTokenStream tokens = null;
        MyErrorListener errorListener = null;
        String msj =null;

        input = CharStreams.fromString(body);
        inst = new generated.miScanner(input);
        tokens = new CommonTokenStream(inst);
        parser = new generated.miParser(tokens);

        errorListener = new MyErrorListener();

        inst.removeErrorListeners();
        inst.addErrorListener( errorListener );

        parser.removeErrorListeners();
        parser.addErrorListener ( errorListener );

        try {
            tree = parser.program();
            System.out.println("entre aqui xd");

        }catch(RecognitionException e){
            System.out.println("Error!!!");
            e.printStackTrace();
        }

        if (!errorListener.hasErrors()) {
            System.out.println("Compilación Exitosa!!\n");
            msj="Compilación Exitosa!!\n";
            //java.util.concurrent.Future<JFrame> treeGUI = org.antlr.v4.gui.Trees.inspect(tree, parser);
            //treeGUI.get().setVisible(true);
        }
        else {
            System.out.println("Compilación Fallida!!\n");
            System.out.println(errorListener.toString());
            msj = "Compilación Fallida!!\n" + errorListener.toString();
        }

        return msj;
    }

    public String main2() throws IOException {

        generated.miScanner inst = null;
        generated.miParser parser = null;
        ParseTree tree = null;
        CharStream input=null;
        CommonTokenStream tokens = null;
        MyErrorListener errorListener = null;
        String msj =null;

        input = CharStreams.fromFileName("test.txt");
        inst = new generated.miScanner(input);
        tokens = new CommonTokenStream(inst);
        parser = new generated.miParser(tokens);

        errorListener = new MyErrorListener();

        inst.removeErrorListeners();
        inst.addErrorListener( errorListener );

        parser.removeErrorListeners();
        parser.addErrorListener ( errorListener );

        try {
            tree = parser.program();
            System.out.println("entre aqui xd");

        }catch(RecognitionException e){
            System.out.println("Error!!!");
            e.printStackTrace();
        }

        if (!errorListener.hasErrors()) {
            System.out.println("Compilación Exitosa!!\n");
            msj="Compilación Exitosa!!\n";
            //java.util.concurrent.Future<JFrame> treeGUI = org.antlr.v4.gui.Trees.inspect(tree, parser);
            //treeGUI.get().setVisible(true);
        }
        else {
            System.out.println("Compilación Fallida!!\n");
            System.out.println(errorListener.toString());
            msj = "Compilación Fallida!!\n" + errorListener.toString();
        }

        return msj;
    }
}
