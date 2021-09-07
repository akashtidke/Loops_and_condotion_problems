import java.util.Scanner;
//largest number from given
public class largestNo {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a= scn.nextInt();
        int b= scn.nextInt();
        int c=scn.nextInt();
int max=a;
if(b>max){
    max=b;
} if(c>max){
    max=c;
        }
System.out.println(max);
    }
}
