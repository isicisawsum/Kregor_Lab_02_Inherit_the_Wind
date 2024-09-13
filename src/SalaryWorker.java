public class SalaryWorker extends Worker {

    private double annualSalary;

    @Override
    public String toString() {
        return "SalaryWorker{" + super.toString() +
                ",annualSalary=" + annualSalary +
                "}";
    }

    public SalaryWorker(String firstName, String lastName, String ID, String title, int YOB, double annualSalary) {
        super(firstName,
                lastName,
                ID,
                title,
                YOB,
                0,
                0
                );


        this.annualSalary = annualSalary;
    }

    public double calculateWeeklyPay(double annualSalary){
        return annualSalary/52;
    }
    public String displayWeeklyPay(double annualSalary) {
        double weeklyPay = annualSalary / 52;  // Calculate weekly pay
        double roundedWeeklyPay = Math.round(weeklyPay / 10.0);  // Round to nearest tenth

        return roundedWeeklyPay + " (" + annualSalary + " / 52)";
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
}
