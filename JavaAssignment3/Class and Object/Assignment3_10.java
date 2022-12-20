/*
   10) Write a program to implement queue and perform following using class and object ?
            a) create an queue of size 10 using array
            b) enqueue 10 elements into queue using enqueue method
            c) replace even numbers available in queue with nearest prime numbers
            d) display number of odd and prime numbers.
            e) dequeue 3 elements from queue using dequeue method
            f) display remaining element of queue.
 */
class Queue
{
    int[] arr = new int[10];
    int front = -1;
    int rear = -1;
    public void enqueue(int num)
    {
        if(isFull())
        {
            System.out.println("Queue is full");
        }else
        {
            rear++;
            arr[rear] = num;    
        }
    }
    public void display()
    {
        System.out.println("The elements are: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public void replaceEvenWithPrime()
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] % 2 == 0)
            {
                arr[i] = nearestPrime(arr[i]);
            }
        }
    }
        public int nearestPrime(int num)
        {
            int prime = 0;
            for(int i=num;i>0;i--)
            {
                if(isPrime(i))
                {
                    prime = i;
                    break;
                }
            }
        return prime;
        }
        public boolean isPrime(int num)
        {
            boolean flag = true;
            for(int i=2;i<num;i++)
            {
                if(num % i == 0)
                {
                    flag = false;
                    break;
                }
            }
            return flag;
        }
        public void displayOddAndPrime()
        {
            int odd = 0;
            int prime = 0;
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i] % 2 != 0)
                {
                    odd++;
                }
                if(isPrime(arr[i]))
                {
                    prime++;
                }
            }
            System.out.println("Number of odd numbers is " + odd);
            System.out.println("Number of prime numbers is " + prime);
        }
        public void dequeue()
        {
            if(isEmpty())
            {
                System.out.println("Queue is empty");
            }else
            {
                front++;
            }
        }
            public boolean isFull()
            {
                if(rear == arr.length-1)
                {
                    return true;
                }else
                {
                    return false;
                }
            }
            public boolean isEmpty()
            {
                if(front == rear)
                {
                    return true;
                }else
                {
                    return false;
                }
            }
    }

    public class Assignment3_10 
    {
        public static void main(String[] args) 
        {
            Queue obj = new Queue();
            obj.enqueue(1);
            obj.enqueue(2);
            obj.enqueue(3);
            obj.enqueue(4);
            obj.enqueue(5);
            obj.enqueue(6);
            obj.enqueue(7);
            obj.enqueue(8);
            obj.enqueue(9);
            obj.enqueue(10);
            obj.display();
            obj.replaceEvenWithPrime();
            obj.display();
            obj.displayOddAndPrime();
            obj.dequeue();
            obj.dequeue();
            obj.dequeue();
            obj.display();
        }
    }
