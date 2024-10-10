import java.util.Scanner;

public class Fruteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Producto[] productos = new Producto[2];
        
        // Pedimos los precios sin IVA de cada producto
        System.out.println("Introduce el precio de las manzanas sin IVA: ");
        double precioManzana = sc.nextDouble();
        System.out.println("Introduce el precio de las peras sin IVA: ");
        double precioPera = sc.nextDouble();

        // Creamos los objetos Producto
        productos[0] = new Producto("Manzanas", precioManzana);
        productos[1] = new Producto("Peras", precioPera);

        boolean continuar = true;

        // Bucle para atender varios clientes
        while (continuar) {
            // Pedimos la cantidad de cada fruta
            System.out.print("Introduce la cantidad de peras (kg) que quiere comprar: ");
            double kgPeras = sc.nextDouble();
            System.out.print("Introduce la cantidad de manzanas (kg) que quiere comprar: ");
            double kgManzanas = sc.nextDouble();

            // Calculamos el precio total y mostramos la factura
            System.out.println("\nFactura:");
            System.out.printf("%-10s %10s %10s %10s\n", "Producto", "Cantidad(kg)", "Precio/kg(IVA)", "Total");

            // Factura peras
            double precioConIVA = productos[1].getPrecioConIVA();
            double totalPeras = precioConIVA * kgPeras;
            System.out.printf("%-10s %10.2f %10.2f %10.2f\n", productos[1].getNombre(), kgPeras, precioConIVA, totalPeras);

            // Factura manzanas
            precioConIVA = productos[0].getPrecioConIVA();
            double totalManzanas = precioConIVA * kgManzanas;
            System.out.printf("%-10s %10.2f %10.2f %10.2f\n", productos[0].getNombre(), kgManzanas, precioConIVA, totalManzanas);

            // Mostrar el total final
            double totalFactura = totalPeras + totalManzanas;
            System.out.printf("\nTotal factura: %10.2f\n", totalFactura);

            // Preguntar si desea continuar con otro cliente
            System.out.print("¿Desea atender a otro cliente? (s/n): ");
            String respuesta = sc.next();
            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }
        sc.close();
        System.out.println("Fin del día.");
    }
}