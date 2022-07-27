import java.util.Scanner;
class Practical4 {
    char answer[][] = new char[8][10];
    char key[] = {'D','B','D','C','C','D','A','E','A','D'};

    public void getAnswer()
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            System.out.println("Enter answer of Student - "+i);
            for (int j = 0; j < 10; j++) {
                answer[i][j] = sc.next().charAt(0);
            }
        }
    }
    void checkAnswer()
    {
        for (int i = 0; i < 8; i++) {
            int count = 0;
            for (int j = 0; j < 10; j++) {
                if(answer[i][j] == key[j])
                {
                    count++;
                }
            }
            System.out.println("Marks of Student - "+i+" : "+count);
        }
    }
    public static void main(String[] args) {
        
        Practical4 p = new Practical4();
        p.getAnswer();
        System.out.println("\n");
        p.checkAnswer();
    }    
}
