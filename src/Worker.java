public class Worker extends Person {

    private double hourlyPayRate;
    private double hoursWorked;
    public String toString(){
        return "Worker{" + super.toString() + ", hourlyPayRate=" + hourlyPayRate + ", hoursWorked=" + hoursWorked + "}";
    }

    public Worker(String firstName, String lastName, String ID, String title, int YOB, double hourlyPayRate, double hoursWorked) {
        super(firstName, lastName, ID, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateWeeklyPay(double hoursWorked){
        if (hoursWorked <= 40) {
            return hoursWorked * hourlyPayRate;
        }
        else {
            return 40 * hourlyPayRate + (hoursWorked - 40) * (hourlyPayRate * 1.5);
        }
    }

    public String displayWeeklyPay(double hoursWorked){
        String result;
        if (hoursWorked > 40){
            result = "#Of regular hours: 40\nPay for regular hours: " + (40 * hourlyPayRate) +  "\n#Of overtime hours: " + (hoursWorked - 40) + "\nPay for overtime hours: " + ((hoursWorked - 40) * (hourlyPayRate * 1.5)) + "\nTotal pay: " + ((40 * hourlyPayRate) + ((hourlyPayRate * 1.5) * (hoursWorked - 40)));
        } else {
            result = "#Of regular hours: " + hoursWorked + "\nPay for regular hours: " + (hoursWorked * hourlyPayRate) + "\n#Of overtime hours: 0" + "\nPay for overtime hours: 0" + "\nTotal pay: " + (hoursWorked * hourlyPayRate);
        }
        return result;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
