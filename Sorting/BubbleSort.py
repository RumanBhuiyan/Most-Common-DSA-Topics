def bubbleSort(num):
    for i in range(len(num)):
        for j in range (len(num)-1-i):
            if num[j]>num[j+1]:
                temp=num[j]
                num[j]=num[j+1]
                num[j+1]=temp
                
numbers=input() 
 
numbers=list(numbers.split())
numbers=[int(x) for x in numbers]

bubbleSort(numbers)
print(numbers)