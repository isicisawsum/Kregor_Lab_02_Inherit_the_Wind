import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<String> worker = new ArrayList<>();//new arraylist
        double hours = 10; //making new variable to simulate hours
        Worker Bob = new Worker("Bob", "Rogers", "000001", "Cashier", 2000, 15.00, hours);
        worker.add(Bob.toString());
        hours = 9;
        Worker Jeff = new Worker("Jeff", "Urry", "000002", "Cashier", 1993, 15.00, hours);
        worker.add(Jeff.toString());
        hours = 11;
        Worker Jack = new Worker("Jack", "Beanstalk", "000003", "Restocker", 2000, 20.00, hours);
        worker.add(Jack.toString());
        SalaryWorker Nemo = new SalaryWorker("Nemo","Fish","000004","Clown", 2003, 120000.00);
        worker.add(Nemo.toString());
        SalaryWorker Manny = new SalaryWorker("Manny","Ager","000005","Manager", 1986, 200000.01);
        worker.add(Manny.toString());
        SalaryWorker Chuck = new SalaryWorker("Chuck","EnNuget","000006","Ass.Manager", 1988, 180000.00); //did you get any of the puns?
        worker.add(Chuck.toString());

        int week = 1;

        for (week = 1; week <= 3; week++) {
            if(week == 1){
                System.out.println("\nWeek 1\n");

                hours = 40;

                Bob.setHoursWorked(hours);
                Jeff.setHoursWorked(hours);
                Jack.setHoursWorked(hours);
                System.out.format("%-30s%-30s%-30s%-30s%-30s%-30s\n", "Bob: " + (Bob.getHourlyPayRate()) * (Bob.getHoursWorked()),
                        "Jeff: " + (Jeff.getHourlyPayRate()) * (Jeff.getHoursWorked()),
                        "Jack: " + (Jack.getHourlyPayRate()) * (Jack.getHoursWorked()),
                        "\nNemo: " + Nemo.displayWeeklyPay(120000),
                        "Manny: " + Manny.displayWeeklyPay(200000.1),
                        "Chuck: " + Chuck.displayWeeklyPay(180000.00));

            }else if(week == 2){
                System.out.println("\nWeek 2\n");

                hours = 50;

                Bob.setHoursWorked(hours);
                Jeff.setHoursWorked(hours);
                Jack.setHoursWorked(hours);
                System.out.format("%-30s%-30s%-30s%-30s%-30s%-30s\n", "Bob: " + (Bob.getHourlyPayRate()) * (Bob.getHoursWorked()),
                        "Jeff: " + (Jeff.getHourlyPayRate()) * (Jeff.getHoursWorked()),
                        "Jack: " + (Jack.getHourlyPayRate()) * (Jack.getHoursWorked()),
                        "\nNemo: " + Nemo.displayWeeklyPay(120000),
                        "Manny: " + Manny.displayWeeklyPay(200000.1),
                        "Chuck: " + Chuck.displayWeeklyPay(180000.00));
            }else if (week == 3){
                System.out.println("\nWeek 3\n");

                hours = 40;

                Bob.setHoursWorked(hours);
                Jeff.setHoursWorked(hours);
                Jack.setHoursWorked(hours);
                System.out.format("%-30s%-30s%-30s%-30s%-30s%-30s\n", "Bob: " + (Bob.getHourlyPayRate()) * (Bob.getHoursWorked()),
                        "Jeff: " + (Jeff.getHourlyPayRate()) * (Jeff.getHoursWorked()),
                        "Jack: " + (Jack.getHourlyPayRate()) * (Jack.getHoursWorked()),
                        "\nNemo: " + Nemo.displayWeeklyPay(120000),
                        "Manny: " + Manny.displayWeeklyPay(200000.1),
                        "Chuck: " + Chuck.displayWeeklyPay(180000.00));
            }
        }





    }
}