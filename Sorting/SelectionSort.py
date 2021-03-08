def selectionSort(num):
    for i in range(len(num)):
        smallNumberIndex=i;
        for j in range (i+1,len(num)):
            if num[smallNumberIndex]>num[j]:
                smallNumberIndex=j
        temp=num[i];
        num[i]=num[smallNumberIndex];
        num[smallNumberIndex]=temp;
                
numbers=input() 
 
numbers=list(numbers.split())
numbers=[int(x) for x in numbers]

selectionSort(numbers)
print(numbers)