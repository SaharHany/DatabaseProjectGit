package com.mycompany.databasegitproject.controller;

import com.mycompany.databasegitproject.model.Factory;
import com.mycompany.databasegitproject.view.FXMLBase;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.sql.DataSource;

public class MainApp extends Application {

    FXMLBase fXMLBase;
    DataSource dataSource = null;
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    @Override
    public void start(Stage stage) throws Exception {
        setDBConnection();
        fXMLBase = new FXMLBase(this.resultSet);
        Scene scene = new Scene(fXMLBase);
        scene.getStylesheets().add("/styles/Styles.css");

        stage.setTitle("Database Git Project");
        stage.setScene(scene);
        stage.show();
    }

    private void setDBConnection() {

        dataSource = Factory.getSqlDataSource();

        try {
            connection = dataSource.getConnection();
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            resultSet = statement.executeQuery("select * from Person");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
