/**
 * 
 */

/**
 * @author ptan
 *
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

import javafx.collections.FXCollections;
//import displaycontactlist.Contact;
//import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class EquipMgmt {

	static ArrayList<People> peopleList= new ArrayList();
//	static Set<People> mySet = new LinkedHashSet<People>();
	static ArrayList<Equipment> equipmentList = new ArrayList();
	
    static ObservableList<Student> studentList; 
    static ArrayList<Student> stList= new ArrayList();
	
	public ArrayList<People> getPeopleList() {
		// TODO Auto-generated method stub
		try {
			loadPeopleFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return peopleList;

	}

	static void loadPeopleFile() throws IOException {
		FileReader file = new FileReader("People.csv");
		BufferedReader reader = new BufferedReader(file);
		
		String line;
		//int r = 0;
		while ((line = reader.readLine()) != null) {
			String[] aLine = line.split(",");
//			if (allData == null) {
//				allData = new String[2][aLine.length];
//			}
			
			People people = new People();
			people.setId(Integer.parseInt(aLine[0]));
			people.setFname(aLine[1]);
			people.setLname(aLine[2]);
			people.setAddress(aLine[3]);
			people.setCity(aLine[4]);
			people.setState(aLine[5]);
			people.setZip(aLine[6]);
			
			
			peopleList.add(people);
			
//			mySet.add(people);

		}
		reader.close();
	}

	public ArrayList<Equipment> getEquipmentList() {
		// TODO Auto-generated method stub
		try {
			loadEquipmentFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return equipmentList;
	}
	
	static void loadEquipmentFile() throws IOException {
		FileReader file = new FileReader("Equipment.csv");
		BufferedReader reader = new BufferedReader(file);
		
		String line;
		//int r = 0;
		while ((line = reader.readLine()) != null) {
			String[] aLine = line.split(",");

			
			Equipment equipment = new Equipment();
			equipment.setEquipid(aLine[0]);
			equipment.setEquipment(aLine[1]);
			equipment.setDescription(aLine[2]);
			equipment.setPurchaseDate(aLine[3]);
			equipment.setActiveFlag(aLine[4]);
			
			
			equipmentList.add(equipment);
			
//			mySet.add(people);

		}
		reader.close();
	}	
	
	
	static public ObservableList<Student> getStudentList() {
		// TODO Auto-generated method stub
		try {
			loadStudentFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return studentList;

	}
	
	static void loadStudentFile() throws IOException {
		FileReader file = new FileReader("People.csv");
		BufferedReader reader = new BufferedReader(file);
		
		String line;
		//int r = 0;
		while ((line = reader.readLine()) != null) {
			String[] aLine = line.split(",");
//			if (allData == null) {
//				allData = new String[2][aLine.length];
//			}
			
			Student student = new Student();
			student.setId(aLine[0]);
			student.setFirstName(aLine[1]);
			student.setLastName(aLine[2]);
			student.setAddress(aLine[3]);
			student.setCity(aLine[4]);
			student.setState(aLine[5]);
			student.setZip(aLine[6]);
			
			stList.add(student);
	


		}
		studentList =FXCollections.observableArrayList(stList);
		reader.close();
	}
	
	
}
