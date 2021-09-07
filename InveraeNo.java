import java.util.Scanner;

public class InveraeNo {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int i=0;
        int p=1;
        while(n!=0){
            int r=n%10;
            n=n/10;
            i+=p*Math.pow(10,r-1);
            p++;
        }
        System.out.println(i);
    }
}
