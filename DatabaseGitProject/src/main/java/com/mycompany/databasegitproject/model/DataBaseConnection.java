package com.mycompany.databasegitproject.model;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataBaseConnection {

    DataBaseConnection() {
        Properties properties = new Properties();
        OutputStream output = null;

        try {
            output = new FileOutputStream("db.properties");
            properties.setProperty("MYSQL_DB_URL", "jdbc:Mysql://localhost:188/Database1");
            properties.setProperty("MYSQL_DB_USERNAME", "root");
            properties.setProperty("MYSQL_DB_PASSWORD", "@dmin");
            properties.store(output, null);

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

  public static void main(String[] args) {
        DataBaseConnection dataBaseConnection=new DataBaseConnection();
    }

}
