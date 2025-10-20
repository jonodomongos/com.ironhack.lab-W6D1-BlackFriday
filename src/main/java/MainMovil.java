public class MainMovil {
    public static void main(String[] args) {
        Movil m1 = new Movil("iPhone 17", 1200);
        Movil m2 = new Movil("Samsung Galaxy S25", 999);
        Movil m3 = new Movil("Google Pixel 10", 849);

        System.out.println("=== BLACK FRIDAY ===");
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

        // EXTRA: anular descuento global (todos vuelven al precio original)
        System.out.println("\nEl Black Friday ha terminado.");
        Movil.setDescuento(0.0);

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }
}