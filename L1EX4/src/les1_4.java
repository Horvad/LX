import java.util.Scanner ;
public class les1_4 {
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in) ;
        int user_value ;
        System.out.print("Enter value: ");
        user_value = in.nextInt() ;
        System.out.print("Enter level(1-3): ");
        int user_level ;
        user_level = in.nextInt() ;
        int tmp ;
        tmp=0 ;
        while (tmp==0)
        {
            if (user_level < 1||user_level>3)
            {
                System.out.print(" level was entered incompatibly. Enter level(1-3): ");
                user_level = in.nextInt() ;
            }
            else {tmp=1 ;}
        }
        int [] generate_value = new int[3] ;
        int i ;
        int j ;
        tmp=0 ;
        int tmp1 ;
        tmp1 = 0 ;
        int win_point ;
        win_point = 0 ;
        switch (user_level)
        {
            case 1: while (tmp==0)
                    {
                        generate_value[0] = (int)(Math.random()*6+1) ;
                        if (generate_value[0]!=user_value)
                        {win_point = win_point+1 ;}
                        else {tmp = 1 ;}
                        System.out.println("Generate value: "+generate_value[0]);
                    }
                    System.out.println("");
                    if (win_point!=0)
                    {System.out.print("Your points: "+win_point);}
                    else {System.out.print("You lost");}
                    break;
            case 2: tmp1 = 0 ;
                    while (tmp==0)
                    {
                        generate_value[0] = (int)(Math.random()*6+1) ;
                        generate_value[1] = (int)(Math.random()*6+1) ;
                        while (tmp1==0)
                        {
                            if (generate_value[0]==generate_value[1] )
                            {generate_value[1]=(int)(Math.random()*6+1);}
                            else {tmp1=1;} ;
                        }
                        if (generate_value[0]!=user_value&&generate_value[1]!=user_value)
                        {win_point = win_point+1 ;}
                        else {tmp = 1 ;}
                        System.out.println("Generate value: "+generate_value[0]+" "+generate_value[1]);
                    }
                    System.out.println("");
                    if (win_point!=0)
                    {System.out.print("Your points: "+win_point);}
                    else {System.out.print("You lost");}
                    break;
            case 3: tmp1 = 0 ;
                    tmp = 0 ;
                    while (tmp==0)
                    {
                       generate_value[0] = (int)(Math.random()*6+1) ;
                       generate_value[1] = (int)(Math.random()*6+1) ;
                       generate_value[2] = (int)(Math.random()*6+1) ;
                       while (tmp1==0)
                       {
                           if (generate_value[0]==generate_value[1] )
                           {generate_value[1]=(int)(Math.random()*6+1);}
                           else {tmp1=1;} ;
                       }
                       tmp1=0 ;
                       while (tmp1==0)
                       {
                           if (generate_value[0]==generate_value[2]||generate_value[1]==generate_value[2])
                           {generate_value[2]=(int)(Math.random()*6+1) ;}
                           else {tmp1=1 ;}
                       }
                       if (generate_value[0]!=user_value&&generate_value[1]!=user_value&&generate_value[2]!=user_value)
                       {win_point = win_point+1 ;}
                       else {tmp = 1 ;}
                       System.out.println("Generate value: "+generate_value[0]+" "+generate_value[1]+" "+generate_value[2]);
                    }
                    System.out.println("");
                    if (win_point!=0)
                    {System.out.print("Your points: "+win_point);}
                    else {System.out.print("You lost");}
                    break;
        }
    }
}
