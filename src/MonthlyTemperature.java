import java.util.Scanner;
public class MonthlyTemperature {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char clicked;
        double[][] temperature;
        temperature = new double[4][7];
        do {
            System.out.println();
            System.out.println("[1] Enter temperatures");
            System.out.println("[2] Display all");
            System.out.println("[3] Display one week");
            System.out.println("[4] Display day one of the week");
            System.out.println("[5] Exit");
            clicked = sc.next().charAt(0);
            System.out.println();
            switch (clicked) {
                case '1':
                    enterTemps(temperature);
                    break;
                case '2':
                    displayAllTemps(temperature);
                    break;
                case '3':
                    displayWeek(temperature);
                    break;
                case '4':
                    displayDays(temperature);
                    break;
                case '5':
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Error: Options 1-5 only!");
            }

        } while (clicked != '5');
    }

    //method to display temperature for a single day
    private static void displayDays(double[][] temperature) {
        int day;
        System.out.println("Enter number of days: ");
        day = sc.nextInt();
        while (day < 1 || day > 7) {
            System.out.println("Invalid day number");
            System.out.println("Enter again (1-7)only");
            day = sc.nextInt();
        }
        System.out.println();
        System.out.println("**Temperature entered for day " + day + "**");
        System.out.println();
        for (int week = 1; week <= temperature.length; week++) {
            System.out.println("week " + week + "day " + day + ":" + temperature[week - 1][day - 1]);
        }

    }


    //method to display weekly temperature
    private static void displayWeek(double[][] temperature) {
        System.out.println("Enter week number(1-4)");
        int week = sc.nextInt();
        while(week<1 || week>4){
            System.out.println("Invalid week number");
            System.out.println("Enter again (1-4)only");
            week = sc.nextInt();
        }
        System.out.println();
        System.out.println("**Temperature entered for week "+week+"**");
        System.out.println();
        for (int day =1; day<=temperature[0].length;day++){
            System.out.println("week "+week+"day "+day+":"+temperature[week-1][day-1]);
        }

    }
    //method to display temperature
    private static void displayAllTemps(double[][] temperature) {
        for (int week =1; week <=temperature.length; week++){
            for (int day=1; day<=temperature[0].length; day++){
                System.out.println("week" +week+ "day" +day+ ":" + temperature[week-1][day-1]);
            }
        }
    }

    //methods to enter temperature
    private static void enterTemps(double[][] temperature) {
        for (int week =1; week <=temperature.length; week++){
            for (int day=1; day<=temperature[0].length; day++){
                System.out.println("Enter temperature for week " + week + "and day" + day);
                temperature[week-1][day-1] = sc.nextDouble();
            }
        }
    }

}
