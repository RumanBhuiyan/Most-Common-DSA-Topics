#include<iostream>
using namespace std;
class Node{
    public:
        int value;
        Node *next; //ex next=second;next contains Node* type value
};
        
int main(){
   // Node Declaration
    Node *head = NULL;
    Node *second = NULL;
    Node *third = NULL;

   // Creating 3 nodes in heap memory and assigning to variables
    head = new Node();
    second = new Node();
    third = new Node();

    //Assigning Values to nodes but they aren't connected each other still
    head->value = 2;
    second->value = 3;
    third->value = 4;

  // connecting nodes
    head->next = second;
    second->next = third;

  //iterating through LinkedList items
    while (head != NULL)
    {
        cout << head->value << " ";
        head = head->next;
  };

    return 0;
}