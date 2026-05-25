package ni.edu.uam.main;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> productos = new HashSet<>();

        productos.add("mouse");
        productos.add("auriculares");
        productos.add("Mouse");
        productos.add("teclado");

         for (String p : productos){
             System.out.println(p);

         }

    }
}