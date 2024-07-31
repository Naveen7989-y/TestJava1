import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the !st number");
        int  num1=sc.nextInt();
        System.out.println("enter the 2nd number");
        int num2=sc.nextInt();
        int hcfvalue=hcf(num1,num2);
        int lcmvalue=lcm(num1,num2);

        System.out.println("The HCF of the above two number="+hcfvalue);
        System.out.println("The LCM of the above two number="+lcmvalue);

    }
    public static int  hcf( int num1,int num2){
        while(num2!=0){
            int value=num2;
            num2=num1%num2;
            num1=value;
        }
        int hcfvalue=num1;
        return hcfvalue;
    }
    public static int lcm(int num1,int num2){
        hcf(num1,num2);
        int lcmvalue=num1*num2/hcf(num1,num2);
        return lcmvalue;
    }

}