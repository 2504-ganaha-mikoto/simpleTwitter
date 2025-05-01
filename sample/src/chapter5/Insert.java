package chapter5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
    public static void main(String[] args) throws Exception {
        String driver = "com.mysql.jdbc.Driver";
        // 「database_name」は各環境に合わせます
        String url = "jdbc:mysql://localhost/authors";
        // MySQLに接続する際のユーザー名(デフォルトはroot)
        String user = "root";
        // MySQLに接続する際のパスワード(今回はroot)
        String password = "root";

        Class.forName(driver);
        Connection connection = null;

        try {
            //コネクションの取得とオートコミットモードの変更
            connection = DriverManager.getConnection(url,
                    user, password);
            connection.setAutoCommit(false);

            insert(connection);

            connection.commit();
            }finally {
            	 if(connection != null) {
            
            connection.close();
            	 }
            }
    }

    public static void insert(Connection connection)
            throws SQLException {

        Statement statement = connection.createStatement();

        String sql = "INSERT INTO authors (id, name, kana, gender) VALUES (6, '福沢諭吉', 'ふくざわゆきち', '男')";
//        INSERT文はSELECT以外のSQL文なので、Statement#executeQuery()ではなく、
//        Statement.executeUpdate(引数)メソッドを利用して実行します
        int updateCount = statement.executeUpdate(sql);

      
  if (updateCount == 1) {
            System.out.println("登録成功");
        } else {
            System.out.println("登録失敗");
        }

        statement.close();
    }
}

