package Array;

public class CountOccurances {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3, 8,8,8};
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                System.out.println("Element " + arr[i - 1] + " occurs " + count + " times");
                count = 1;
            }
        }

        // Print count for the last element
        System.out.println("Element " + arr[arr.length - 1] + " occurs " + count + " times");
    }
}
