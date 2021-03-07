import java.util.Scanner;

public class BubbleSort{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int size;
        System.out.print("Enter array size : ");
        size = input.nextInt();
        int numbers []= new int[size];

        for (int i = 0; i < size; i++) {
             numbers[i]=input.nextInt();
        }
        input.close();
        bubbleSort(numbers, size);
        printArray(numbers, size);
    }

    public static void bubbleSort(int num[], int len) {
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int num[], int len) {
         for (int i = 0; i < len;i++){
           System.out.print(num[i]+" ");
        }
    }
}