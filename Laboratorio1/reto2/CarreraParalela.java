import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarreraParalela {
	public void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first line of numbers:");
		Result numbers1 = calc(scanner.nextLine());

		System.out.println("Enter second line of numbers:");
		Result numbers2 = calc(scanner.nextLine());

		System.out.println("First line results: " + numbers1.toString());
		System.out.println("Second line results: " + numbers2.toString());
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
