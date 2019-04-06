package com.mycompany.databasegitproject.model;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class FXMLBase extends AnchorPane {

    protected final Label label;
    protected final Label label0;
    protected final Label label1;
    protected final Label label2;
    protected final Label label3;
    protected final Label label4;
    protected final Label label5;
    protected final TextField textId;
    protected final TextField textFirstName;
    protected final TextField textMiddleName;
    protected final TextField textLastName;
    protected final TextField textEmail;
    protected final TextField textPhone;
    protected final Button buttonNew;
    protected final Button buttonUpdate;
    protected final Button buttonDelete;
    protected final Button buttonFirst;
    protected final Button buttonPrevious;
    protected final Button buttonNext;
    protected final Button buttonLast;

    public FXMLBase() {

        label = new Label();
        label0 = new Label();
        label1 = new Label();
        label2 = new Label();
        label3 = new Label();
        label4 = new Label();
        label5 = new Label();
        textId = new TextField();
        textFirstName = new TextField();
        textMiddleName = new TextField();
        textLastName = new TextField();
        textEmail = new TextField();
        textPhone = new TextField();
        buttonNew = new Button();
        buttonUpdate = new Button();
        buttonDelete = new Button();
        buttonFirst = new Button();
        buttonPrevious = new Button();
        buttonNext = new Button();
        buttonLast = new Button();

        setId("AnchorPane");
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        label.setLayoutX(52.0);
        label.setLayoutY(52.0);
        label.setText("Personal details");

        label0.setLayoutX(44.0);
        label0.setLayoutY(100.0);
        label0.setText("ID");

        label1.setLayoutX(35.0);
        label1.setLayoutY(137.0);
        label1.setText("First Name");

        label2.setLayoutX(36.0);
        label2.setLayoutY(172.0);
        label2.setText("Middle Name");

        label3.setLayoutX(35.0);
        label3.setLayoutY(212.0);
        label3.setPrefHeight(17.0);
        label3.setPrefWidth(58.0);
        label3.setText("Last Name");

        label4.setLayoutX(47.0);
        label4.setLayoutY(261.0);
        label4.setText("Email");

        label5.setLayoutX(44.0);
        label5.setLayoutY(305.0);
        label5.setText("Phone");

        textId.setLayoutX(112.0);
        textId.setLayoutY(96.0);

        textFirstName.setLayoutX(112.0);
        textFirstName.setLayoutY(133.0);

        textMiddleName.setLayoutX(112.0);
        textMiddleName.setLayoutY(168.0);

        textLastName.setLayoutX(112.0);
        textLastName.setLayoutY(208.0);

        textEmail.setLayoutX(112.0);
        textEmail.setLayoutY(257.0);

        textPhone.setLayoutX(112.0);
        textPhone.setLayoutY(301.0);

        buttonNew.setLayoutX(61.0);
        buttonNew.setLayoutY(343.0);
        buttonNew.setMnemonicParsing(false);
        buttonNew.setText("New");

        buttonUpdate.setLayoutX(132.0);
        buttonUpdate.setLayoutY(343.0);
        buttonUpdate.setMnemonicParsing(false);
        buttonUpdate.setText("Update");

        buttonDelete.setLayoutX(218.0);
        buttonDelete.setLayoutY(343.0);
        buttonDelete.setMnemonicParsing(false);
        buttonDelete.setText("Delete");

        buttonFirst.setLayoutX(308.0);
        buttonFirst.setLayoutY(343.0);
        buttonFirst.setMnemonicParsing(false);
        buttonFirst.setText("First");

        buttonPrevious.setLayoutX(378.0);
        buttonPrevious.setLayoutY(343.0);
        buttonPrevious.setMnemonicParsing(false);
        buttonPrevious.setText("Previous");

        buttonNext.setLayoutX(461.0);
        buttonNext.setLayoutY(343.0);
        buttonNext.setMnemonicParsing(false);
        buttonNext.setText("Next");

        buttonLast.setLayoutX(527.0);
        buttonLast.setLayoutY(343.0);
        buttonLast.setMnemonicParsing(false);
        buttonLast.setText("Last");

        getChildren().add(label);
        getChildren().add(label0);
        getChildren().add(label1);
        getChildren().add(label2);
        getChildren().add(label3);
        getChildren().add(label4);
        getChildren().add(label5);
        getChildren().add(textId);
        getChildren().add(textFirstName);
        getChildren().add(textMiddleName);
        getChildren().add(textLastName);
        getChildren().add(textEmail);
        getChildren().add(textPhone);
        getChildren().add(buttonNew);
        getChildren().add(buttonUpdate);
        getChildren().add(buttonDelete);
        getChildren().add(buttonFirst);
        getChildren().add(buttonPrevious);
        getChildren().add(buttonNext);
        getChildren().add(buttonLast);

    }
}