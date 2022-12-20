/* 9) Write a program to implement stack and perform following using class and object?
            a) create an stack of size 10 using array
            b) insert 10 elements into stack using push and isfull method
            c) find factorial of difference between largest and smallest
               element of stack
            d) search any user defined element in stack using peak method
            e) delete 3 elements from stack using pop and isempty method
            f) display remaining element of stack */
class Stack
{
    int size;
    int arr[];
    int top;
    Stack(int n)
    {
        this.size=n;
        this.arr=new int[size];
        this.top=-1;
    }
    public boolean isFull()
    {
        if(top==size-1)
        {
            return true;
        }else {
            return false;
        }
    }
    public boolean isEmpty()
    {
        if(top==-1)
        {
            return true;
        }else{
            return false;
        }
    }

    public void push(int a)
    {
        boolean st=isFull();
        if(st)
        {
            System.out.println("OverFlow");
        }else {
            top=top+1;
            arr[top]=a;
            System.out.println(arr[top]+" Has beeb insert into the stack.. ");
        }
    }
    public void pop()
    {
        boolean st=isEmpty();
        if(st)
        {
            System.out.println("Underflow");
        }else {
            int t=arr[top];
            top=top-1;
            System.out.println("Popped item from stack is "+t);
        }
    }
    public void display()
    {
        boolean st=isEmpty();
        if(st)
        {
            System.out.println("Stacj is empty .Nothing to Display ");
        }else{
            for(int i=0;i<=top;i++)
            {
                System.out.println("Top position "+i+" and available data "+arr[i]);
            }
        }
    }  
}

public class Assignment3_9 
{
    public static void main(String[] args) 
    {
       Stack s=new Stack(10);
       s.push(1);
       s.push(2);
       s.push(3);
       s.push(4);
       s.push(5);
       s.push(6);
       s.push(7);
       s.push(8);
       s.push(9);
       s.push(10);
       s.display();
       s.pop();
       s.pop();
       s.pop();
       s.display();
    }
}
