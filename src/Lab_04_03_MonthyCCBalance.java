public class Lab_04_03_MonthyCCBalance {
    static void main(){

        int startBalance = 5000;
        double interestRate = 0.17;
        double month1 = startBalance * interestRate;
        IO.println("The interest rate after 1 month is: $" + month1);
        double newBalance = month1 + startBalance;
        IO.println("The CC balance after 1 month is: $" + newBalance);

        double month2 = newBalance * interestRate;
        IO.println("The interest rate after 2 months is: $" + month2);
        double NewBalance = month2 + newBalance;
        IO.println("The CC balance after 2 months is: $" + NewBalance);



    }

}
