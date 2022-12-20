/*  3)WAP to check weather a number is palindrome number and divisible by 3 and 5 or not using custom exception and interface?*/

interface IPalindrome {
    public void checkPalindrome(int num) throws Exception;
}

class Palindrome {
    int num;
    public Palindrome(int num){
        this.num = num ;
    }
    public void isPalindrome() throws Exception{
        int temp = num;
        int sum = 0;
        while (temp > 0) {
            int rem = temp % 10;
            sum = sum * 10 + rem;
            temp = temp / 10;
        }
        if (sum == num) {
            throw new IllegalStateException("Palindrome Number");
        } else {
            throw new IllegalStateException("Not a Palindrome Number");
        }
    }
    public void isDivisible() throws Exception{
        if (num % 3 == 0 && num % 5 == 0) {
            throw new IllegalStateException("Divisible by 3 and 5");
        } else {
            throw new IllegalStateException("Not Divisible by 3 and 5");
        }
    }
}

class Assignment4_3 {
    public static void main(String[] args) {
        Palindrome obj = new Palindrome(121);
        try {
            obj.isPalindrome();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            obj.isDivisible();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
