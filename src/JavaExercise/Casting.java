package JavaExercise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Casting {

    public static void main(String[] args) throws Exception{


        //Assume this String "2022061351025"
        //Assume specification. first 8 digit is date, the rest of it is amount.
        //Convert the string to Date and Double

        // 15 minute to solve this problem?



        String text = "2022061351025";

        String dateInString = text.substring(0, 8);
        String amountInString = text.substring(8);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        Date date = formatter.parse(dateInString);
        //Wrapper Class
        double amount = Double.parseDouble(amountInString);

        System.out.println(date);
        System.out.println(amount);

        String math = "30322363553553";

        String dateToInt = math.substring(0,8);
        String amountToInt = math.substring(8);
        SimpleDateFormat format = new SimpleDateFormat("YYYYMMdd");
        Date date2 = format.parse(dateInString);

        double nm = Double.parseDouble(amountInString);
        System.out.println("Date " + date2);
        System.out.println("Amount :" + nm);

    }







}

