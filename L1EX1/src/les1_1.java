import java.util.Scanner ;
public class les1_1 {
    public static void main (String args [])
    {
        System.out.print("Enter value: ");
        int polz_chislo ; //Число вводимое пользователем
        Scanner in = new Scanner(System.in) ;
        polz_chislo = in.nextInt() ;
        int gen_chislo ; //Число генерируемое компьютером
        gen_chislo = (int)(Math.random()*6+1) ;
        String tmp ;
        System.out.println("cogenerated value: "+gen_chislo);
        if (gen_chislo!=polz_chislo)
        {
            System.out.println("You winner");
        }
        else
            {
                System.out.println("You lost");
            }
    }
}
