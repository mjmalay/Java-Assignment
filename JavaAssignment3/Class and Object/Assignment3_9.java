/* 9) Write a program to implement stack and perform following using class and object?
            a) create an stack of size 10 using array
            b) insert 10 elements into stack using push and isfull method
            c) find factorial of difference between largest and smallest
               element of stack
            d) search any user defined element in stack using peak method
            e) delete 3 elements from stack using pop and isempty method
            f) display remaining element of stack */
import java.utl.Scanner;
class Stack
{
    int arr[]=new int[10];
    int top;
    int cap;
    Stack(int arr[])
    {
        this.arr=arr;
        this.top=top;
        this.cap=cap;
    }
    int create()
    {
        arr=
        cap=10;
        top=-1;
    }
    public void push(int n)
    {
        if(isFull())
        {
            System.out.println("hfih");
            exit(1);
        }
        System.out.println(n);
        arr[top++]=n;
    }
    
    
}

public class Assignment3_9 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the choice to perfom the task: ");
        java.util.Scanner sc=new Scanner(System.in);
        System.out.println("a) create an stack of size 10 using array");
        System.out.println("b) insert 10 elements into stack using push and isfull method");
        System.out.println("c) find factorial of difference between largest and smallest element of stack");
        System.out.println("d) search any user defined element in stack using peak method");
        System.out.println("e) delete 3 elements from stack using pop and isempty method");
        System.out.println("f) display remaining element of stack");
        char ch=sc.next().charAt(0);
        switch(ch)
        {
            case 'a':
                    
        }
    }
}
