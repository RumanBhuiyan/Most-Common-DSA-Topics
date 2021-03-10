import java.util.Scanner;

public class IterativeBinarySearch{
    
    public static void main (String[] args) {
        
       int size,searchingItem;
       System.out.print("Enter array size : ");
       Scanner input=new Scanner(System.in);
       size=input.nextInt();
       int[] numbers= new int[size];
       
       System.out.print("Enter sorted array elements : ");
       for(int i=0;i<size ;i++){
           numbers[i]=input.nextInt();
       }
       System.out.printf("Enter the number you wanna search: ");
       searchingItem = input.nextInt();
       input.close();
       
       int index = binarySearch(numbers,numbers.length,searchingItem);
       if(index ==-1){
           System.out.println("Item not Found");
       }else {
           System.out.println("Item found at index : "+index);
       }
    }
    
 public static int binarySearch(int num[],int len,int search){
     
    int left =0;
    int right=len-1;
    int mid = (left+right)/2;
    while(left <= right){
        if (num[mid]==search){
            return mid;
        }
        else if (num[mid] < search){
            left=mid+1;
        }
        else {
            right = mid -1 ;
        }
        mid =(left+right)/2;
    }
    return -1 ;
    }
}