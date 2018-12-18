import java.io.File;
import java.sql.*;
import java.util.ArrayList;

public class Database extends Media
{
    public void database() throws SQLException {

        System.out.println("JDBC database eksempel");


        // 2) Connect to a database

        Connection connection = DriverManager.getConnection

                ("jdbc:mysql://localhost/tv2?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");

        System.out.println("Database connected");
        readMediaFolder("folder");

        // 3) Create a statement
        //HEJr
        Statement statement = connection.createStatement();



        // 4) Execute a statementr

        String sql = "insert into medie(name,created,fileName)values (?,CURRENT_DATE,'123456')";
        PreparedStatement preparedStmt = connection.prepareStatement(sql);
        //preparedStmt.setString(1,(alist);
        preparedStmt.setString(1,alist.toString());
        preparedStmt.execute();

       // ResultSet resultSet = statement.executeQuery(sql);
        // 5) Iterate through the result and print the student names
        /*
        while (resultSet.next())

            System.out.println(

                    resultSet.getString(2) + "\t" + resultSet.getString(3));


        // Adding new values to databases table with this insert into sql statement
        */
        // 6) Close the connection
        connection.close();
    }











}
