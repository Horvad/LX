import java.util.Scanner ;
public class Lesson3_3 {
//    public int applePetia = 10 ;
//    public int appleAll = 15 ;
    public static void main (String [] args)
    {
        int applePetia = 10;
        int appleVasia ;
        int appleAll = 15;
//        appleVasia = appleAll - applePetia ;
        appleVasia = calcule(appleAll,applePetia) ;
//        System.out.println("Apples Vasia = "+appleVasia);
        print(appleVasia);
    }

    static int calcule (int appleAll, int applePetia)
    {
        int aplleVasia ;
        aplleVasia = appleAll-applePetia ;
        return aplleVasia ;
    }
    public static void print (int apples)
    {
        System.out.print("Apples Vasia: "+apples);
    }
}
