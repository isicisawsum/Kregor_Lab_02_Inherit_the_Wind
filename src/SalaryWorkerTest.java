public class SalaryWorkerTest {
    public static void main(String[] args) {
        int annualSalary = 150000;
        SalaryWorker salworker = new SalaryWorker("Bob", "Robert", "000001", "Cashier", 2005, annualSalary);


        System.out.println(salworker.toString());
        System.out.println();
        System.out.println(salworker.calculateWeeklyPay(annualSalary));
        System.out.println(salworker.displayWeeklyPay(annualSalary));
    }
}