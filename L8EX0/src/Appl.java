import java.util.Scanner ;
public class Appl {
    public static Scanner consleIn = new Scanner(System.in) ;

    public static void main(String args[]){
        System.out.print("Введите номер задания: ");
        int numerEx = consleIn.nextInt();
        switch (numerEx){
            case 1:
                ex1(1) ;
                break;
            case 2:
                ex2(1);
                break;
            case 3:
                NamedEntity pasha = new NamedEntity("Паша") ;
                String name = pasha.toString() ;
                System.out.println("Name = "+name);

                NamedEntity dima = new NamedEntity("Дима") ;
                name = dima.toString() ;
                System.out.println("Name = "+name);

                NamedEntity yulia = new NamedEntity("Юля") ;
                System.out.println("Name = "+ yulia.toString());

                NamedEntity lesha = new NamedEntity("Lesha") ;
                System.out.println("Name = "+lesha.toString());

                NamedEntity andrey = new NamedEntity("Andrey") ;
                System.out.println("Name = "+andrey.toString());
                break;
            case 4:
                int array[] = new int [1] ;
                try {
                    //err= new  ArrayIndexOutOfBoundsException() ;
                    array [2] = 0 ;
                } catch (ArrayIndexOutOfBoundsException err) {System.out.print("dsada");}
                break;
            case 5:
                print();
                print(1);
                print(1,2);
                print("s");
                print("s","s");
                break;
            default:
                System.out.print("Вы ввели не верное число");
                break;
        }
    }

    //-------------------------------------------------------------------------
    public static void ex1(int t){
        System.out.println("Введите массив: ");
        float arr[] = new float[10] ;
        int negativeArr = 0;
        for (int i = 0 ; i<10; i++){
            System.out.print("arr["+i+"]=");
            arr[i] = consleIn.nextFloat() ;
            if (arr[i]<0) {
                negativeArr = negativeArr+1 ;
            }
        }
        System.out.print("Колличество отрицательных чисел: "+negativeArr);
    }
    //---------------------------------------------------------------------------
    public static void ex2(int t){
        float arr[] = new float[1000] ;
        float sredArifm1_250 = 0;
        float sredArifm250_500 = 0;
        float sredArifm500_750 = 0;
        float sredArifm750_1000 = 0;

        for (int i = 0; i<250; i++){
            arr[i] = (float) Math.random();
            sredArifm1_250 = sredArifm1_250+arr[i] ;
        }
        sredArifm1_250 = sredArifm1_250/250 ;

        for (int i = 249 ; i<500; i++){
            arr[i] = (float) Math.random() ;
            sredArifm250_500 = sredArifm250_500+arr[i] ;
        }
        sredArifm250_500 = sredArifm250_500/250 ;


        for (int i = 499 ; i<750; i++){
            arr[i] = (float) Math.random() ;
            sredArifm500_750 = sredArifm500_750+arr[i] ;
        }
        sredArifm500_750 = sredArifm500_750/250 ;

        for (int i = 749 ; i<1000; i++){
            arr[i] = (float) Math.random()*1000 ;
            sredArifm750_1000 = sredArifm750_1000+arr[i] ;
        }
        sredArifm750_1000 = sredArifm750_1000/250 ;

        if (sredArifm1_250>sredArifm250_500&&sredArifm1_250>sredArifm500_750&&sredArifm1_250>sredArifm750_1000){
            System.out.println("Наибольшее свреднее орифметическое 1-250 чисел, оно равно: "+sredArifm1_250);
        } else {
            if (sredArifm250_500>sredArifm500_750&&sredArifm250_500>sredArifm750_1000){
                System.out.println("Наибольшее среднее аифметическое 250-500 чилес, оно равно: "+sredArifm250_500);
            } else {
                if (sredArifm500_750>sredArifm750_1000){
                    System.out.println("Наибольшее среднее аифметическое 500-750 чиcek, оно равно: "+sredArifm500_750);
                } else {System.out.println("Наибольшее среднее аифметическое 750-1000 чилес, оно равно: "+sredArifm750_1000);}
            }
        }
    }
    //-------------------------------------------------------------------------------------------------------------------
    static void print (){
        System.out.println("Нет входящих даннын");
    }

    static void print(int i){
        System.out.println("Входящие данные int i");
    }
    static void print(int i, int j){
        System.out.println("Входящие данные int i, int j");
    }
    static void print(String str){
        System.out.println("Входящие данные String str");
    }

    static void print(String str, String stri){
        System.out.println("Входящие данные String str, String stri");
    }
}

