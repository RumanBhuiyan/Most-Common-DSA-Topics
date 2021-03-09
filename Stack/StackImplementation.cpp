// Stack follows LIFO(Last In First Out)
#include <iostream>
using namespace std;
#define MAX_SIZE 1000

class Stack{
    public:
        int top = -1;
        int keepStack[MAX_SIZE];

    bool isEmpty(){
        return (top == -1) ? true : false;
    }

    bool isFull(){
        return top >= MAX_SIZE ? true : false;
    }

    int size(){
        return top + 1;
    }

    void push(int data){
        if (isFull()){
            cout << "Stack is Full " << endl;
            return;
        }
        keepStack[++top] = data;
    }

    int pop(){
        if (isEmpty()){
            cout << "Stack is empty you cant pop " << endl;
        }
        return keepStack[top--];
    }
};

int main(){

    Stack *mystack = new Stack();

    mystack->push(2);
    mystack->push(3);
    mystack->push(4);

    cout << "Stack is Empty ? : " << (mystack->isEmpty() ? "yes" : "no") << endl;
    cout << "Stack is Full ?  : " << (mystack->isFull() ? "yes" : "no") << endl;
    int popingItem = mystack->pop();
    cout << "Poping item : " << popingItem << endl;
    cout << "Stack Size : " << mystack->size() << endl;

    return 0;
}