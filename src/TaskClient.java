public class TaskClient {
    public static void main (String [] args) {
        Task task1 = new Task("Clean room.", 1);
        Task task2 = new Task("Fold laundry.", 2);
        Task task3 = new Task("Feed cats.", 3);

        task1.doTask();
        System.out.println(task1.toString());
        task1.setPriority(0);

        task2.doTask();
        System.out.println(task2.toString());
        task2.setPriority(0);

        task3.doTask();
        task3.setPriority(0);

        System.out.println("Task 1 priority: " + task1.getPriority());
        System.out.println("Task 2 priority: " + task2.getPriority());
        System.out.println("Task 3 priority: " + task3.getPriority());
    }
}
