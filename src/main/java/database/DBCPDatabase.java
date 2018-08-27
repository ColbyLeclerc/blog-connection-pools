package database;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.SQLException;

public class DBCPDatabase {

    private static BasicDataSource dataSource;

    //Insert log4j statement

    public static BasicDataSource getDataSource() {

        if (dataSource == null) {

            BasicDataSource ds = new BasicDataSource();

            ds.setUrl("jdbc:mysql://localhost:3306/testdba");
            ds.setUsername("root");
            ds.setPassword("xdbG3RpZmjKinGDy183H");

            ds.setDriverClassName("com.mysql.cj.jdbc.Driver");

            ds.setInitialSize(3);
            ds.setMaxTotal(25);
            ds.setMinIdle(0);
            ds.setMaxIdle(8);
            ds.setMaxOpenPreparedStatements(100);

            dataSource = ds;
        }

        return dataSource;
    }

    public static void shutdown() {
        if (dataSource != null){
            try {
                dataSource.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
