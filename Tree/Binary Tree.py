class Node:
    def __init__(self,value):
        self.data=value
        self.left=None
        self.right=None

def preorderTraversal(keep):
    if (keep != None):
        print(keep.data,end=" ")
        preorderTraversal(keep.left)
        preorderTraversal(keep.right)

def inorderTraversal(keep):
    if (keep != None):
        inorderTraversal(keep.left)
        print(keep.data,end=" ")
        inorderTraversal(keep.right)

def postorderTraversal(keep):
    if (keep != None):
        postorderTraversal(keep.left)
        postorderTraversal(keep.right)
        print(keep.data,end=" ")

#creating 3 Nodes in heap memory
root =Node(1)
first =Node(2)
second =Node(3)
third =Node(4)
fourth =Node(5)
fifth =Node(6)
sixth =Node(7)

#connecting Nodes
root.left=first
root.right=second
first.left=third
first.right=fourth
second.left=fifth
second.right=sixth

print("Preorder Traversal : ",end=' ')
preorderTraversal(root)

print("\n Inorder Traversal : ",end=' ')
inorderTraversal(root)

print("\n Postorder Traversal : ",end=' ')
postorderTraversal(root)

