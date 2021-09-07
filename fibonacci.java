import java.util.Scanner;

public class fibonacci {
    //find fibonacci till n
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a=0;
        int b=1;
        int n=scn.nextInt();

        for(int i=0;i<=n;i++){

            int c=a+b;
         System.out.println(a);
            a=b;
            b=c;

        }

    }
}
