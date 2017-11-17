import java.text.SimpleDateFormat;
import java.util.Scanner ;
import java.util.Date ;
public class Lesson_2 {
    long milliseconds ;
    long seconds ;
    int day ;
    int mounth ;
    int _year ;
    int hour ;
    int min ;
    int sec ;
    public static void main (String args [])
    {
        int Zzz ;
        Zzz = 41 ;
        if (Zzz>40&&42>Zzz) {} else {System.out.print("dsadasdas");};
        long milisecoonds ;
        System.out.print("Enter miliseconds ") ;
        Scanner in = new Scanner(System.in) ;
        milisecoonds = in.nextLong() ;
        long seconds ;
        seconds = milisecoonds/1000 ;
        int Lesson ;
        System.out.print("Enter Lesson (1..4) ");
        Lesson = in.nextInt() ;
        switch (Lesson)
        {
            case 1: Lesson2_1(seconds);
                    break;
            case 2: Lesson2_2(seconds);
                    break;
            case 3: Lesson2_3(seconds);
                    break;
            case 4: Lesson2_4(milisecoonds);
                    break;
        }
    }





    public static void Lesson2_1 (long seconds)
    {
        long sec ;
        long hour ;
        long min ;
        min = seconds/60 ;
        sec = seconds%60 ;
        hour = min/60 ;
        min = min%60 ;
        while (hour>=24)
        {hour=hour-24 ;}
        System.out.println(hour+":"+min+":"+sec);
    }





    public static void Lesson2_2 (long seconds)
    {
        long sec ;
        long hour ;
        long min ;
        int day ;
        min = seconds/60 ;
        sec = seconds%60 ;
        hour = min/60 ;
        min = min%60 ;
        day = (int)(hour/24) ;
        hour = hour % 24 ;
        int _year ;
        int tmp_day ;
        int close_day ;
        int leap_year ;
        int _mounth ;
        leap_year = 2 ;
        close_day = day%365 ;
        _year = 1970 ;
        while (close_day!=0)
        {
            leap_year = leap_year+1 ;
            close_day = day/365 ;
            if (close_day==0) {break;}
            _year = _year + 1 ;
            day = day-365 ;
            if (leap_year==5)
            {
                day = day - 1 ;
                leap_year=1 ;
            }
        }
        if (day==0) {day = 1 ;}
        _mounth = 0 ;
        if (day<32) {_mounth = 1;}
       tmp_day =day ;
        if (leap_year!=0)
        {
            if (tmp_day>31) {_mounth = 2; day = tmp_day-31 ;} //31 28
            if (tmp_day>59) {_mounth = 3; day = tmp_day-59 ;} //59 31
            if (tmp_day>90) {_mounth = 4; day = tmp_day-90 ;} //90 30
            if (tmp_day>120) {_mounth = 5; day = tmp_day-120 ;} //31
            if (tmp_day>151) {_mounth = 6; day = tmp_day-151 ;} //30
            if (tmp_day>181) {_mounth = 7; day = tmp_day-181 ;} //31
            if (tmp_day>212) {_mounth = 8; day = tmp_day-212 ;} //31
            if (tmp_day>243) {_mounth = 9; day = tmp_day-243 ;} //30
            if (tmp_day>273) {_mounth = 10; day = tmp_day-273 ;} //31
            if (tmp_day>303) {_mounth = 11; day = tmp_day-303 ;} //30
            if (tmp_day>334) {_mounth = 12; day = tmp_day-334 ;} //31
        } else
        {
            if (tmp_day>32) {_mounth = 2; day = tmp_day-32 ;} //31 28
            if (tmp_day>60) {_mounth = 3; day = tmp_day-60 ;} //59 31
            if (tmp_day>91) {_mounth = 4; day = tmp_day-91 ;} //90 30
            if (tmp_day>121) {_mounth = 5; day = tmp_day-121 ;} //31
            if (tmp_day>152) {_mounth = 6; day = tmp_day-152 ;} //30
            if (tmp_day>182) {_mounth = 7; day = tmp_day-182 ;} //31
            if (tmp_day>213) {_mounth = 8; day = tmp_day-213 ;} //31
            if (tmp_day>244) {_mounth = 9; day = tmp_day-244 ;} //30
            if (tmp_day>274) {_mounth = 10; day = tmp_day-274 ;} //31
            if (tmp_day>304) {_mounth = 11; day = tmp_day-304 ;} //30
            if (tmp_day>335) {_mounth = 12; day = tmp_day-335 ;} //31
        }
        System.out.println(day+"-"+_mounth+"-"+_year+" "+hour+":"+min+":"+sec);
    }




