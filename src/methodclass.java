public class methodclass {
    public  static void main(String[]args){
        int num=5;
        factorial(num);
    }
    public static void factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        System.out.println(fact);
    }
}
