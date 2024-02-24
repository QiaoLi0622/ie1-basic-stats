public class MinMaxCalculation {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9, 2, 4, 6, 8, 0 }; // example

        int[] minMax = minMaxCalculation(arr);
        if (minMax != null) {
            System.out.println("Minimum:" + minMax[0]);
            System.out.println("Maximum:" + minMax[1]);
        } else {
            System.out.println("Array is empty.");
        }
    }

    public static int[] minMaxCalculation(int[] arr) {
        if (arr.length == 0) {
            return null;
        }

        int minimum = arr[0];
        int maximum = arr[0];

        for (int i : arr) {
            if (i < minimum) {
                minimum = i;
            }
            if (i > maximum) {
                maximum = i;
            }
        }

        return new int[] { minimum, maximum };
    }
}