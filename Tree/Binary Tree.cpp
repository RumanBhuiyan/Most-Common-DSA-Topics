#include <iostream>
using namespace std;

class Node
{
public:
    int data;
    Node *left;
    Node *right;

    Node(int value)
    {
        data = value;
    }
};

void preorder(Node *keep)
{
    if (keep != NULL)
    {
        cout << keep->data << " ";
        preorder(keep->left);
        preorder(keep->right);
    }
}

void postorder(Node *keep)
{
    if (keep != NULL)
    {
        postorder(keep->left);
        postorder(keep->right);
        cout << keep->data << " ";
    }
}

void inorder(Node *keep)
{
    if (keep != NULL)
    {
        inorder(keep->left);
        cout << keep->data << " ";
        inorder(keep->right);
    }
}

int main()
{

    //Creating nodes but they aren't interconnected
    Node *root = new Node(1);
    Node *first = new Node(2);
    Node *second = new Node(3);
    Node *third = new Node(4);
    Node *fourth = new Node(5);
    Node *fifth = new Node(6);
    Node *sixth = new Node(7);

    // Connecting nodes
    root->left = first;
    root->right = second;
    first->left = third;
    first->right = fourth;
    second->left = fifth;
    second->right = sixth;

    cout << "Pre-order Traversal: ";
    preorder(root);

    cout << endl
         << "In-order Traversal : ";
    inorder(root);

    cout << endl
         << "Post-order Traversal : ";
    postorder(root);

    return 0;
}
// Pre - order Traversal : 1 2 4 5 3 6 7 
// In - order Traversal : 4 2 5 1 6 3 7 
// Post - order Traversal : 4 5 2 6 7 3 1