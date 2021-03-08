# Best case,worst case,average case time complexity=O(nlogn)
def mergeSort(array):
    if len(array)>1:
        mid=len(array)//2 # 5//2=2(result or quotient)
        leftArray=array[:mid] # copy elements from index 0 to mid
        rightArray=array[mid:]# copy elements from index mid to rest
        
        mergeSort(leftArray)
        mergeSort(rightArray)
        
        left=right=main=0
        # compare leftArray & rightArray values & assign to returning array
        while left<len(leftArray) and right<len(rightArray):
            if leftArray[left] < rightArray[right]:
                array[main]=leftArray[left]
                left +=1
            else :
                array[main]=rightArray[right]
                right +=1
            main +=1
            
        # store unstored items of leftArray to returning array  
        while left < len(leftArray):
            array[main]=leftArray[left]
            main +=1
            left +=1
            
        # store unstored items of rightArray to returning array  
        while right < len(rightArray):
            array[main]=rightArray[right]
            main +=1
            right +=1

numbers=input()
numbers=list(numbers.split())
numbers=[int(x) for x in numbers]
mergeSort(numbers)
print(numbers)
            
                