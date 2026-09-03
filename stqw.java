import java.util.Scanner;

public class stqw {
      static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Day: ");
        int day = sc.nextInt();
        System.out.print("Enter Month: ");
        int month = sc.nextInt();
        System.out.print("Enter Year: ");
        int year = sc.nextInt();
        boolean valid = true;

        if(year<=0){
            valid = false;
        }
    }
}

