import java.util.*;
public class factor {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number for Calculating the factors of Number");
        int Number=sc.nextInt();
        factors(Number);
    }
    public static void factors(int Number){
        for(int i=1;i<=Number;i++){
            if(Number%i==0){
                System.out.print(i+", ");
            }
        }
        System.out.print("are the factors of the Given Number  "+Number);

    }
}
