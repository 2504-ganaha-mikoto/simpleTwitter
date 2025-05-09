package chapter5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

public class PreparedDelete {
    public static void main(String[] args) throws Exception {
        String driver = "com.mysql.jdbc.Driver";
        // 「database_name」は各環境に合わせます
        String url = "jdbc:mysql://localhost/database_name";
        // MySQLに接続する際のユーザー名(デフォルトはroot)
        String user = "root";
        // MySQLに接続する際のパスワード(今回はroot)
        String password = "root";

        Class.forName(driver);

        Connection connection = DriverManager.getConnection(url, user, password);
        connection.setAutoCommit(false);

        String deleteId = "1 OR id = id";

        delete(connection, deleteId);

        Select.select(connection);

        connection.commit();
        connection.close();
    }

    public static void delete(Connection connection, String deleteId) throws SQLException {
//この「?」は、「バインド変数(bind variables)」
        String sql = "DELETE FROM authors WHERE id = ?";

        PreparedStatement statement = connection.prepareStatement(sql);
//可変になる箇所であるバインド変数に値をセットするコードになります。

        statement.setObject(1, deleteId, Types.INTEGER);

        int updateCount = statement.executeUpdate();

        if (updateCount == 1) {
            System.out.println("削除成功");
        } else {
            System.out.println("削除失敗");
        }

        statement.close();
    }
}