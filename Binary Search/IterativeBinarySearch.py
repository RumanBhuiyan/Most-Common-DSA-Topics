def binarySearch(num,search):
    left=0
    right=len(num)-1
    mid =(left+right)//2
    
    while left <= right :
        if num[mid] == search :
            return mid
        elif num[mid] < search :
            left = mid+1 
        else :
            right = mid -1
        mid = (left+right)//2
    
numbers=[]
print("Enter array size : ",end=" ")
size = int(input())

print("\nEnter sorted array elements : ",end=" ")
numbers=input();
numbers = numbers.split()
numbers =[int(x) for x in numbers]

print("\n Enter the number you wanna search: ",end=" ")   
searchingItem=int(input())
index=binarySearch(numbers,searchingItem)

if index==-1 :
    print("\n Item not found")
else :
    print(f'\n Item found at index : {index}')