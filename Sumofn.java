import java.util.Scanner;
//sum of all number till n
public class Sumofn {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        int ans=0;
        for(int i=1;i<=n;i++){
            ans+=i;
        }
        System.out.println(ans);
    }
}
