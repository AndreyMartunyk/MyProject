package DenCourse.Lesson2;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number: ");
        a = sc.nextInt();
        System.out.println("enter 2nd number: ");
        b = sc.nextInt();
        System.out.println("enter 3rd number: ");
        c = sc.nextInt();


        int min = Math.min(a, Math.min(b, c));

        System.out.println();



    }
}
