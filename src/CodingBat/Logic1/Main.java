package CodingBat.Logic1;

public class Main {
    public static void main(String[] args) {

    }

    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (cigars >= 40 && (cigars <= 60 || isWeekend)) {
            return true;
        }
        return false;
    }

    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) {
            return 0;
        }
        if (you >= 8 || date >=8) {
            return 2;
        }
        return 1;
    }

    public int maxMod5(int a, int b) {
        int max, min;
        if (a > b) {
            max = a;
            min = b;
        }
        else if (a < b) {
            max = b;
            min = a;
        }
        else {
            return 0;
        }

        if (max % 5 == min % 5) {
            max = min;
        }
        return max;
    }
    
}


