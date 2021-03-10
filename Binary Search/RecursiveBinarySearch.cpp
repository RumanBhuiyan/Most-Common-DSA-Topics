#include <iostream>
using namespace std;
int binarySearch(int num[], int left, int right, int search);
int main()
{

    int size, searchingNumber;
    cout << "Enter array size : ";
    cin >> size;
    int numbers[size];
    cout << "Enter sorted array elements : ";

    for (int i = 0; i < size; cin >> numbers[i++])
        ;

    cout << "\nEnter the number you wanna search : ";
    cin >> searchingNumber;

    int index = binarySearch(numbers, 0, size - 1, searchingNumber);

    if (index == -1)
    {
        cout << "Item not found " << endl;
    }
    else
    {
        cout << "Item found at index: " << index << endl;
    }

    return 0;
}
int binarySearch(int num[], int left, int right, int search)
{

    int mid = (left + right) / 2;

    if (left <= right)
    {

        if (num[mid] == search)
        {
            return mid;
        }
        else if (num[mid] < search)
        {
            binarySearch(num, mid + 1, right, search);
        }
        else
        {
            binarySearch(num, left, mid - 1, search);
        }
    }
    else
        return -1;
}
