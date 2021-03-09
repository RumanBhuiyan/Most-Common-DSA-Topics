class Queue:
    
    back = -1
    queue=[]
    
    def isEmpty(self):
        return True if len(self.queue)==0 else False  
    
    def size(self):
        return len(self.queue)
        
    def enqueue(self,data):
        self.queue.append(data)
    
    def dequeue(self):
        if self.isEmpty():
            print("Queue is Empty ")
        for i in range(len(self.queue)-1):
            self.queue[i]=self.queue[i+1]
    
    def peek(self):
        return self.queue[0]
        
myqueue= Queue()

myqueue.enqueue(1)
myqueue.enqueue(2)
myqueue.enqueue(3)
myqueue.enqueue(4)

print(f'Is Queue Empty ? {myqueue.isEmpty()}')
print(f'Queue Size : {myqueue.size()}')
print(f'Front element :  {myqueue.peek()}')
myqueue.dequeue()
print(f'Front element :  {myqueue.peek()}')

# Is Queue Empty ? False
# Queue Size : 4
# Front element :  1
# Front element :  2