package CodingBat.Warmup2;

public class Main {
    public static void main(String[] args) {

    }

    public String stringTimes(String str, int n) {
        String res = "";
        for (int i = 0; i < n; i++) {
            res += str;
        }
        return res;
    }

    public String frontTimes(String str, int n) {
        String front;
        if (str.length() < 3) {
            front = str;
        } else {
            front = str.substring(0, 3);
        }
        String res = "";
        for (int i = 0; i < n; i++) {
            res += front;
        }
        return res;
    }

    int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx")) {
                count++;
            }
        }
        return count;
    }

    boolean doubleX(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x') {
                return str.charAt(i + 1) == 'x';
            }
        }
        return false;
    }

    public String stringBits(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i += 2) {
            res += str.charAt(i);
        }
        return res;
    }

    public String stringSplosion(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            res += str.substring(0, i + 1);
        }
        return res;
    }

    public int last2(String str) {
        if (str.length() < 2) return 0;
        String end = str.substring(str.length()-2);
        String sub;
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            sub = str.substring(i, i + 2);
            if (sub.equals(end)) {
                count++;
            }
        }
        return count;
    }

    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }
        return count;
    }

    public boolean arrayFront9(int[] nums) {
        for (int i = 0; i < nums.length && i < 4; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }
        return false;
    }

    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }

    public int stringMatch(String a, String b) {
        int length = Math.min(a.length(), b.length());
        int count = 0;
        for (int i = 0; i < length - 1; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                count++;
            }
        }
        return count;
    }

    public String stringX(String str) {
        for (int i = 1; i < str.length() - 1;) {
            if (str.charAt(i) == 'x') {
                str = str.substring(0, i) + str.substring(i + 1);
            } else {
                i++;
            }
        }
        return str;
    }

    public String altPairs(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i += 4) {
            res += str.substring(i, i + 1);
            if (str.length() > i + 1) {
                res += str.substring(i + 1, i + 2);
            }
        }
        return res;
    }

    public String stringYak(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                i =  i + 2;
            } else {
                res += str.charAt(i);
            }
        }
        return res;
    }

    public int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
                count++;
            }
        }
        return count;
    }

    public boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2]) {
                return false;
            }
        }
        return true;
    }

    public boolean has271(int[] nums) {
        for (int i = 0; i < (nums.length - 2); i++) {
            int val = nums[i];
            if (nums[i + 1] == (val + 5) &&
                    Math.abs(nums[i + 2] - (val - 1)) <= 2) {
                return true;
            }
        }
        return false;
    }












}
