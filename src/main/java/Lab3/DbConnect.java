//package Lab3;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class DbConnect {
//    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/lab3";
//    private static final String USERNAME = "root";
//    private static final String PASSWORD = "samp2233";
//
//    private Connection connection = null;
//
//    public DbConnect() {
//        try {
//            connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public List<TaskItem> fetchAllTasks() {
//        List<TaskItem> tasks = new ArrayList<>();
//        String query = "SELECT * FROM tasks";
//
//        try (Statement stmt = connection.createStatement();
//             ResultSet rs = stmt.executeQuery(query)) {
//
//            while (rs.next()) {
//                int taskId = rs.getInt("taskId");
//                String taskDescription = rs.getString("taskDescription");
//                TaskItem.Status status = TaskItem.Status.valueOf(rs.getString("taskStatus"));
//                tasks.add(new TaskItem(taskId, taskDescription, status));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return tasks;
//    }
//
//    public TaskItem fetchTaskById(int id) {
//        TaskItem task = null;
//        String query = "SELECT * FROM tasks WHERE taskId = ?";
//
//        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
//            pstmt.setInt(1, id);
//            ResultSet rs = pstmt.executeQuery();
//
//            if (rs.next()) {
//                int taskId = rs.getInt("taskId");
//                String taskDescription = rs.getString("taskDescription");
//                TaskItem.Status status = TaskItem.Status.valueOf(rs.getString("taskStatus"));
//                task = new TaskItem(taskId, taskDescription, status);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return task;
//    }
//
//    public void createTask(String description, TaskItem.Status status) {
//        String query = "INSERT INTO tasks (taskDescription, taskStatus) VALUES (?, ?)";
//
//        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
//            pstmt.setString(1, description);
//            pstmt.setString(2, status.name());
//            pstmt.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void updateTaskDescription(int taskId, String newDescription) {
//        String query = "UPDATE tasks SET taskDescription = ? WHERE taskId = ?";
//
//        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
//            pstmt.setString(1, newDescription);
//            pstmt.setInt(2, taskId);
//            pstmt.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void closeConnection() {
//        if (connection != null) {
//            try {
//                connection.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//
