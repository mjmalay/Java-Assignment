import java.util.Scanner;

/*
    8. Write a program to find following data of student using mark of four subjects like C, C++, Java, and Python. Mark of 4 subjects will be accepted at the run time and 
       credit of all the mentioned subject is 3?
              a) Grade of 4 subjects?
              b) Total Mark and %age of mark secured by Students?
              c) SGPA of Student?
 */
import java.util.Scanner;
public class Assignment2_8 
{
    public static void main(String[] args) 
    {
       int C_mark,CPP_mark,Java_mark,Python_mark;
       int total_mark=0;
       float percentage=0;
       char choice;   
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the marks of four subjects (C,C++,Java,Python) : ");
       System.out.print("Mark of C : ");
       C_mark=sc.nextInt();
       System.out.print("Mark of C++ : ");
       CPP_mark=sc.nextInt();
       System.out.print("Mark of Java : ");
       Java_mark=sc.nextInt();
       System.out.println("Mark of Python : ");
       Python_mark=sc.nextInt();


       System.out.println("Enter choice to find out :\n a) Grade of 4 subjects? \n b) Total Mark and %age of mark secured by Students? \n c) SGPA of Student?");
       choice=sc.next().charAt(0);
       switch(choice)
       {
        //    case 'a' :
        //              if(C_mark)

            case 'b' :
                      total_mark=C_mark+CPP_mark+Java_mark+Python_mark;
                      percentage=total_mark/4;
                      System.out.println(" Total Mark and %age of mark secured by Students : "+total_mark+" And "+percentage+"%");
                      break;
          //  case 'c': 
                    
       }
       
    }    
}
