// Sorting.java
// Useful sorting algorithms in Java

public class Sorting {

    // Bubble Sort
    static void bubbleSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                // Swap if elements are in the wrong order
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Display array
    static void displayArray(int[] arr) {

        for (int value : arr) {
            System.out.print(value + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array:");
        displayArray(numbers);

        // Sort the array
        bubbleSort(numbers);

        System.out.println("Sorted array:");
        displayArray(numbers);
    }
}
