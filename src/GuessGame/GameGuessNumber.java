package GuessGame;

import java.util.Random;
import java.util.Scanner;

public class GameGuessNumber {
    //2.написать игру Угадай число, в которой за ограниченное число попыток ввода числа
    //     * с клавиатуры нужно угадать секретное число от 0 до 9
    //     * Условия:
    //     * -Код игры должен находиться в классе GameGuessNumber
    //     * -Класс GameGuessNumber должен содержать две статические переменные scanner для ввода чисел с
    //     * клавиатуры и secret, в которой записано секретное число
    //     * -Класс GameGuessNumber должен содержать следующие методы (могут быть и другие по
    //     * желанию): int readNumberOfAttempts()-считывает количество предоставляемых попыток
    //     *           int readNumber() - считывает вводимое число
    //     *           void guessNumber(int attempts) содержит логику игры
    static int scanner;
    static int secret;

    public static int readNumberOfAttempts() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько будет попыток?");
        return sc.nextInt();
    }

    public static int readNumber() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void guessNumber() {
        int attempts = readNumberOfAttempts();
        secret = (int) (Math.random() * (10));
        for (int i = attempts; i > 0; i--) {
            System.out.println("Угадайте число от 0 до 9 (осталось " + i + " попыток)");
            scanner = readNumber();
            if (scanner > secret) System.out.println("Задуманно число меньше " + scanner);
            else if (scanner < secret) System.out.println("Задуманно число больше " + scanner);
            else {
                System.out.println("Вы угадали!!! Поздравляю!!!");
                return;
            }
        }
        System.out.println("Вы проиграли :( Сожалею");
    }
}
