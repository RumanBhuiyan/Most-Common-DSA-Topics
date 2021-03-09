#include <iostream>
using namespace std;
#define MAX_SIZE 1000

class Queue
{
public:
    
    int back = -1;
    int queue[MAX_SIZE];

    bool isEmpty()
    {
        return (back == -1) ? true : false;
    }
    bool isFull()
    {
        return (back + 1 == MAX_SIZE) ? true : false;
    }
    int size()
    {
        return back + 1;
    }
    void enqueue(int value)
    {
        if (isFull())
        {
            cout << "Queue is Full " << endl;
        }
        queue[++back] = value;
    }
    void dequeue()
    {
        if (isEmpty())
        {
            cout << "Queue is empty " << endl;
        }
        for (int i = 0; i < back; i++)
        {
            queue[i] = queue[i + 1];
        }
    }
    int peek()
    {
        return queue[0];
    }
};

int main()
{

    Queue *myqueue = new Queue();

    myqueue->enqueue(1);
    myqueue->enqueue(2);
    myqueue->enqueue(3);
    myqueue->enqueue(4);

    cout << "Is Queue Empty ? " << (myqueue->isEmpty() ? "yes" : "no") << endl;
    cout << "Is Queue Full ? " << (myqueue->isFull() ? "yes" : "no") << endl;
    cout << "Queue size : " << myqueue->size() << endl;
    cout << "Front element  : " << myqueue->peek() << endl;

    myqueue->dequeue();

    cout << "Front element  : " << myqueue->peek() << endl;

    return 0;
}
// Is Queue Empty ? no
 // Is Queue Full ? no
 // Queue size : 4 
 // Front element: 1 
 // Front element : 2