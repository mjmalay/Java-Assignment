// 5(II). find the face value and position value of any 4 digit number
class Assignment1_5ii
{
    public static void main(String[] args)
     {
        int num=1234;
        int num1,num2,num3,num4;
        num1=num/1000;num=num%1000;
        num2=num/100;num=num%100;
        num3=num/10;num=num%10;num4=num;
        System.out.println("Face value of "+num1+" is "+num1+"\n"+"Face value of "+num2+" is "+num2+"\n"+"face value of "+num3+" is "+num3+"\n"+"face value of "+num4+" is "+num4);
        num=1234;

        num1=num/1000;num=num%1000;num1=num1*1000;
        num2=num/100;num=num%100;num2=num2*100;
        num3=num/10;num=num%10;num4=num;num3=num3*10;

        System.out.println("position value of "+num1+" is "+num1+"\n"+"position value of "+num2+" is "+num2+"\n"+"position value of "+num3+" is "+num3+"\n"+"position value of "+num4+" is "+num4);

    }
}