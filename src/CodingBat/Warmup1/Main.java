package CodingBat.Warmup1;

public class Main {
    public static void main(String[] args) {

    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if ((aSmile && bSmile) || (!aSmile && !bSmile)) {
            return true;
        }
        return false;
    }

    public int sumDouble(int a, int b) {
        if (a == b) {
            return (a + b) * 2;
        }
        return a + b;
    }

    public int diff21(int n) {
        n = 21 - n;
        if (n < 0) {
            n = n * (-2);
        }
        return n;
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        if (!talking){
            return false;
        }
        if (hour < 7 || hour > 20) {
            return true;
        }
        return false;
    }

    public boolean makes10(int a, int b) {
        if (a + b == 10) {
            return true;
        }
        if (a == 10 || b == 10) {
            return true;
        }
        return false;
    }

    public boolean nearHundred(int n) {
        if (Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10) {
            return true;
        }
        return false;
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        }
        if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
            return true;
        }
        return false;
    }

    public String notString(String str) {
        if (str.length() < 3) {
            return "not " + str;
        }
        if (str.substring(0, 3).equals("not")) {
            return str;
        }
        return "not " + str;
    }

    public String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);
    }

    public String frontBack(String str) {
        if (str.length() < 2) {
            return str;
        }
        return str.substring(str.length() - 1) + str.substring(1, str.length() - 1) + str.substring(0, 1);
    }

    public String front3(String str) {
        if (str.length() <= 3) {
            return str + str + str;
        }
        str = str.substring(0, 3);
        return str + str + str;
    }

    public String backAround(String str) {
        String last = str.substring(str.length() - 1);
       return last + str + last;
    }

    public boolean or35(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }

    public String front22(String str) {
        if (str.length() < 2) {
            return str + str + str;
        }
        String first = str.substring(0, 2);
        return  first + str + first;
    }

    public boolean startHi(String str) {
        if (str.length() < 2 || !str.substring(0, 2).equals("hi")) {
            return false;
        }
        return true;
    }

    public boolean icyHot(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
            return true;
        }
        return false;
    }

    public boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }

    public boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
    }

    public boolean loneTeen(int a, int b) {
        if ((a >= 13 && a <= 19) && (b >= 13 && b <= 19)) {
            return false;
        }
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19);
    }

    public String delDel(String str) {
        if (str.length() < 4) {
            return str;
        }
        if (str.substring(1, 4).equals("del")) {
            return str.substring(0, 1) + str.substring(4);
        }
        return str;
    }

    public boolean mixStart(String str) {
        if (str.length() < 3) {
            return false;
        }
        return str.substring(1, 3).equals("ix");
    }

    public String startOz(String str) {
        String res = "";
        if (str.length() >= 1 && str.substring(0, 1).equals("o")) {
            res += "o";
        }
        if (str.length() >= 2 && str.substring(1, 2).equals("z")) {
            res += "z";
        }
        return res;
    }

    public int intMax(int a, int b, int c) {
        int max = Integer.MIN_VALUE;
        if (a > max) {
            max = a;
        }
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public int close10(int a, int b) {
        int newA = Math.abs(10 - a);
        int newB = Math.abs(10 - b);
        if (newA > newB) {
            return b;
        }
        if (newA < newB) {
            return a;
        }
        return 0;
    }

    public boolean in3050(int a, int b) {
        if ((a >= 30 && a <= 40 && b >= 30 && b <= 40) || (a >= 40 && a <= 50 && b >= 40 && b <= 50)) {
            return true;
        }
        return false;
    }

    public int max1020(int a, int b) {
        int maxA = 0;
        int maxB = 0;
        if (a >= 10 && a <= 20) {
            maxA = a;
        }
        if (b >= 10 && b <= 20) {
            maxB = b;
        }
        if (maxA > maxB) {
            return maxA;
        }
        return maxB;
    }

    public boolean stringE(String str) {
        int e = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals("e")) {
                e++;
            }
        }
        if (e >= 1 && e <= 3) {
            return true;
        }
        return false;
    }

    public boolean lastDigit(int a, int b) {
        if (a % 10 == b % 10) {
            return true;
        }
        return false;
    }

    public String endUp(String str) {
        if (str.length() < 3) {
            return str.toUpperCase();
        }
        return str.substring(0, str.length() - 3) + str.substring(str.length() - 3).toUpperCase();
    }

    public String everyNth(String str, int n) {
        String res = "";
        for (int i = 0; i < str.length(); i += n) {
            res += str.charAt(i);
        }
        return res;
    }





}
