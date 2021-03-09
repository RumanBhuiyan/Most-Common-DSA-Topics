class stack:
    
    keepStack=[]
    
    def isEmpty(self):
        return True if len(self.keepStack)==0 else False
    
    def size(self): #self is binding this method with the class.
        return len(self.keepStack) #its mendatory for every function inside class
        
    def push(self,data):
        self.keepStack.append(data)
    
    def pop(self):
        return self.keepStack.pop()
    
    

myStack=stack()

myStack.push(2)
myStack.push(3)
myStack.push(4)
