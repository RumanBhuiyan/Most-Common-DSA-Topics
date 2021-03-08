import java.util.Scanner;

public class InsertionSort {

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
        insertionSort(numbers, size);
        printArray(numbers, size);
    }

    public static void insertionSort(int num[], int len) {
        for (int i = 0; i < len; i++) {
            for (int j = i; j > 0; j--) {
                if (num[j - 1] > num[j]) {
                    int temp = num[j - 1];
                    num[j - 1] = num[j];
                    num[j] = temp;
                }
            }
        }
    }

    public static void printArray(int num[], int len) {
        for (int i = 0; i < len; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
