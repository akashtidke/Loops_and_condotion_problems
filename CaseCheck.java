import java.sql.SQLOutput;
import java.util.Scanner;
//check charcter upper case or lower case
public class CaseCheck {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        char ch=scn.next().charAt(0);
        if(ch>='a'&&ch<='z'){
            System.out.println("lowercase");
        }else{
            System.out.println("uppercase");
        }
    }
}
