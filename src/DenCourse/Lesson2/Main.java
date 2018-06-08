package DenCourse.Lesson2;

public class Main {
    public static void main(String[] args) {
        System.out.println(doubleLetter("Hello"));
        System.out.println("============================");
        System.out.println(countOfWord("bob it's not the bib!"));
        System.out.println("============================");
        System.out.println(removeLeftAndRight("hello boy, how are you? what's up guys", 'h'));
        System.out.println("============================");
        System.out.println(
                countAandSinTheEnd("dgsda. sdgsdgb, sdgdsc; sdgdsd! sdgdss@ tu vz sdda"));
        System.out.println("============================");
        System.out.println(removeWord("hello Andrew, how r u?", "Andrew"));

    }

    private static StringBuilder doubleLetter (String str) {
        if (str == null) {
            return null;
        }
        StringBuilder res = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            res = res.append(str.substring(i, i + 1)).append(str.substring(i, i + 1));
        }
        return res;
    }

    private static int countOfWord (String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                count++;
            }
        }
        return count;
    }

    private static String removeLeftAndRight (String str, char remove) {
        if (str == null) {
            return null;
        }

        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == remove) {
                str = str.substring(0, i - 1) + str.substring(i + 2);
            }
        }
        if (str.charAt(0) == remove) {
            str = str.substring(2);
        }
        if (str.charAt(str.length() - 1)  == remove) {
            str = str.substring(0, str.length() - 2);
        }
        return str;
    }

    private static int countAandSinTheEnd (String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (!str.substring(i + 1, i + 2).matches("[a-zа-я]")) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 's') {
                    count++;
                }
            }
        }
        if (str.charAt(str.length() - 1) == 'a' || str.charAt(str.length() - 1) == 's') {
            count++;
        }
        return count;
    }

    private static String removeWord (String str, String remove) {
        return str.replaceAll(remove, "");
    }


}
