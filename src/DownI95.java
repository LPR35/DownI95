import java.util.Scanner;
//-----------------------------
public class DownI95 {

    private final static Scanner keyboard = new Scanner(System.in);
    //-----------------------------
// Constants
    private final static double TIME_STOP = 5.0/60.0;
    private final static double DISTANCE_STOP = 100;

    private final static double SPEED_LIMIT = 65;

    //----Variables----------------------
    public static void main (String[] args) {
        double userDistance, userTime, travelSpeed;

        welcome();

        System.out.println("Enter distance time to travel: ");
        userDistance = keyboard.nextDouble();

        System.out.println("Enter time available: ");
        userTime = keyboard.nextDouble();

        travelSpeed = calculations(userDistance, userTime);

        display(travelSpeed);
    }

    private static void display(double speed) {
        boolean over_speed_limit;
        System.out.println("You will have to travel at " + speed + " mph");
        if (speed > SPEED_LIMIT) {
            over_speed_limit = true;
        }
        else {
            over_speed_limit = false;
        }
        System.out.println("Over the speed limit: " + over_speed_limit);

    }
    private static void welcome() {
        System.out.println("Welcome to the I95 Speed Machine");
        System.out.println("+The distance you want to travel, in miles");
        System.out.println("+The time you have available in hours");
    }

    //-------------------------------------
    private static double calculations(double distance, double time) {

        double total_Time_Stop;
        double time_for_travel;
        double speed;

        total_Time_Stop = TIME_STOP * Math.ceil(distance / DISTANCE_STOP);
        time -= total_Time_Stop;
        speed = distance / time;

        return speed;
    }

}


