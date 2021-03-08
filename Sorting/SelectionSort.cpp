#include<iostream>
using namespace std;
void selectionSort(int num[],int len);
void printArray(int num[],int len);
int main(){
    
    int size;
    cout<<"Enter Array Size : ";
    cin>>size;
    int numbers[size];
    
    for(int i=0;i<size;cin>>numbers[i++]);
    selectionSort(numbers,sizeof(numbers)/sizeof(int));
    printArray(numbers,sizeof(numbers)/sizeof(int));
    
    return 0;
}
void selectionSort(int num[],int len){
    
    for(int i=0;i<len;i++){
        int smallNumberIndex=i;
        for(int j=i+1;j<len;j++){
            if(num[smallNumberIndex]>num[j]){
                smallNumberIndex=j;
            }
        }
        int temp=num[i];
        num[i]=num[smallNumberIndex];
        num[smallNumberIndex]=temp;
    }
}
void printArray(int num[],int len){
    for(int i=0;i<len;i++){
        cout<<num[i]<<" ";
    }
}