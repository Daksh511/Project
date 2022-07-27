import java.util.Scanner;

class Practical2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number as the following format : ");
        System.out.println("+91-XX-XXX-XXXXX");
        for (;;) {
            String number = sc.nextLine();
            if (number.length() == 16) {
                String[] split_string = number.split("-");
                System.out.println("Mobile Operator : " + split_string[1]);
                System.out.println("MSC : " + split_string[2]);
                System.out.println("Unique Number: " + split_string[3]);
                System.out.println("\n21CS007_Dakshkumar Darji");
                sc.close();
                break;
            } else {
                System.out.println("Invalid Format!!!");
                System.out.println("Enter Again------>");
            }

        }

    }
}
