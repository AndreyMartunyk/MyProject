package CodingBat.String1;

public class Main {
    public static void main(String[] args) {

    }

    public String makeOutWord(String out, String word) {
        String res = out.substring(0, 2) + word + out.substring(2);
        return res;
    }

    public String extraEnd(String str) {
        str = str.substring(str.length() - 2);
        str = str + str +str;
        return str;
    }

    public String firstTwo(String str) {
        if (str.length() >= 2) {
            str = str.substring(0, 2);
        }
        return str;
    }

    public String firstHalf(String str) {
        str = str.substring(0, str.length()/2);
        return str;
    }

    public String withoutEnd(String str) {
        str = str.substring(1, str.length() - 1);
        return str;
    }

    public String comboString(String a, String b) {
        if (a.length() > b.length()){
            return b + a + b;
        }
        else {
          return a + b + a;
        }
    }

    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }

    public String right2(String str) {
        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }

    public String theEnd(String str, boolean front) {
        if (front) {
            return str.substring(0, 1);
        }else {
            return str.substring(str.length() - 1);
        }
    }

    public String withouEnd2(String str) {
        if (str.length() >= 3) {
            return str.substring(1, str.length() - 1);
        }
        else {
            return "";
        }
    }

    public String middleTwo(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
    }

    public boolean endsLy(String str) {
        if (str.length() <= 1) {
            return false;
        }
        if (str.substring(str.length() - 2).equals("ly")) {
            return true;
        }
        return false;
    }

    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n, str.length());
    }

    public String twoChar(String str, int index) {
        if (index + 2 > str.length() || index <= 0) {
            return str.substring(0, 2);
        }
        return str.substring(index, index + 2);
    }

    public String middleThree(String str) {
        return str.substring(str.length()/2 - 1, str.length() / 2 + 2);
    }

    public boolean hasBad(String str) {
        if (str.length() < 3){
            return false;
        }
        if (str.substring(0, 3).equals("bad")) {
                return true;
        }
        if (str.length() > 3 && str.substring(1, 4).equals("bad")){
             return true;
        }
        return false;
    }

    public String atFirst(String str) {
        if (str.length() == 1) {
            return str.substring(0, 1) + "@";
        }
        if (str.length() == 0) {
            return "@@";
        }
        return str.substring(0, 2);
    }

    public String lastChars(String a, String b) {
        if (a.length() == 0 && b.length() == 0) {
            return "@@";
        }
        if (a.length() == 0) {
            return "@" + b.substring(b.length() - 1);
        }
        if (b.length() == 0) {
            return a.substring(0, 1) + "@";
        }
        return a.substring(0, 1) + b.substring(b.length() - 1);
    }

    public String conCat(String a, String b) {
        if (a.length() == 0 || b.length() == 0) {
            return a + b;
        }
        if (a.substring(a.length() - 1).equals(b.substring(0, 1))) {
            return a + b.substring(1);
        }
        return a + b;
    }

    public String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        String swipe2 = str.substring(str.length() - 1) + str.substring(str.length() - 2, str.length() - 1);
        return str.substring(0, str.length() - 2) + swipe2;
    }

    public String seeColor(String str) {
        if (str.length() > 2 && str.substring(0, 3).equals("red")) {
            return "red";
        }
        if (str.length() > 3 && str.substring(0, 4).equals("blue")) {
            return "blue";
        }
        return "";
    }

    public boolean frontAgain(String str) {
        if (str.length() < 2) {
            return false;
        }
        if (str.substring(0, 2).equals(str.substring(str.length() - 2))){
            return true;
        }
        return false;
    }

    public String minCat(String a, String b) {
        if (a.length() > b.length()){
            a = a.substring(a.length() - b.length());
        }
        else if (b.length() > a.length()){
            b = b.substring(b.length() - a.length());
        }
        return a + b;
    }

    public String extraFront(String str) {
        if (str.length() < 2) {
            return str + str + str;
        }
        str = str.substring(0, 2);
        return str + str + str;
    }

    public String without2(String str) {
        if (str.length() < 2) {
            return str;
        }
        if (str.substring(0, 2).equals(str.substring(str.length() - 2))){
            return str.substring(2);
        }
        return str;
    }

    public String deFront(String str) {
        String a = "";
        String b = "";
        if (str.substring(0, 1).equals("a")) {
            a = "a";
        }
        if (str.substring(1, 2).equals("b")) {
            b = "b";
        }
        return a + b + str.substring(2, str.length());
    }

    public String startWord(String str, String word) {
        String res;
        if (word.length() > str.length()){
            return "";
        }
        if (word.substring(1).equals(str.substring(1, word.length()))) {
            res = str.substring(1, word.length());
            return str.substring(0, 1) + res;
        }
        return "";
    }

    public String withoutX(String str) {
        if (str.length() > 0 && str.substring(0, 1).equals("x")) {
            str = str.substring(1);
        }
        if (str.length() > 0 && str.substring(str.length() - 1).equals("x")) {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }

    public String withoutX2(String str) {
        if (str.length() > 0 && str.substring(0, 1).equals("x")) {
            str = str.substring(1);
            if (str.length() > 0 && str.substring(0, 1).equals("x")) {
                str = str.substring(1);
            }
            return str;
        }
        if (str.length() > 0 && str.substring(1, 2).equals("x")){
            str = str.substring(0, 1) + str.substring(2);
        }
        return str;
    }


}
