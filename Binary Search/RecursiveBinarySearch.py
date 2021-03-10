def binarySearch(num,left,right,search):
    
    mid =(left+right)//2
    
    if left <= right :
        if num[mid] == search :
            return mid
        elif num[mid] < search :
            return binarySearch(num,mid+1,right,search)
        else :
            return binarySearch(num,left,mid-1,search)
    else:
        return -1
    
numbers=[]
print("Enter array size : ",end=" ")
size = int(input())

print("\nEnter sorted array elements : ",end=" ")
numbers=input();
numbers = numbers.split()
numbers =[int(x) for x in numbers]

print("\n Enter the number you wanna search: ",end=" ")   
searchingItem=int(input())

index=binarySearch(numbers,0,len(numbers)-1,searchingItem)

if index==-1 :
    print("\n Item not found")
else :
    print(f'\n Item found at index : {index}')