class Node:
    def __init__(self,value):
        # self is binding method and variables with the class
        self.value=value 
        self.next=None
        
#creating 3 nodes in heap memory
head=Node(2)
second=Node(3)
third=Node(4)

#connecting nodes
head.next=second
second.next=third

#iterating through items
while(head):
    print(head.value,end=" ")
    head=head.next