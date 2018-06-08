package CodingBat.Logic2;

public class Main {
    public static void main(String[] args) {

    }

    public boolean makeBricks(int small, int big, int goal) {
        if (goal > big * 5 +small) return false;
        if (goal % 5 > small) return false;
        return true;
    }

    public int loneSum(int a, int b, int c) {
        if (a != b && b != c && a != c) {
            return a + b + c;
        }
        if (a == b && b == c) {
            return 0;
        }
        if (a == b) {
            return c;
        }
        if (b == c) {
            return a;
        }
        return b;
    }

    public int luckySum(int a, int b, int c) {
        if (a == 13) {
            return 0;
        }
        if (b == 13) {
            return a;
        }
        if (c == 13) {
            return a + b;
        }
        return a + b + c;
    }

    public int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    private int fixTeen(int num) {
        if (num == 13 || num == 14 || num == 17 || num == 18 || num == 19) {
            return 0;
        }
        return num;
    }

    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    private int round10(int num) {
        int round = num % 10;
        num = num - round;
        if (round >= 5) {
            return num + 10;
        }
        return num;
    }

    public boolean closeFar(int a, int b, int c) {
        boolean close = false;
        if (Math.abs(a - b) <= 1 && Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2) {
            return true;
        }
        if (Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2 && Math.abs(b - c) >= 2) {
            return true;
        }
        return false;
    }

    public int blackjack(int a, int b) {
        if (a > 21) a = 0;
        if (b > 21) b = 0;
        if (a > b) {
            return a;
        }
        return b;
    }

    public boolean evenlySpaced(int a, int b, int c) {
        int small, medium, big;
        small = Math.min(Math.min(a, b), c);
        big = Math.max(Math.max(a, b), c);
        if (a != small && a != big) {
            medium = a;
        } else if (b != small && b != big){
            medium = b;
        } else {
            medium = c;
        }

        if (big - medium == medium - small) {
            return true;
        }
        return false;
    }

    public int makeChocolate(int small, int big, int goal) {
        if (small + big * 5 < goal) {
            return -1;
        }
        int res = big * 5;
        while (res > goal) {
            res -= 5;
        }
        if (goal - res > small) {
            return -1;
        }
        return goal - res;
    }


}

