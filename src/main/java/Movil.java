public class Movil {
    private String modelo;
    private double precio;

    // Descuento global (static)
    private static double descuento = 0.20; // 20% por defecto

    public Movil(String modelo, double precio) {
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public static double getDescuento() {
        return descuento;
    }

    public static void setDescuento(double nuevoDescuento) {
        if (nuevoDescuento < 0 || nuevoDescuento > 1) {
            throw new IllegalArgumentException("El descuento debe estar entre 0 y 1.");
        }
        descuento = nuevoDescuento;
    }

    // Precio final con descuento actual
    public double getPrecioConDescuento() {
        return precio * (1 - descuento);
    }

    @Override
    public String toString() {
        if (descuento > 0) {
            // Black Friday activo
            return "Modelo: " + modelo +
                    " | Precio original: " + String.format("%.2f", precio) + "€" +
                    " | Precio con descuento: " + String.format("%.2f", getPrecioConDescuento()) + "€";
        } else {
            // Sin descuento
            return "Modelo: " + modelo +
                    " | Precio actual: " + String.format("%.2f", precio) + "€";
        }
    }
}