/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/

import java.util.ArrayList;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


/**
 *
 * @author Peggy Fisher
 * 
 * Dell Update
 * 
 * Lenovo Update
 */
public class TestFX extends Application {
	
	static ObservableList<Student> mySl;
    
    @Override
    public void start(Stage primaryStage) {
        Label response = new Label("");
        Label title = new Label("Student List Using a TableView\n");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        title.setTextFill(Color.CADETBLUE);
       
        
        FlowPane root = new FlowPane();
        root.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(root, 700, 700);
        
        mySl = EquipMgmt.getStudentList();
		Student stu = new Student();
		
	/*
		for (int i = 0; i < mySl.size(); i ++)
		{
		    stu = mySl.get(i);
		    System.out.println(stu.getId()+" "+stu.getFirstName()+" "+stu.getLastName());
		    
		}
      */  
    	//static ArrayList<People> myAl = new ArrayList();
//        ObservableList<Student> myStudentList;
//        = FXCollections.observableArrayList(
//                new Contact("Peggy", "Fisher", "717-555-1212"), 
//                new Contact("Jim", "Freed", "441-456-1345"), 
//                new Contact("Pat", "Keegan", "717-363-1432"), 
//                new Contact("Jane", "Slattery", "441-478-4488"), 
//                new Contact("Cy", "Young", "970-554-1265"), 
//                new Contact("Rob", "Jones", "570-655-1587"), 
//                new Contact("Carol", "King", "215-547-5958"), 
//                new Contact("Bob", "Kauffman", "215-456-6345"), 
//                new Contact("Gloria", "Shilling", "717-785-6092"), 
//                new Contact("Bill", "Sigler", "441-444-1345")
//                );
    
        TableView<Student> tvStudents;
        
        tvStudents = new TableView<Student>(mySl);
        
        TableColumn<Student, String> iD = new TableColumn<>("ID");
        iD.setCellValueFactory(new PropertyValueFactory<>("id"));
        tvStudents.getColumns().add(iD);
        
        TableColumn<Student, String> fName = new TableColumn<>("First Name");
        fName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        tvStudents.getColumns().add(fName);
        
        TableColumn<Student, String> lName = new TableColumn<>("Last Name");
        lName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        tvStudents.getColumns().add(lName);
        
        TableColumn<Student, String> address = new TableColumn<>("Address");
        address.setCellValueFactory(new PropertyValueFactory<>("address"));
        tvStudents.getColumns().add(address);
        
        TableColumn<Student, String> city = new TableColumn<>("City");
        city.setCellValueFactory(new PropertyValueFactory<>("city"));
        tvStudents.getColumns().add(city);
        
        TableColumn<Student, String> st = new TableColumn<>("State");
        st.setCellValueFactory(new PropertyValueFactory<>("state"));
        tvStudents.getColumns().add(st);
        
        TableColumn<Student, String> zip = new TableColumn<>("Zip Code");
        zip.setCellValueFactory(new PropertyValueFactory<>("zip"));
        tvStudents.getColumns().add(zip);
        
        
        tvStudents.setPrefWidth(600);
        tvStudents.setPrefHeight(300);
        
        TableView.TableViewSelectionModel<Student> tvSelStudent = 
                tvStudents.getSelectionModel();
        
        tvSelStudent.selectedIndexProperty().addListener(new ChangeListener<Number>()
        {
            public void changed(ObservableValue<? extends Number> changed, 
                    Number oldVal, Number newVal) {
                int index = (int)newVal;
                response.setText("The cell number for the Student selected is "
                        +mySl.get(index).getZip());
            }
        });
        
        response.setFont(Font.font("Arial", 14));
        root.getChildren().addAll(title,tvStudents, response);
        primaryStage.setTitle("Student List");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
