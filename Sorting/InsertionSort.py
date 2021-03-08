def insertionSort(num):
    for i in range(len(num)):
        for j in range (i,0,-1):
            if num[j-1]>num[j]:
                temp=num[j-1];
                num[j-1]=num[j];
                num[j]=temp;
                
numbers=input() 
 
numbers=list(numbers.split())
numbers=[int(x) for x in numbers]

insertionSort(numbers)
print(numbers)