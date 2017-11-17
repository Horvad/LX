import java.util.Scanner ;
public class les1_3 {
    public static void main (String[] args )
    {
        System.out.print("Enter value: ");
        int user_value ;
        Scanner in = new Scanner(System.in) ;
        user_value = in.nextInt() ;
        int i ;
        int tmp ;
        int tmp1 ;
        tmp1=0 ;
        tmp=0 ;
        int point ;
        point = 0 ;
        int [] gen_value = new int[3] ;
        while (tmp==0)
        {
            gen_value[0] = (int) (Math.random() * 6 + 1);
            for (i = 1; i < 3; i++) {
                gen_value[i] = (int) (Math.random() * 6 + 1);
                for (int j = 0; j < i; j++) {
                    if (gen_value[i] == gen_value[j]) {
                        gen_value[i] = (int)(Math.random() * 6 + 1);
                        j = -1;
                    }
                }
            }
            System.out.print("Generate value: ");
            for (i = 0; i < 3; i++)
            {System.out.print(gen_value[i]+" "); }
            System.out.println("");
            if (gen_value[0]!=user_value&&gen_value[1]!=user_value&&gen_value[2]!=user_value)
            {point=point+1 ;} else {tmp=1 ;}
        }
        if (point!=0) {System.out.print("Your points: "+point);} else {System.out.print("You lost");}
    }
}
