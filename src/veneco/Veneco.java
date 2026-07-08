/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package veneco;

/**
 *
 * @author cosun
 */
public class Veneco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Productos objProductos1 = new Productos();
        objProductos1.marca = "Nike";
        objProductos1.modelo = "Air Max";
        objProductos1.color = "Blanco";
        objProductos1.precio = "$2500";

        Productos objProductos2 = new Productos();
        objProductos1.marca = "Adidas";
        objProductos2.modelo = "Superstar";
        objProductos2.color = "Negro";
        objProductos2.precio = "$2100";

        Productos objProductos3 = new Productos();
        objProductos1.marca = "Puma";
        objProductos3.modelo = "Suede";
        objProductos3.color = "Azul";
        objProductos3.precio = "$1800";

        Marca objMarca1 = new Marca();
        objMarca1.producto = "Tenis";
        objMarca1.color = "Blanco";
        objMarca1.talla = "27";
        objMarca1.precio = "$2500";

        Marca objMarca2 = new Marca();
        objMarca2.producto = "Sandalias";
        objMarca2.color = "Negro";
        objMarca2.talla = "25";
        objMarca2.precio = "$1200";

        Marca objMarca3 = new Marca();
        objMarca3.producto = "Botas";
        objMarca3.color = "Café";
        objMarca3.talla = "28";
        objMarca3.precio = "$3000";

        Cliente objCliente1 = new Cliente();
        objCliente1.nombre = "Juan";
        objCliente1.apellido = "Pérez";
        objCliente1.edad = "25";
        objCliente1.telefono = "555-1234";

        Cliente objCliente2 = new Cliente();
        objCliente2.nombre = "María";
        objCliente2.apellido = "López";
        objCliente2.edad = "30";
        objCliente2.telefono = "555-5678";

        Cliente objCliente3 = new Cliente();
        objCliente3.nombre = "Carlos";
        objCliente3.apellido = "Gómez";
        objCliente3.edad = "22";
        objCliente3.telefono = "555-9012";

        System.out.println("Productos");
        System.out.println("1: " + objProductos1.marca + " " + objProductos1.modelo + " " + objProductos1.color + " " + objProductos1.precio);
        System.out.println("2: " + objProductos2.marca + " " + objProductos2.modelo + " " + objProductos2.color + " " + objProductos2.precio);
        System.out.println("3: " + objProductos3.marca + " " + objProductos3.modelo + " " + objProductos3.color + " " + objProductos3.precio);

        System.out.println("Marca");
        System.out.println("1: " + objMarca1.producto + " " + objMarca1.color + " " + objMarca1.talla + " " + objMarca1.precio);
        System.out.println("2: " + objMarca2.producto + " " + objMarca2.color + " " + objMarca2.talla + " " + objMarca2.precio);
        System.out.println("3: " + objMarca3.producto + " " + objMarca3.color + " " + objMarca3.talla + " " + objMarca3.precio);

        System.out.println("Cliente");
        System.out.println("1: " + objCliente1.nombre + " " + objCliente1.apellido + " " + objCliente1.edad + " " + objCliente1.telefono);
        System.out.println("2: " + objCliente2.nombre + " " + objCliente2.apellido + " " + objCliente2.edad + " " + objCliente2.telefono);
        System.out.println("3: " + objCliente3.nombre + " " + objCliente3.apellido + " " + objCliente3.edad + " " + objCliente3.telefono);
    }
    
}
