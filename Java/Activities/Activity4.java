package activities;

public class Activity4 {
   
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) { 
            int key = arr[i];         
            int j = i - 1;
            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;  
        }
    }
    // 
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] numbers = { 29, 10, 14, 37, 14, 7, 18 };
        System.out.println("Original Array:");
        printArray(numbers);
        insertionSort(numbers);
        System.out.println("Sorted Array:");
        printArray(numbers);
    }
}