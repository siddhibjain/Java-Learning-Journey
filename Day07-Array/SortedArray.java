public class SortedArray {
    public static void main(String[] args) {
        int[] numArr = ArrayUtility.inputArray();
        boolean inc = isIncreasing(numArr);
        boolean dec = isDecreasing(numArr);
        if (inc || dec) {
            System.out.println("Array is sorted");
        } else {
            System.out.print("Array is not sorted");
        }
    }

    public static boolean isIncreasing(int[] arr) {
        int i = 1;
        while (i < arr.length)
        {
            if (arr[i] < arr[i - 1])
                return false;
            i++;
        }
        return true;
    }

    public static boolean isDecreasing(int[] arr) {
        int i = 1;
        while (i < arr.length) {
            if (arr[i] > arr[i - 1])
                return false;
            i++;
        }

        return true;
    }
}
