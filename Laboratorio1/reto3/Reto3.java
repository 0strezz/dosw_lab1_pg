import java.util.stream.IntStream;

public class Reto3 {
    public static String transformarMensaje(String mensaje) {
        StringBuilder builder = new StringBuilder();
        IntStream.range(0, 3)
                .forEach(i -> builder.append(mensaje).append(" "));
        return builder.toString().trim();
    }
}

public class Reto3 {
    public static String transformarMensaje(String mensaje) {
        StringBuffer buffer = new StringBuffer(mensaje);
        return buffer.reverse().toString();
    }
}

