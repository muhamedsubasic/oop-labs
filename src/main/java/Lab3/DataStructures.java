//package Lab3;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class DataStructures {
//    private DbConnect dbConnect;
//
//    public DataStructures() {
//        dbConnect = new DbConnect();
//    }
//
//    // Fetch all tasks
//    public List<TaskItem> getAllTasks() {
//        return dbConnect.fetchAllTasks();
//    }
//
//    // Fetch task by status
//    public List<TaskItem> getByStatus(TaskItem.Status status) {
//        return dbConnect.fetchAllTasks().stream()
//                .filter(task -> task.getTaskStatus() == status)
//                .toList();
//    }
//
//    // Find tasks by ID greater than or equal to 2
//    public List<TaskItem> getTasksByIdGreaterThanOrEqualTo(int id) {
//        return dbConnect.fetchAllTasks().stream()
//                .filter(task -> task.getTaskId() >= id)
//                .toList();
//    }
//
//    // Print task descriptions using forEach
//    public void printTaskDescriptions() {
//        getAllTasks().forEach(task -> System.out.println(task.getTaskDescription()));
//    }
//
//    // Create a new task
//    public void createTask(String description, TaskItem.Status status) {
//        dbConnect.createTask(description, status);
//    }
//
//    // Update task description by ID
//    public void updateTaskDescription(int taskId, String newDescription) {
//        dbConnect.updateTaskDescription(taskId, newDescription);
//    }
//
//    // Close the database connection
//    public void closeConnection() {
//        dbConnect.closeConnection();
//    }
//}

//public class DataStructures {
//    private List<TaskItem> tasks = new ArrayList<>();
//
//    public DataStructures() {
//        tasks = Arrays.asList(
//                new TaskItem(1, "Push lab code to the GitHub", TaskItem.Status.TO_DO),
//                new TaskItem(2, "Prepare for the quiz", TaskItem.Status.IN_PROGRESS),
//                new TaskItem(3, "Go over tasks from lab2", TaskItem.Status.COMPLETED)
//        );
//    }
//
//    // TODO create method to get all objects
//    public List<TaskItem> getAllTasks() {
//        return tasks;
//    }
//
//    // TODO create a method getByStatus that will accept a Status parameter and filter the tasks with the provided status
//    public List<TaskItem> getByStatus(TaskItem.Status status) {
//        return tasks.stream()
//                .filter(task -> task.getTaskStatus() == status)
//                .collect(Collectors.toList());
//    }
//
//    // TODO create a method to find tasks whose id parameter is greater than or equa to 2
//    public List<TaskItem> getTasksById(int id) {
//        return tasks.stream()
//                .filter(task -> task.getTaskId() >= id)
//                .collect(Collectors.toList());
//    }
//
//    // TODO create a method that will, by using the forEach stream method, print to the console the description of each task
//    public void printTaskDescriptions() {
//        tasks.forEach(task -> System.out.println(task.getTaskDescription()));
//    }


//public static void main(String[] args) {
//    DataStructures dataStructures = new DataStructures();
//
//    // 1. Fetch all tasks and print them
//    System.out.println("All Tasks:");
//    dataStructures.getAllTasks().forEach(System.out::println);
//
//    // 2. Fetch tasks by status
//    System.out.println("\nTasks with status IN_PROGRESS:");
//    dataStructures.getByStatus(TaskItem.Status.IN_PROGRESS).forEach(System.out::println);
//
//    // 3. Fetch tasks with ID >= 2
//    System.out.println("\nTasks with ID >= 2:");
//    dataStructures.getTasksByIdGreaterThanOrEqualTo(2).forEach(System.out::println);
//
//    // 4. Print task descriptions
//    System.out.println("\nTask Descriptions:");
//    dataStructures.printTaskDescriptions();
//
//    // 5. Create a new task
//    System.out.println("\nCreating a new task:");
//    dataStructures.createTask("Complete Java database assignment", TaskItem.Status.TO_DO);
//
//    // 6. Update task description by ID
//    System.out.println("\nUpdating task description for task with ID 1:");
//    dataStructures.updateTaskDescription(1, "Update lab code on GitHub");
//
//    // 7. Fetch all tasks after updates
//    System.out.println("\nUpdated Task List:");
//    dataStructures.getAllTasks().forEach(System.out::println);
//
//    // Close the database connection
//    dataStructures.closeConnection();
//}
////    public static void main(String[] args) {
////        DataStructures data = new DataStructures();
////
////        System.out.println("All Tasks:");
////        data.getAllTasks().forEach(System.out::println);
////
////        System.out.println("\nTasks with status IN_PROGRESS:");
////        data.getByStatus(TaskItem.Status.IN_PROGRESS).forEach(System.out::println);
////
////        System.out.println("\nTasks with ID >= 2:");
////        data.getTasksById(2).forEach(System.out::println);
////
////        System.out.println("\nTask Descriptions:");
////        data.printTaskDescriptions();
////    }
////}
//
//class TaskItem {
//    private int taskId;
//    private String taskDescription;
//    private Status taskStatus;
//    public enum Status {TO_DO, IN_PROGRESS, COMPLETED, CANCELLED;}
//
//    public TaskItem(int taskId, String taskDescription, Status taskStatus) {
//        this.taskId = taskId;
//        this.taskDescription = taskDescription;
//        this.taskStatus = taskStatus;
//    }
//
//
//    public int getTaskId() {
//        return taskId;
//    }
//
//    public String getTaskDescription() {
//        return taskDescription;
//    }
//
//    public Status getTaskStatus() {
//        return taskStatus;
//    }
//
//    public void setTaskStatus(Status taskStatus) {
//        this.taskStatus = taskStatus;
//    }
//
//    @Override
//    public String toString() {
//        return "TaskItem{" +
//                "taskId=" + taskId +
//                ", taskDescription='" + taskDescription + '\'' +
//                ", taskStatus=" + taskStatus +
//                '}';
//    }
//}
