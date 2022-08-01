import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static String greeting = "Привет! Я проверяю, являются ли строки палиндромом.";
    public static String stringForCheck;
    public static boolean lineIsPalindrome = true;
    public static boolean isCheckingLines = true;

    public static void main(String[] args) {
        System.out.println(greeting);
        Scanner scanner = new Scanner(System.in);

        while (isCheckingLines) {
            System.out.println("Введите строку: ");
            stringForCheck = scanner.nextLine();
            lineIsPalindrome = palindromeCheck(stringForCheck);

            if (lineIsPalindrome) {
                System.out.println("Введенная строка — это палиндром");
            } else {
                System.out.println("Строка не являктся палиндромом");
            }
            System.out.println("\nХотите проверить еще строку?\nВведите «да» или «нет»");

            String answer;
            while (scanner.hasNext()) {
                answer = scanner.nextLine();
                if (answer.equalsIgnoreCase("нет")) {
                    isCheckingLines = false;
                    System.out.println("Хорошо. До встречи :)");
                    break;
                } else if (!answer.equalsIgnoreCase("да")) {
                    System.out.println("Не понимаю. Введите «да» или «нет»");
                } else {
                    break;
                }
            }
        }
        scanner.close();
    }

    public static boolean palindromeCheck(String line) {
        StringBuilder lineWithoutWhiteSpaces = new StringBuilder(line.replaceAll("\\s", ""));

        return lineWithoutWhiteSpaces.toString().equals(lineWithoutWhiteSpaces.reverse().toString());
    }
}
