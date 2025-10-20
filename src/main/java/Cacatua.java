public class Cacatua {
    public static int cantidadMinimaCacahuetes = 100;

    private String nombre;

    public Cacatua(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public static String hablar() {
        return "Cacatúa cacahuete!";
    }
}