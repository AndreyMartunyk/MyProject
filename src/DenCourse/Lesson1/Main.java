package DenCourse.Lesson1;

public class Main {
    public static void main(String[] args) {
        System.out.println(withoutFirst("Hello", "World"));
        System.out.println("===================");
        System.out.println(middleOfTwo("Hello", "World"));
        System.out.println("===================");
        System.out.println(lastTwoToBegin("Hello"));
        System.out.println("===================");
        System.out.println(sumOfSimple(5));
    }

   private static String withoutFirst (String s1, String s2) {
        return s1.substring(1) + s2.substring(1);
   }

   private static String middleOfTwo (String s1, String s2) {
        String firstHalf = s1.substring(s1.length() / 2 - 1, s1.length() / 2 + 2);
        String secondHalf = s2.substring(s1.length() / 2 - 1, s2.length() / 2 + 2);

        return firstHalf + secondHalf;
   }

   private static String lastTwoToBegin (String s) {
        return s.substring(s.length() - 2) + s.substring(0, s.length() - 2);
   }

   private static Integer sumOfSimple (int findCount) {
        int sum = 0;
        int count = 0;
       for (int currentNumber = 2; count < findCount ; currentNumber++) {
           if (isSimple(currentNumber)) {
               count++;
               sum += currentNumber;
           }
       }
       return sum;
   }

   private static boolean isSimple (int currentNumber) {
       for (int i = 2; i < currentNumber; i++) {
           if (currentNumber % i == 0) {
               return false;
           }
       }
       return true;
   }

}
