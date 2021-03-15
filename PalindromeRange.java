import java.util.Scanner;

public class PalindromeRange extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the start and end range of integers:");
		int startRange = scanner.nextInt();
		int endRange = scanner.nextInt();

		int result = addPalindromes(startRange, endRange);

		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {
	public static int addPalindromes(int startRange, int endRange) {

		int palindromeSum = 0;

		for (int i = startRange; i <= endRange; i++) {

			int sum = 0;
			int number = i;

			while (number > 0) {

				int remainder = number % 10;
				sum = sum * 10 + remainder;
				number /= 10;

			}

			if (sum == i)
				palindromeSum += i;

		}

		return palindromeSum;

	}
}