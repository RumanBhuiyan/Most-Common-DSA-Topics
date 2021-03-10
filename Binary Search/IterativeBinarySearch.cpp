#include <iostream>
using namespace std;
int binarySearch(int num[],int len,int keep);
int main() {
    
    int size,searchingNumber;
    cout<<"Enter array size : ";
    cin>>size;
    int numbers[size];
    cout<<"Enter sorted array elements : ";
    
    for(int i=0;i<size;cin>>numbers[i++]);
    
    cout<<"\nEnter the number you wanna search : ";
    cin>>searchingNumber;
    
    int index = binarySearch(numbers,sizeof(numbers)/sizeof(numbers[0]),searchingNumber);
    
    if(index == -1){
        cout<<"Item not found "<<endl;
    }
    else {
        cout<<"Item found at index: "<<index<<endl;
    }
    
    return 0;
}
int binarySearch(int num[],int len,int keep){

    int left =0;
    int right=len-1;
    int mid = (left+right)/2;
    while(left <= right){
        if (num[mid]==keep){
            return mid;
        }
        else if (num[mid] < keep){
            left=mid+1;
        }
        else {
            right = mid -1 ;
        }
        mid =(left+right)/2;
    }
    return -1 ;
} 
