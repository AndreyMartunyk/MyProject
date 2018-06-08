package CodingBat.Ap1;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public boolean scoresIncreasing(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] > scores[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public boolean scores100(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] == 100 && scores[i] == scores[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public boolean scoresClump(int[] scores) {
        for (int i = 0; i < scores.length - 2; i++) {
            if ((scores[i + 2] - scores[i + 1]) + (scores[i + 1] -scores[i]) <= 2) {
                return true;
            }
        }
        return false;
    }

    public int scoresAverage(int[] scores) {
        int firstHalf = scoreAverage(scores, 0, scores.length / 2);
        int secondHalf = scoreAverage(scores, scores.length / 2, scores.length);
        if (firstHalf > secondHalf) {
            return firstHalf;
        }
        return secondHalf;
    }

    private int scoreAverage (int[] scores, int start, int end) {
        int num = 0;
        for (int i = start; i < end; i++) {
            num += scores[i];
        }
        num = num / (end -start);
        return num;
    }

    public int wordsCount(String[] words, int len) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == len) {
                count++;
            }
        }
        return count;
    }

    public String[] wordsFront(String[] words, int n) {
        String[] newWords = new String[n];
        for (int i = 0; i < newWords.length; i++) {
            newWords[i] = words[i];
        }
        return newWords;
    }

    public List wordsWithoutList(String[] words, int len) {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() != len) {
                list.add(words[i]);
            }
        }
        return list;
    }

    public boolean hasOne(int n) {
        int digit;
        do {
           digit = n % 10;
           if (digit == 1) {
               return true;
           }
           n = (n - digit) / 10;
        } while (n != 0);
        return false;
    }

    public boolean dividesSelf(int n) {
        boolean divide = true;
        int digit;
        int newN = n;
        do {
            digit = n % 10;
            if (digit == 0 ||newN % digit != 0) {
                return false;
            }
            n = (n - digit) / 10;
        } while (n != 0);
        return true;
    }

    public int[] copyEvens(int[] nums, int count) {
        int[] arr = new int[count];
        for (int i = 0, j = 0; j < arr.length; i++) {
            if (nums[i] % 2 == 0) {
                arr[j] = nums[i];
                j++;
            }
        }
        return arr;
    }

    public int[] copyEndy(int[] nums, int count) {
        int[] arr = new int[count];
        for (int i = 0, j = 0; j < count; i++) {
            if (isEndy(nums[i])) {
                arr[j] = nums[i];
                j++;
            }
        }
        return arr;
    }

    private boolean isEndy (int num) {
        if ((num >= 0 && num <= 10) || (num >= 90 && num <= 100)) {
            return true;
        }
        return false;
    }

    public int matchUp(String[] a, String[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (allNotEmpty(a[i], b[i]) && a[i].charAt(0) == b[i].charAt(0)) {
                count++;
            }
        }
        return count;
    }

    private boolean allNotEmpty (String str, String str2) {
        if (str.length() != 0 && str2.length() != 0) {
            return true;
        }
        return false;
    }

    public int scoreUp(String[] key, String[] answers) {
        int score = 0;
        for (int i = 0; i < key.length; i++) {
            if (key[i].equals(answers[i])) {
                score += 4;
            } else if (answers[i].equals("?")) {
                continue;
            } else {
                score -= 1;
            }
        }
        return score;
    }

    public String[] wordsWithout(String[] words, String target) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(target)) {
                count++;
            }
        }
        String[] arr = new String[count];
        for (int i = 0, j = 0; i < words.length; i++) {
            if (!words[i].equals(target)) {
                arr[j] = words[i];
                j++;
            }
        }
        return arr;
    }

    public int scoresSpecial(int[] a, int[] b) {
        return maxSpecial(a) + maxSpecial(b);
    }

    private int maxSpecial (int[] num) {
        int max  = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 10 == 0) {
                max = Math.max(max, num[i]);
            }
        }
        return max;
    }

    public int sumHeights(int[] heights, int start, int end) {
        int sum = 0;
        for (; start < end ; start++) {
            sum += Math.abs(heights[start + 1] - heights[start]);
        }
        return sum;
    }

    public int sumHeights2(int[] heights, int start, int end) {
        int sum = 0;
        int count;
        for (; start < end ; start++) {
            count = heights[start + 1] - heights[start];
            if (count > 0) {
                count *= 2;
            }
            sum += Math.abs(count);

        }
        return sum;
    }

    public int bigHeights(int[] heights, int start, int end) {
        int count = 0;
        for (; start < end ; start++) {
            if (Math.abs(heights[start + 1] - heights[start])  >= 5) {
                count++;
            }
        }
        return count;
    }

    public int userCompare(String aName, int aId, String bName, int bId) {
        int num = aName.compareTo(bName);
        if (num == 0) {
            if (aId < bId) {
                return -1;
            } else if (aId == bId) {
                return 0;
            } else {
                return 1;
            }
        }else if (num < 0) {
            return -1;
        }else {
            return 1;
        }
    }

    public String[] mergeTwo(String[] a, String[] b, int n) {
        String[] arr = new String[n];
        for (int i = 0, j = 0, k = 0; i < n; i++) {
            if (a[j].compareTo(b[k]) < 0) {
                arr[i] = a[j];
                j++;
            } else if (a[j].compareTo(b[k]) > 0) {
                arr[i] = b[k];
                k++;
            } else {
                arr[i] = a[j];
                j++;
                k++;
            }
        }
        return arr;
    }

    public int commonTwo(String[] a, String[] b) {
        int count = 0;
        for (int i = 0, j = 0, k = 0; j < a.length && k < b.length; i++) {
            if (a[j].compareTo(b[k]) < 0) {
                j++;
            } else if (a[j].compareTo(b[k]) > 0) {
                k++;
            } else {
                j++;
                k++;
                count++;
            }
        }
        return count;
    }

}
