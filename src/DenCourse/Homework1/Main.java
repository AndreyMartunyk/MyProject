package DenCourse.Homework1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1. Ввести с консоли три числа, подсчитать сумму квадратов двух наибольших чисел. Результат вывести в консоль.
        System.out.println("1. Ввести с консоли три числа, подсчитать сумму квадратов двух наибольших чисел.\n" +
                " Результат вывести в консоль.");
        System.out.println(firstPart(askMeNumber(), askMeNumber(), askMeNumber()));
        System.out.println();

        /*2. Ввести с консоли три числа (a, b, c). Решить квадратное уравнение
        ax^2 + bx + c = 0. Результат вывести в консоль.*/
        System.out.println("2. Ввести с консоли три числа (a, b, c). Решить квадратное уравнение\n" +
                "ax^2 + bx + c = 0. Результат вывести в консоль.");
        secondPart(askMeNumber(), askMeNumber(), askMeNumber());
        System.out.println();

        //Ввести n строк с консоли, найти самую короткую строку. Вывести эту строку и ее длину.
        System.out.println("3. Ввести n строк с консоли, найти самую короткую строку. Вывести эту строку и ее длину.");
        System.out.println("самая короткая строка: " + minLengthArr(createAndFillArray()));
        System.out.println();

        //Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше средней, также их длины.
        System.out.println("Ввести n строк с консоли. Вывести на консоль те строки,\n" +
                " длина которых меньше средней, также их длины.");


    }

    static int askMeNumber () {
        System.out.print("Enter the number, please: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    static int firstPart(int num1, int num2, int num3) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        int[] arr = {num1, num2, num3};

        for (int i = 0; i < arr.length; i++) {
            if (max1 < arr[i]) {
                max1 = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (max2 < arr[i] && arr[i] != max1) {
                max2 = arr[i];
            }
        }

        return (max1 * max1) + (max2 * max2);
    }

    static int secondPart (int a, int b, int c) {
        double d = b * b - 4 * a * c;
        System.out.println("d = " + d);
        double x1, x2;
        if (d == 0) {
            x1 = - b / (2 * a);
            System.out.println("x1 = x2 = " + x1);
        }
        else if (d > 0) {
            x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        else {
            System.out.println("корней нет");
        }
        return 0;
    }

    static String[] createAndFillArray() {
        System.out.print("Введите колличество строк: ");
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        String[] array = new String[count];

        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + ". ");
            array[i] = sc.nextLine();
        }

        return array;
    }

    static String minLengthArr(String[] array) {
        int minLength = array[0].length();
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (minLength > array[i].length()) {
                minLength = array[i].length();
                minIndex = i;
            }
        }
        return array[minIndex];
    }

    static void lessThanMinArr (String[] array) {


    }

}



