
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public Exception e = new Exception();

    public static void getNumberFromScanner(Random rand) {
        boolean flag = false;
        int cnt =0;
        int numProg = rand.nextInt(9);
        System.out.println("Вам дается 3 попытки угадать загаднное число.");
        while (!flag){
           // System.out.println(numProg);
            cnt++;
            System.out.print("Введите число:");
            int numUser = sc.nextInt();
            if (numUser == numProg) {
                System.out.print("Число угадано, повторить  1 – да / 0 – нет?");
                numUser = sc.nextInt();
                flag = numUser == 1 ? false : true;
                numProg = rand.nextInt(9);
                cnt = 0;
            }
            else if (numUser < numProg){
                System.out.println("Загаданное число больше");
            }
            else {
                System.out.println("Загаданное число меньше");
            }
            if (cnt  == 3) {
                System.out.print("Ваши 3 попытки завершены, повторить  1 – да / 0 – нет?");
                numUser = sc.nextInt();
                flag = numUser == 1 ? false : true;
                cnt = 0;
                numProg = rand.nextInt(9);

            }
        }
        System.out.println("Игра завершена, загаданное число было " + numProg);
    }
    public static void getWordFromScanner() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
                "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Scanner sc = new Scanner(System.in);
        String wordProg = words[rand.nextInt(words.length)];
        String wordUser;
        //System.out.println(Arrays.toString(words));
       // System.out.println(wordProg);
        System.out.println("попробуйте угадать загаданное слово, для выхода нажмите q");

        while (true) {
            System.out.println("Введите слово или q для выхода");
            wordUser = sc.nextLine();
            if (wordUser.equals("q")) {
                System.out.println("Выход");
                break;
            }
            if (wordUser.equals(wordProg)) {
                System.out.println("Вы угадали");
                break;
            } else {
                System.out.println("Вы не угадали");
                for (int i = 0; i < 14 ; i++) {
                    if ( wordUser.length() > i && wordProg.length() > i && wordUser.charAt(i) == wordProg.charAt(i))
                        System.out.print(wordUser.charAt(i));
                    else System.out.print(wordUser.equals(wordProg) ? "" : "#");
                }
                System.out.println();
            }
        }
    }


    public static void main(String[] args) {
//1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
// При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
// После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
        System.out.println("1 задание");
        try {
           getNumberFromScanner(rand);
        }
        catch (Exception e)
        {
            System.out.println("Ошибка " + e.getClass());
        }

//Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
//        При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
//                сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
//                apple – загаданное
//        apricot - ответ игрока
//        ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
//        Для сравнения двух слов посимвольно, можно пользоваться:
//        String str = "apple";
//        str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
//        Играем до тех пор, пока игрок не отгадает слово
//        Используем только маленькие буквы
        System.out.println("2 задание");
        getWordFromScanner();
    }

}