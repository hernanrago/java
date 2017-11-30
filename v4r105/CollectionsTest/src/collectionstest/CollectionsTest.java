/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionstest;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import static java.lang.System.out;

/**
 *
 * @author hernan
 */
public class CollectionsTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String a="a";
        String b="b";
        String c="c";
        String d="d";
        String e="e";
        
        out.println("ArrayList");
        ArrayList<String> arrayList = new ArrayList<>();
        out.println("Tamaño inicial: "+arrayList.size());
        arrayList.add(a);
        arrayList.add(b);
        arrayList.add(c);
        arrayList.add(d);
        arrayList.add(e);
        arrayList.add(1,"a2");
        out.println("Tamaño: "+arrayList.size());
        out.println("Contenido: "+arrayList+" | Posición [2]: "+arrayList.get(2));
        arrayList.remove(b);
        out.println("Contenido del ArrayList luego de remover 'b': "+arrayList+
                " | Posición [2]: "+arrayList.get(2));
        arrayList.remove(2);
        out.println("Contenido del ArrayList luego de remover la posición [2]: "+
                arrayList+" | Posición [2]: "+arrayList.get(2));
        out.println("Tamaño: "+arrayList.size());
        String string[]=new String[arrayList.size()];
        string=arrayList.toArray(string);
        for(String forString:string)
            out.println(forString);
        
        out.println("");
        
        out.println("LinkedList");
        LinkedList l = new LinkedList();
        l.add(a);
        l.add(b);
        l.add(c);
        l.add(d);
        l.add(e);
        l.add(1,"a2");
        out.println("Contenido original del LinkedList: "+l+" | Posición [2]: "+l.get(2));
        l.remove(b);
        out.println("Contenido luego de remover 'b': "+l+" | Posición [2]: "+l.get(2));
        l.remove(2);
        out.println("Contenido luego de remover [2]: "+l+" | Posición [2]: "+l.get(2));
        out.println("Tamaño: "+l.size());
        l.removeFirst();
        out.println("Contenido luego de removeFirst(): "+l+" | Posición [2]: "+l.get(2));
        l.removeLast();
        out.println("Contenido luego de removeLast(): "+l+" | Posición [1]: "+l.get(1));
        
    
    
    }  
    
}
