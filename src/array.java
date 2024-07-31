import java.util.Arrays;
public class array {
    public static void main(String[]args){
        int array1[]={1,2,2,3,3,3};
        int array2[]={1,2,2,3,3,2};
        boolean result=Arrays.equals(array1, array2);
        if(result==true){
            System.out.println("arrays are equal");
        }else{
            System.out.println("arrays are not equal");
        }
    }
}
