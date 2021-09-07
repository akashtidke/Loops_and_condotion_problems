import java.util.Scanner;

public class rotateN0 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num= scn.nextInt();
        int k=scn.nextInt();
        int count=0;
        int n=num;
        while (n!=0){
n=n/10;
count++;
        }
 k=k%count;
        if(k<0){
            k=k+count;
        }
        int div=(int)Math.pow(10,k);
        int mult=(int)Math.pow(10,count-k);
        int q=num/div;
        int r=num%div;
        int ans=(r*mult)+q;
        System.out.println(ans);


    }
}
