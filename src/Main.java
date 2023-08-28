public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

     boolean AirAlarm = false ;
     boolean DayOfStudying = true ;
     boolean IamInKyiv = true ;

     boolean GoToAUK = true ;
     GoToAUK = ! AirAlarm  && DayOfStudying && IamInKyiv;
     System.out.println(GoToAUK);


    }
}