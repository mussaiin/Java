import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Quiz {

    public static void main(String args[]) throws FileNotFoundException, IOException, EOFException, SQLException {
        FileInputStream in = new FileInputStream("f.dat");
        ObjectInputStream inn = new ObjectInputStream(in);
        String myDriver = "com.mysql.jdbc.Driver";
        String myUrl = "jdbc:mysql://localhost/quiz";
        Connection conn = DriverManager.getConnection(myUrl, "root", "");
        Statement st = conn.createStatement();
        int[] i = new int[3];
        String[] s = new String[3];
        for (int j = 0; j < 3; j++) {
            i[j] = inn.readInt();
            s[j] = inn.readUTF();
            String insert = "INSERT INTO `namee` (`num`, `name`) VALUES ('" + i[j] + "', '" + s[j] + "') ";
            st.executeUpdate(insert);
        }

    }
}