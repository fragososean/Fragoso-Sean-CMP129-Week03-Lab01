import java.util.Scanner;
public class DateTest {
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        Date d1 = new Date();
        int d, m, y;
        String M = null;

        System.out.println("Use only numerics in your input.");

        System.out.print("Enter the Month: ");
        m = input.nextInt();
        while(m<1 || m>12){
            System.out.print("That number is not accepted.\nEnter the Month: ");
            m = input.nextInt();
        }

        d1.setMonthi(m);

        if(m == 1){
            M = "January";
        }

        if(m == 2){
            M = "February";
        }

        if(m == 3){
            M = "March";
        }

        if(m == 4){
            M = "April";
        }

        if(m == 5){
            M = "May";
        }

        if(m == 6){
            M = "June";
        }

        if(m == 7){
            M = "July";
        }

        if(m == 8){
            M = "August";
        }

        if(m == 9){
            M = "September";
        }

        if(m == 10){
            M = "October";
        }

        if(m == 11){
            M = "November";
        }

        if(m == 12){
            M = "December";
        }

        d1.setMonthS(M);

        System.out.print("Enter the Day: ");
        d = input.nextInt();
        while(d<1 || d>31){
            System.out.print("That number is not accepted.\nEnter the Day: ");
            d = input.nextInt();
        }
            while(d>29 && m == 2){
                System.out.print("That number is not accepted.\nEnter the Day: ");
                d = input.nextInt();
            }
            while(d>30 && m == 4){
                System.out.print("That number is not accepted.\nEnter the Day: ");
                d = input.nextInt();
            }

            while(d>30 && m == 6){
                System.out.print("That number is not accepted.\nEnter the Day: ");
                d = input.nextInt();
            }
            
            while(d>30 && m == 9){
                System.out.print("That number is not accepted.\nEnter the Day: ");
                d = input.nextInt();
            }

            while(d>30 && m == 11){
                System.out.print("That number is not accepted.\nEnter the Day: ");
                d = input.nextInt();
            }
        d1.setDay(d);

        System.out.print("Enter the Year: ");
        y = input.nextInt();
        d1.setYear(y);

        d1.getDate();

    }
}
