package com.mycompany.databasegitproject.model;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataSource;


public class Factory {
    public  static MysqlDataSource getSqlDataSource(){
        Properties properties  = new Properties();
        FileInputStream input = null;
        MysqlDataSource dataSource = null;
        try {
            input = new FileInputStream("db.properties");
            
            properties.load(input);
            dataSource = new MysqlDataSource();
            dataSource.setURL(properties.getProperty("MYSQL_DB_URL"));
            dataSource.setUser(properties.getProperty("MYSQL_DB_USERNAME"));
            dataSource.setPassword(properties.getProperty("MYSQL_DB_PASSWORD"));
        } catch (FileNotFoundException ex) {
            
            Logger.getLogger(Factory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Factory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dataSource;
}
}
