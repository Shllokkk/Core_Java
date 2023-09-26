#include<stdio.h>
#include<stdlib.h>

int* deque;
int front=-1,rear=-1;
int MAX=10;
int sizeofdeque=40;

void state();
void enQueueRear();
void enQueueFront();
void deQueueRear();
void deQueueFront();
void trimQueue();
void display();
int count();

void main()
{
    deque=(int*) malloc(MAX*sizeof(int));
    int choice;
    int loopexit;
    
    LABEL:
    while(1)
    {
        printf("\n\n---Array Implementation Of Queue---");
        printf("\n1. Check the state of Queue\n2. Insert element at the rear of the Queue\n3. Insert element at the front of the Queue\n4. Delete element from the rear of the Queue\n5. Delete element from the front of the Queue\n6. Trim the Queue to size\n7. Display elements of the Queue");
        printf("\n\nSelect option: ");
        scanf("%d", &choice);

        switch(choice)
        {
            case 1: 
                state();
                break;

            case 2:
                enQueueRear();
                break;

            case 3:
                enQueueFront();
                break;

            case 4:
                deQueueRear();
                break;

            case 5:
                deQueueFront();
                break;

            case 6:
                trimQueue();
                break;

            case 7:
                display();
                break;

            default:
                break;
        }

        printf("\nDo you want to exit(1/0): ");
        scanf("%d", &loopexit);

        if(loopexit==0)
        {
            goto LABEL;
        }
        break;
    }
}

void state()
{
    printf("\nCapacity of Queue: %d integers (%d bytes)",MAX,sizeofdeque);
    printf("\nSize of Queue: %d integers (%d bytes)",count(),count()*4);
}

void enQueueRear()
{
    if(front==-1)
    {
        front++;
        rear++;
        printf("\nEnter element to be inserted at rear: ");
        scanf("%d",&deque[rear]);
    }
    else
    {
        if(rear==MAX-1)
        {
            int* temp;
            temp=(int*) malloc((MAX+5)*sizeof(int));
            for(int i=0;i<MAX;i++)
            {
                temp[i]=deque[i];
            }
            deque=temp;
            MAX+=5;
            sizeofdeque=MAX*4;
            rear++;
            printf("\nEnter element to be inserted at rear: ");
            scanf("%d",&deque[rear]);
        }
        else
        {
            rear++;
            printf("\nEnter element to be inserted at rear: ");
            scanf("%d",&deque[rear]);
        }
    }
}

void enQueueFront()
{
    if(front==0)
        printf("QueueOverflow!");
    else
    {
        front--;
        printf("\nEnter element to be inserted at front: ");
        scanf("%d",&deque[front]);
    }
}

void deQueueRear()
{
    if(rear==front)
    {
        printf("QueueUnderflow!");
        front=rear=-1;
    }
    else
    {
        printf("\nDeleted element from the rear: %d",deque[rear]);
        rear--;
    }
}

void deQueueFront()
{
    if(front==rear)
    {
        printf("QueueUnderflow!");
        front=rear=-1;
    }
    else
    {
        printf("\nDeleted element from the front: %d",deque[front]);
        front++;
    }
}

void trimQueue()
{
    if(count()!=MAX)
    {
        int* temp;
        temp=(int*) malloc((MAX+5)*sizeof(int));
        for(int i=0;i<count();i++)
        {
            temp[i]=deque[i];
        }
        deque=temp;
        MAX=count();
        sizeofdeque=MAX*4;
        printf("\nQueue trimmed successfully!");
    }
    else
        printf("\nNo need to trim the Queue");

}

void display()
{
    if(front==-1)
        printf("\nQueue is empty!");
    else
    {
        printf("\nThe elements of Queue are: ");
        for(int i=front;i<=rear;i++)
        {
            printf("%d", deque[i]);
        }
    }
}

int count()
{
    if(front==-1)
        return 0;
    else
    {
        int cntr=0;
        for(int i=front;i<=rear;i++)
        {
            cntr++;
        }
        return cntr;
    }
}