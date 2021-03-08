#include <iostream>
using namespace std;
void insertionSort(int num[], int len);
void printArray(int num[], int len);
int main()
{

    int size;
    cout << "Enter Array Size : ";
    cin >> size;
    int numbers[size];

    for (int i = 0; i < size; cin >> numbers[i++])
        ;
    insertionSort(numbers, sizeof(numbers) / sizeof(int));
    printArray(numbers, sizeof(numbers) / sizeof(int));

    return 0;
}
void insertionSort(int num[], int len)
{

    for (int i = 0; i < len; i++)
    {
        for (int j = i; j > 0; j--)
        {
            if (num[j - 1] > num[j])
            {
                int temp = num[j - 1];
                num[j - 1] = num[j];
                num[j] = temp;
            }
        }
    }
}
void printArray(int num[], int len)
{
    for (int i = 0; i < len; i++)
    {
        cout << num[i] << " ";
    }
}
