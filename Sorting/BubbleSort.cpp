#include<iostream>
using namespace std;
void bubbleSort(int num[], int len);
void printArray(int num[], int len);
int main(){
    int n;
    cout << "Enter array size : ";
    cin >> n;
    int numbers[n];

    for (int i = 0; i < n;cin>>numbers[i++]);//input

    bubbleSort(numbers, sizeof(numbers) / sizeof(int));

    printArray(numbers,sizeof(numbers)/sizeof(int));

    return 0;
}
void bubbleSort(int num[],int len){

    for (int i = 0; i < len;i++){
        for (int j = 0; j < len - 1 - i;j++){
            if(num[j]>num[j+1]){
                int temp = num[j];
                num[j] = num[j+1];
                num[j+1] = temp;
            }
        }
    }
}
void printArray(int num[],int len){
    for (int i = 0; i < len;i++){
        cout << num[i] << " ";
    }
}