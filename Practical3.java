import java.util.Scanner;

class Practical3 {

    public boolean checkNumber(int n1, int n2) {
        int count1 = 0;
        int num1 = n1;
        int num2= n2;
        while (n1 > 0) {
            n1 = n1 / 10;
            count1++;
        }
        int count2 = 0;
        while (n2 > 0) {
            n2 = n2 / 10;
            count2++;
        }
        for(int i = 0; i < count1-1; i++) 
        {
            num1 = num1 / 10;
        }
        for(int j = 0; j < count2-1; j++) 
        {
            num2 = num2 / 10;
        }
        if(num1==num2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter two numbers : ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        Practical3 p = new Practical3();
        if (p.checkNumber(num1, num2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        sc.close();
    }
}
