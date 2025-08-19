import java.sql.*;

public class SimpleJDBCExample {
    public static void main(String[] args) {
        try {
            // Step 1: Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Connect to the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "your_password");
            System.out.println("Connected!");

            // Step 3: Insert data using PreparedStatement
            String insertQuery = "INSERT INTO students (name, age) VALUES (?, ?)";
            PreparedStatement pstmt = con.prepareStatement(insertQuery);
            pstmt.setString(1, "Ashutosh");
            pstmt.setInt(2, 21);
            pstmt.executeUpdate();
            System.out.println("Data inserted.");

            // Step 4: Retrieve data using Statement
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            System.out.println("Student Records:");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("name") + " - " + rs.getInt("age"));
            }

            // Step 5: Call stored procedure using CallableStatement
            CallableStatement cstmt = con.prepareCall("{call getStudentById(?)}");
            cstmt.setInt(1, 1); // Example: student with ID 1
            ResultSet rs2 = cstmt.executeQuery();
            System.out.println("Stored Procedure Output:");
            while (rs2.next()) {
                System.out.println("ID: " + rs2.getInt("id"));
                System.out.println("Name: " + rs2.getString("name"));
                System.out.println("Age: " + rs2.getInt("age"));
            }

            // Close connections
            cstmt.close();
            rs2.close();
            stmt.close();
            rs.close();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}