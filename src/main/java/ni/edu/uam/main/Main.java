package ni.edu.uam.main;

import ni.edu.uam.modelos.Producto;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

      /*  Set<String> productos = new HashSet<>();

        productos.add("mouse");
        productos.add("auriculares");
        productos.add("Mouse");
        productos.add("teclado");

         for (String p : productos){
             System.out.println(p);

         }*/

        Set<Producto> catalogo = new HashSet<>();
        Producto cafe = new Producto("presto Libra", 350, 50  );
        Producto teclado = new Producto("Teclado Logitech", 500, 60  );
        Producto camara = new Producto("Camara sony", 30000, 4  );

        catalogo.add(cafe);
        catalogo.add(teclado);
        catalogo.add(camara);

        for (Producto p : catalogo) {
            System.out.println(p);


        }   }
}
