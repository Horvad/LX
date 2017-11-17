import java.util.Scanner ;
public class les1_2 {
    public static void main (String args [])
    {
        System.out.print("Enter value: ");
        int user_value ;
        Scanner in = new Scanner(System.in) ;
        user_value = in.nextInt() ;
        int tmp ;
        tmp = 0 ;
        int gen_value ;
        int count ; //счетчик
        count = 0 ;
        while (tmp==0)
        {
            gen_value = (int)(Math.random()*6+1) ;
            System.out.println("cogenerated value: "+gen_value);
            if (gen_value!=user_value)
            {count=count+1 ;}
            else {tmp=1 ;}
        }
        System.out.println("Your points: " +count);
    }
}
