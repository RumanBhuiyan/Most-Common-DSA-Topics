import java.util.Scanner;

public class RecursiveBinarySearch {

    public static void main(String[] args) {

        int size, searchingItem;
        System.out.print("Enter array size : ");
        Scanner input = new Scanner(System.in);
        size = input.nextInt();
        int[] numbers = new int[size];

        System.out.print("Enter sorted array elements : ");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.printf("Enter the number you wanna search: ");
        searchingItem = input.nextInt();
        input.close();

        int index = binarySearch(numbers, 0, numbers.length - 1, searchingItem);
        if (index == -1) {
            System.out.println("Item not Found");
        } else {
            System.out.println("Item found at index : " + index);
        }
    }

    public static int binarySearch(int num[], int left, int right, int search) {

        int mid = (left + right) / 2;

        if (left <= right) {

            if (num[mid] == search) {
                return mid;
            } else if (num[mid] < search) {
                return binarySearch(num, mid + 1, right, search);
            } else {
                return binarySearch(num, left, mid - 1, search);
            }
        } else
            return -1;
    }
}
