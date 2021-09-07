import java.util.Scanner;
//check how many time given number repeted
public class count_Occurance {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int num=scn.nextInt();
        int count=0;
        while(n!=0){

            int r=n%10;
            n=n/10;
            if(r==num){
                count++;
            }

        }
        System.out.println(count);
    }
}
