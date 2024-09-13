import java.util.*;

interface Stack {
  void push(int ele);

  void pop();

  void display();
}

interface Queue {
  void enqueue(int ele);

  void dequeue();

  void display();
}

class QueueNStack implements Stack, Queue {
  int size;
  int top;
  int front;
  int rear;
  int arr[]=new int[10] ;
  QueueNStack(int s)
  {
   size=s;
  }
  public void push(int ele) {
    if (top > size) {
      System.out.println("===Stack is full===");
    } else {
      arr[top] = ele;
      top++;
      System.out.println("===Element " + ele + " pushed to stack===");
    }
  }

  public void pop() {
    if (top < 0) {
      System.out.println("===Stack is empty===");
    } else {
      System.out.println("===Element " + arr[top--] + " popped from stack==");
    }
  }

  public void display() {
    
    for (int i = 0; i <= arr.length; i++) {
      
      System.out.println(arr[i]);
    }
  }

  public void enqueue(int ele)
  {
    if (rear == size - 1) {
      System.out.println("===Queue is full===");
      } else {
        arr[rear] = ele;
        rear++;
        System.out.println("===Element " + ele + " enqueued to queue===");
        }
  }
  public void dequeue()
  {
    if (rear < 0) {
      System.out.println("===Queue is empty===");
      } else {
        System.out.println("===Element " + arr[front++] + " dequeued from queue==");
        }
  }


}

public class InterfaceStackNQueue {
  public static void main(String[] args) {
    int element;
    int size;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enetr the Size: ");
    size=sc.nextInt();
    System.out.println("Enter your Choice: \n"+"1.Stack\n"+"2.Queue\n"+"3.Exit");
    int choice=sc.nextInt();
    Stack s = new QueueNStack(size);
    Queue q = new QueueNStack(size);
    while (choice != 3) {
      switch (choice) {
        case 1:
        int stackchoice=0;
        while(stackchoice !=4){
        System.out.println("\nStack Operations\n"+"1.Push\n"+"2.Pop\n"+"3.Display\n"+"4.Exit");
        stackchoice=sc.nextInt();
        switch (stackchoice) {
          case 1:
          System.out.println("Enter the element to push");
          element=sc.nextInt();
          s.push(element);
          break;
          case 2:
          s.pop();
          break;
          case 3:
          System.out.println("Currect Stack");
          s.display();
          break;
          case 4:
          System.out.println("Exiting Stack");
          break;
        }
        }
        break;
        case 2:
        System.out.println("Queue Operations\n"+"1.Enqueue\n"+"2.Dequeue\n"+"3.Display\n"+"4.Exit");
        int queuechoice=sc.nextInt();
        while (choice!=4)
        {
          switch (queuechoice) {
            case 1:
            System.out.println("Enter the element to Enqueue");
            element=sc.nextInt();
            q.enqueue(element);
            break;
            case 2:
            q.dequeue();
            break;
            case 3:
            System.out.println("Current Queue");
            q.display();
            case 4:
            System.out.println("Exiting Queue");
            break;
          }
        }
          break;
        case 3:
        break;
      }
        
        }

  }
}