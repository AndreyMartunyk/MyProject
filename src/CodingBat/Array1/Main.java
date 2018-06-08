package CodingBat.Array1;

public class Main {
    public static void main(String[] args) {

    }

    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        }
        return false;
    }

    public boolean sameFirstLast(int[] nums) {
        if (nums.length > 0 && nums[0] == nums[nums.length - 1]) {
            return true;
        }
        return false;
    }

    public int[] makePi() {
        int[] pi = new int[3];
        pi[0] = 3;
        pi[1] = 1;
        pi[2] = 4;
        return pi;
    }

    public boolean commonEnd(int[] a, int[] b) {
        if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
            return true;
        }
        return false;
    }

    public int sum3(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public int[] rotateLeft3(int[] nums) {
        int[] nums2 = new int[3];
        nums2[0] = nums[1];
        nums2[1] = nums[2];
        nums2[2] = nums[0];
        return nums2;
    }

    public int[] reverse3(int[] nums) {
        int[] nums2 = new int[3];
        for (int i = 0, j = nums.length - 1; i < nums.length; i++, j--) {
            nums2[i] = nums[j];
        }
        return nums2;
    }

    public int[] maxEnd3(int[] nums) {
        int max = Math.max(nums[0], nums[2]);
        nums[0] = max;
        nums[1] = max;
        nums[2] = max;
        return nums;
    }

    public int sum2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length < 2) {
            return nums[0];
        }
        return nums[0] + nums[1];
    }

    public int[] middleWay(int[] a, int[] b) {
        int[] res = new int[2];
        res[0] = a[1];
        res[1] = b[1];
        return res;
    }

    public int[] makeEnds(int[] nums) {
        int[] res = new int[2];
        res[0] = nums[0];
        res[1] = nums[nums.length - 1];
        return res;
    }

    public boolean has23(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 || nums[i] == 3) {
                return true;
            }
        }
        return false;
    }

    public boolean no23(int[] nums) {
        boolean isNot23 = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 || nums[i] == 3) {
                isNot23 = false;
            }
        }
        return isNot23;
    }

    public int[] makeLast(int[] nums) {
        int[] res = new int[nums.length * 2];
        for (int i = 0; i < res.length - 1; i++) {
            res[i] = 0;
        }
        res[res.length - 1] = nums[nums.length - 1];
        return res;
    }

    public boolean double23(int[] nums) {
        if (nums.length < 2) {
            return false;
        }
        if ((nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3)) {
            return true;
        }
        return false;
    }

    public int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3) {
                nums[i + 1] = 0;
            }
        }
        return nums;
    }

    public int start1(int[] a, int[] b) {
        int count = 0;

        if (a.length > 0 && a[0] == 1) {
            count++;
        }
        if (b.length > 0 && b[0] == 1) {
            count++;
        }
        return count;
    }

    public int[] biggerTwo(int[] a, int[] b) {
        int sumA = 0;
        int sumB = 0;
        for (int i = 0; i < a.length; i++) {
            sumA += a[i];
            sumB += b[i];
        }
        if (sumB > sumA) {
            return b;
        } else {
            return a;
        }
    }

    public int[] makeMiddle(int[] nums) {
        int[] res = new int[2];
        res[0] = nums[nums.length / 2 - 1];
        res[1] = nums[nums.length / 2];
        return res;
    }

    public int[] plusTwo(int[] a, int[] b) {
        int[] res = new int[4];
        res[0] = a[0];
        res[1] = a[1];
        res[2] = b[0];
        res[3] = b[1];
        return res;
    }

    public int[] swapEnds(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;
        return nums;
    }

    public int[] midThree(int[] nums) {
        int[] res = new int[3];
        res[0] = nums[nums.length / 2 - 1];
        res[1] = nums[nums.length / 2];
        res[2] = nums[nums.length / 2 + 1];
        return res;
    }

    public int maxTriple(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int max;
        max = Math.max(nums[0], nums[nums.length / 2]);
        max = Math.max(max, nums[nums.length - 1]);
        return max;
    }

    public int[] frontPiece(int[] nums) {
        if (nums.length <= 2) {
            return nums;
        }
        int[] arr = new int[2];
        arr[0] = nums[0];
        arr[1] = nums[1];
        return arr;
    }

    public boolean unlucky1(int[] nums) {
        if (nums.length > 1 && nums[0] == 1 && nums[1] == 3) {
            return true;
        }
        if (nums.length > 2 && nums[1] == 1 && nums[2] == 3) {
            return true;
        }
        if (nums.length > 1 && nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3) {
            return true;
        }
        return false;
    }

    public int[] make2(int[] a, int[] b) {
        int[] arr = new int[2];
        if (a.length == 0) {
            arr[0] = b[0];
            arr[1] = b[1];
        }
        else if (a.length == 1) {
            arr[0] = a[0];
            arr[1] = b[0];
        }
        else {
            arr[0] = a[0];
            arr[1] = a[1];
        }
        return arr;
    }

    public int[] front11(int[] a, int[] b) {
        int[] arr;
        arr = new int[1];
        if (a.length == 0 && b.length == 0) {
            return a;
        }
        else if (a.length == 0) {
            arr[0] = b[0];
        }
        else if (b.length == 0) {
            arr[0] = a[0];
        } else {
            arr = new int[2];
            arr[0] = a[0];
            arr[1] = b[0];
        }
        return arr;
    }

}
