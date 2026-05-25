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
       /************************************************************************************/
        Producto Laptop = new Producto("Lenovo Thinkpad", 30000, 10  );
        Producto celular = new Producto("Samsung S24 Ultra ", 25000, 15  );
        Producto componentes = new Producto("Grafica  5060 ", 45000, 10);
        Producto tablet = new Producto("iPad Pro 11", 18000, 20);
        Producto auriculares = new Producto("Sony Ericzon", 6500, 30);
        Producto reloj = new Producto("Steam Deck", 12000, 12);
        Producto consola = new Producto("PlayStation 5", 10500, 25);


        catalogo.add(cafe);
        catalogo.add(teclado);
        catalogo.add(camara);
        /************************/
        catalogo.add(Laptop);
        catalogo.add(celular);
        catalogo.add(componentes);
        catalogo.add(tablet);
        catalogo.add(auriculares);
        catalogo.add(reloj);
        catalogo.add(consola);

        for (Producto p : catalogo) {
            System.out.println(p);


        }   }
}
