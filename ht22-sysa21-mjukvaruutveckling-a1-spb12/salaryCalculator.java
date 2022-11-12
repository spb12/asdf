import java.util.Scanner;

public class salaryCalculator {

        public static void main(String[] args) {

            paymentslip payslip = new paymentslip();
            double taxMultiplier = payslip.getTaxMultiplier();


            Scanner myScanner = new Scanner(System.in);
            System.out.println("What is your first name?");
            String name = myScanner.nextLine();
            System.out.println("What is your hourly rate?");
            int hourlyRate = myScanner.nextInt();
            System.out.println("How many hours have you worked?");
            int hours = myScanner.nextInt();
            System.out.println("-------\n ## PAYMENT INFORMATION ## \n");
            System.out.println("Name:   \t "                    + name);
            System.out.println("Hourly rate:   \t"  + '$' + hourlyRate);
            System.out.println("Hours Worked:  \t " + hours + "\n");
            System.out.println("Before tax:  \t " + '$' +  paymentslip.calculateSalary(hourlyRate, hours));
            System.out.println("After tax:  \t " + '$' + paymentslip.calculateNetSalary(hourlyRate, hours, taxMultiplier));
        }

    }

