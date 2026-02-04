import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarreraParalela {
	public void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese la primera serie de numeros:");
		Result numbers1 = calc(scanner.nextLine());

		System.out.println("Ingrese la segunda serie de numeros:");
		Result numbers2 = calc(scanner.nextLine());

		System.out.println("resultados (primera linea): " + numbers1.toString());
		System.out.println("resultados (segunda linea): " + numbers2.toString());
	}

	public static Result calc(String numbers){
		List<Integer> listNumbers = Arrays.stream(numbers.split(" "))
			.map(x -> Integer.parseInt(x))
			.collect(Collectors.toList());

		int max = listNumbers.stream().max(Integer::compareTo).orElse(0);
		int min = listNumbers.stream().min(Integer::compareTo).get();

		return new Result(max, min, listNumbers.size());
	}
}
