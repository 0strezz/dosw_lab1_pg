import java.util.stream.IntStream;
import java.util.function.Function;

public class Reto3 {

    public static void main(String[] args) {
        Function<String, String> procesar = mensaje -> transformarMensaje(mensaje);
        System.out.println(procesar.apply("Hola Mundo"));
    }

    public static String transformarMensaje(String mensaje) {
        StringBuilder builder = new StringBuilder();
        IntStream.range(0, 3)
                 .forEach(i -> builder.append(mensaje).append(" "));
        String repetido = builder.toString().trim();

        StringBuffer buffer = new StringBuffer(repetido);
        return buffer.reverse().toString();
    }
}

