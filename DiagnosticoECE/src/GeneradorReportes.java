public class GeneradorReportes {
    private String tituloReporte = "Reporte Mensual";
    private static int contadorDescargas = 0;

    public static void imprimirTitulo() {
        System.out.println("Título: " + tituloReporte);
    }

    public static void incrementarDescargas() {
        this.contadorDescargas++;
    }

    public void generar() {
        static int codigoGeneracion = 101;
        System.out.println("Generando " + tituloReporte + " con código " + codigoGeneracion);
    }
}
/*
1. ¿Qué mensaje exacto emite el compilador javac para el Error 1? ¿Por qué no puede acceder a tituloReporte?
2. ¿Por qué el uso de this carece de sentido dentro de un método static?
3. ¿Por qué las variables locales dentro de un método no pueden ser declaradas como static?
 */