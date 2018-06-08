package CodingBat.String2;

public class Main {
    public static void main(String[] args) {

    }

    public String doubleChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.substring(i, i + 1) + str.substring(i, i + 1) ;
        }
        return result;
    }

    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        return count;
    }

    public boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                catCount++;
            }
            if (str.substring(i, i + 3).equals("dog")) {
                dogCount++;
            }
        }
        return catCount == dogCount;
    }

    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }

    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.length() > b.length()) {
            if (b.equals(a.substring(a.length() - b.length()))) {
                return true;
            }
        }
        if (b.length() >= a.length()) {
            if (a.equals(b.substring(b.length() - a.length()))) {
                return true;
            }
        }
        return false;
    }

    public boolean xyzThere(String str) {
        if (str.length() >= 3 && str.charAt(0) == 'x' && str.charAt(1) == 'y' && str.charAt(2) == 'z'){
            return true;
        }
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) != '.' && str.charAt(i + 1) == 'x' && str.charAt(i + 2) == 'y' && str.charAt(i + 3) == 'z') {
                return true;
            }
        }
        return false;
    }

    public boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }

    public boolean xyBalance(String str) {
      return true;
    }






}
