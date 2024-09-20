package JavaExercise;

public class Ternary {

    public static void main(String[] args) {
     int num = 2234454;
     int reverse = 0;
     while( num != 0){
         reverse = reverse * 10 + num % 10;
         num = num / 10;

     }
        System.out.println("Reversed Number : " + reverse);


     int age = 20;
     String message = "";
     message = (age <31) ? "He is not allowed to drink alchohol" : " He is allowed to drink alchohol";
        System.out.println("what is the outcome : "+ message );
    }

}
