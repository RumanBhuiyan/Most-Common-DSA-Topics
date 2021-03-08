import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int size;
        System.out.print("Enter array size : ");
        size = input.nextInt();
        int numbers[] = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }
        input.close();
        selectionSort(numbers, size);
        printArray(numbers, size);
    }

    public static void selectionSort(int num[], int len) {
        for (int i = 0; i < len; i++) {
            int smallNumberIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (num[smallNumberIndex] > num[j]) {
                    smallNumberIndex = j;
                }
            }
            int temp = num[i];
            num[i] = num[smallNumberIndex];
            num[smallNumberIndex] = temp;
        }
    }

    public static void printArray(int num[], int len) {
        for (int i = 0; i < len; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
