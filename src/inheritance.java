class grandfather{
    String name="Kailash";
    String height="Tall";
}
class father extends grandfather{
    String nature="calm";
}
public class inheritance extends father {
    public static void main(String[]args){
        father  f =new father();
        System.out.println(f.height);
    }

}
