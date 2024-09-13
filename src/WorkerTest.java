public class WorkerTest {
    public static void main(String[] args) {
        double hours = 15;
        Worker worker = new Worker("Bob", "Robert", "000001", "Cashier", 2005, 15.00, hours);


        System.out.println(worker.toString());
        System.out.println();
        System.out.println(worker.displayWeeklyPay(hours));
    }
}