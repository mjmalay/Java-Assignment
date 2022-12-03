import java.util.Scanner;

public class Test 
{
    public static void main(String[] args) 
    {
        int m,v=0,md=0;
        char g;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the mark : ");
        m=sc.nextInt();
        
        if(m>=0 && m<35)
        {
            v=m/10;
        }
        if(m>=35 && m<=50)
        {
            v=4;

        }

        else if(m==60 || m==70 || m==80 || m==90 || m==100)
        {
            v=(int)(m/10)-1;
        }
        else if(m>50 || m>60 || m>70 || m>80 || m>90 || m<100)
        {
                v=m/10;
        }
       

        switch(v)
        {
            case 0:
                g='F';
                break;
            case 1:
                g='F';
                break;
            case 2:
                g='F';
                break;
            case 3:
                g='F';
                break;
            case 4:
                g='D';
               break;
            case 5:
                g='C';
                break;
            case 6:
                g='B';
                break; 
            case 7:
                g='A';
                break;
            case 8:
                g='E';
                break;
            case 9:
                g='O';
                break;
            default:
                g='s';
                System.out.println("Mark should be 0 to 100 ,please give the valid mark to find the grade : ");
               
        }
        System.out.println("The mark is "+ m + " Grade is "+g);
    }    
}
