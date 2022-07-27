import java.util.*;
public class Practical5 {
    
    public void recursion(int r)
    {
        if (r == 0) {
            return;
        }
        System.out.print("* ");
        recursion(r-1);
    }
    public void rec(int r, int i)
    {
        if (r == 0) {
            return;
        }
        recursion(i);
        System.out.println();
        rec(r-1, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int row = sc.nextInt();
        Practical5 p5 = new Practical5();
        p5.rec(row,1);
        sc.close();
    }

}
