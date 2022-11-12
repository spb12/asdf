public class paymentslip {
    private String name;
    private int hourlyRate;
    private int hours;

    public double getTaxMultiplier() {
        return taxMultiplier;
    }

    private static double taxMultiplier = 0.7;

    public paymentslip() {
        }
        public paymentslip (String name, int hourlyRate, int hours){
            this.name = name;
            this.hourlyRate = hourlyRate;
            this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    public static int calculateSalary(int hourlyRate, int hours){
        return (hourlyRate*hours);
    }
        public static double calculateNetSalary (int hourlyRate, int hours, double taxMultiplier){
            return (hourlyRate*hours*taxMultiplier);
    }
    // test

}


