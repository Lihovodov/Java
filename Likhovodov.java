import java.util.Scanner;

public class Likhovodov {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = (int) (Math.random() * 1000) + 10; 
        int guess;
        boolean correct = false;

        System.out.println("Загадано число от 10 до 1000");

        while (!correct) {
            System.out.println("1. Отгодать число");
            System.out.println("2. Выход");

            int option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Введите свое предположение: ");
                    guess = input.nextInt();
                    if (guess == number) {
                        System.out.println("Угадал._.");
                        correct = true;
                    } else if (guess < number) {
                        System.out.println("Ваше число меньше загадоного");
                    } else {
                        System.out.println("Ваше число больше загадоного");
                    }
                    break;
                case 2:
                    System.out.println("Выход из программы...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Некорректный ввод попробуйте еще ");
            }
        }
    }
}
