// kết nối với sql

package Data;

import java.sql.*;

public class DataSQL {
    public static Connection openConnection(){
        Connection ketNoi = null;
        String uRL ="jdbc:sqlserver://localhost:1433;databaseName=QLSinhVien";
        String userName = "sa";
        String passWord = "27032001";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            ketNoi = DriverManager.getConnection(uRL, userName, passWord);
            System.out.println("Kết nối thành công");
        } catch (Exception e) {
            System.out.println("Không kết nối được với CSDL");
        }
        return ketNoi;
    }
}
