import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Reto6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String command = extractCommand(input);

        executeCommand(command);
    }

    public static void executeCommand(String command) {
        Map<String, Runnable> actions = createActions();
        switch (command) {
            case "SALUDAR":
            case "DESPEDIR":
            case "CANTAR":
            case "DANZAR":
            case "BROMEAR":
            case "GRITAR":
            case "SUSURRAR":
            case "ANALIZAR":
                actions.get(command).run();
                break;
            default:
                System.out.println("Comando no reconocido.");
        }
    }

    private static String extractCommand(String input) {
        int start = input.indexOf("\"");
        int end = input.lastIndexOf("\"");
        if (start == -1 || end == -1 || start == end) {
            return "";
        }
        return input.substring(start + 1, end);
    }

    private static Map<String, Runnable> createActions() {
        Map<String, Runnable> actions = new HashMap<>();
        actions.put("SALUDAR", () ->
        );
        actions.put("DESPEDIR", () ->
        );
        actions.put("CANTAR", () ->
        );
        actions.put("DANZAR", () ->
        );
        actions.put("BROMEAR", () ->
        );
        actions.put("GRITAR", () ->
        );
        actions.put("SUSURRAR", () ->
        );
        actions.put("ANALIZAR", () ->
        );
        return actions;
    }
}
