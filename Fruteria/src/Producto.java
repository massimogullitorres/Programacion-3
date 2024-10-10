class Producto {
    private String nombre;
    private double precioSinIVA;
    private static final double IVA = 1.10; 

    // Constructor
    public Producto(String nombre, double precioSinIVA) {
        this.nombre = nombre;
        this.precioSinIVA = precioSinIVA;
    }

    // Método para obtener el nombre del producto
    public String getNombre() {
        return nombre;
    }

    // Método para obtener el precio sin IVA
    public double getPrecioSinIVA() {
        return precioSinIVA;
    }

    // Método para obtener el precio con IVA
    public double getPrecioConIVA() {
        return precioSinIVA * IVA;
    }
}