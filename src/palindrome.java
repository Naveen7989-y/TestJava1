import java.util.*;
public class palindrome {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your String");
        String str=sc.next();
        String reversestr="";
        for(int i=str.length()-1;i>=0;i--){
               reversestr+=str.charAt(i);

        }
        System.out.println(reversestr);
        if(str.equals(reversestr)){
            System.out.println("    This string  is palindrome") ;
        }else{
            System.out.println("     This string is not a palindrome") ;
        }
    }
}
