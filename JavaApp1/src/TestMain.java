import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestMain {

	
	// Update from Dell

	//Update from Lenovo

	//Update from Dell 2
	
	//Update from Dell 3


	//static String[][] allData;
	static ArrayList<People> myAl = new ArrayList();
	static ArrayList<Equipment> myEquipmentList = new ArrayList();
	
	//static Set<People> mySet = new LinkedHashSet<People>();
	
	static EquipMgmt equipmgmt = new EquipMgmt();
	
	
	public static void main(String[] args) {
		
		myAl = equipmgmt.getPeopleList();
		
		People pep = new People();
		
		for (int i = 0; i < myAl.size(); i ++)
		{
		    pep = myAl.get(i);
		    System.out.println(pep.getId()+" "+pep.getFname()+" "+pep.getLname());
		    
		}
		

		myEquipmentList = equipmgmt.getEquipmentList();
		
		Equipment equip = new Equipment();
		
		for (int i = 0; i < myEquipmentList.size(); i ++)
		{
		    equip = myEquipmentList.get(i);
		    System.out.println(equip);
		    
		}

		
		System.out.println(pep);
		System.out.println(equip);
//		System.out.println(myAl.get(0));
/*
		for (int i = 0; i < mySet.size(); i ++)
		{
		    pep = mySet.get(i);
		    System.out.println(pep.getId()+" "+pep.getFname()+" "+pep.getLname());
		    
		}
		*/
/*		
		for (int i = 0; i < allData.length; i++)
			for (int j = 0; j < allData[i].length; j++)
			{
			
				System.out.println(allData[i][j]);
		    }
*/
	}


	

	static void loadFile1() throws IOException {
		FileReader file = new FileReader("People.csv");
		BufferedReader reader = new BufferedReader(file);
		
		String line;
		int r = 0;
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
			
			
			myAl.add(people);
			
//			mySet.add(people);
			
			
		
//			for (int c = 0; c < aLine.length; c++) {
				/*int iData = Integer.parseInt(aLine[c]);*/
//				String iData = aLine[c];
//				allData[r][c] = iData;
//			}
		
			r++;
		}
		reader.close();
	}

	
}