    public static void Lesson2_3 (long seconds)
    {
        long sec ;
        long hour ;
        long min ;
        int day ;
        int start_year ;
        start_year = 1970 ;
        boolean negative_year ;
        negative_year = false ;
        if (seconds<0)
        {
         while (seconds<0)
         {
             seconds = seconds+((365*24*60*60)*4)+(24*60*60) ;
             negative_year =true ;
             start_year = start_year-4 ;
         }
        }
        min = seconds/60 ;
        sec = seconds%60 ;
        hour = min/60 ;
        min = min%60 ;
        day = (int)(hour/24) ;
        hour = hour % 24 ;
        int _year ;
        int tmp_day ;
        int close_day ;
        int leap_year ;
        int _mounth ;
        leap_year = 3 ;
        close_day = day/365 ;
        _year = start_year ;
        //-----------------------------------------coutn year--------------------------------
        while (close_day!=0)
        {
            leap_year = leap_year+1 ;
            close_day = day/365 ;
            if (close_day==0) {break;}
            _year = _year + 1 ;
            day = day-365 ;
            if (leap_year==5)
            {
                day = day - 1 ;
                leap_year=1 ;
            }
        }
        _mounth = 0 ;
        day = day+1 ;
        //-----------------------------------------choise mounth-----------------------------------
        if (day<32) {_mounth = 1;}
        tmp_day =day ;
        if (leap_year!=0)
        {
            if (tmp_day>31) {_mounth = 2; day = tmp_day-31 ;} //31 28
            if (tmp_day>59) {_mounth = 3; day = tmp_day-59 ;} //59 31
            if (tmp_day>90) {_mounth = 4; day = tmp_day-90 ;} //90 30
            if (tmp_day>120) {_mounth = 5; day = tmp_day-120 ;} //31
            if (tmp_day>151) {_mounth = 6; day = tmp_day-151 ;} //30
            if (tmp_day>181) {_mounth = 7; day = tmp_day-181 ;} //31
            if (tmp_day>212) {_mounth = 8; day = tmp_day-212 ;} //31
            if (tmp_day>243) {_mounth = 9; day = tmp_day-243 ;} //30
            if (tmp_day>273) {_mounth = 10; day = tmp_day-273 ;} //31
            if (tmp_day>303) {_mounth = 11; day = tmp_day-304 ;} //30
            if (tmp_day>334) {_mounth = 12; day = tmp_day-334 ;} //31
        } else
        {
            if (tmp_day>32) {_mounth = 2; day = tmp_day-32 ;} //31 28
            if (tmp_day>60) {_mounth = 3; day = tmp_day-60 ;} //59 31
            if (tmp_day>91) {_mounth = 4; day = tmp_day-91 ;} //90 30
            if (tmp_day>121) {_mounth = 5; day = tmp_day-121 ;} //31
            if (tmp_day>152) {_mounth = 6; day = tmp_day-152 ;} //30
            if (tmp_day>182) {_mounth = 7; day = tmp_day-182 ;} //31
            if (tmp_day>213) {_mounth = 8; day = tmp_day-213 ;} //31
            if (tmp_day>244) {_mounth = 9; day = tmp_day-244 ;} //30
            if (tmp_day>274) {_mounth = 10; day = tmp_day-274 ;} //31
            if (tmp_day>305) {_mounth = 11; day = tmp_day-305 ;} //30
            if (tmp_day>335) {_mounth = 12; day = tmp_day-335 ;} //31
        }
        String negative_year_write ;
        if (negative_year == false) {negative_year_write = " A.D";} else {negative_year_write = " B.C" ;}
        {System.out.println(day+"-"+_mounth+"-"+_year+" "+hour+":"+min+":"+sec+negative_year_write);}
    }





    public static void Lesson2_4 (long milliseconds)
    {
        long milisec = milliseconds ;
        Date date = new Date(milliseconds) ;
        SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss") ;
        System.out.println(format1.format(date));
        SimpleDateFormat format2 = new SimpleDateFormat("EEEEEEEEE MMMMMMM dd HH:mm:ss" ) ;
        System.out.print(format2.format(date));
        System.out.print(" MSK ");
        SimpleDateFormat format3 = new SimpleDateFormat("yyyy") ;
        System.out.println(format3.format(date));
    }
}
