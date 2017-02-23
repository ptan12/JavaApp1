import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Peggy Fisher
 */
public class Student {
    
/* 
private final SimpleStringProperty id= new SimpleStringProperty("");
private final SimpleStringProperty firstName = new SimpleStringProperty("");
private final SimpleStringProperty lastName = new SimpleStringProperty("");
private final SimpleStringProperty city = new SimpleStringProperty("");
private final SimpleStringProperty state = new SimpleStringProperty("");
private final SimpleStringProperty zip= new SimpleStringProperty("");
*/

	private final SimpleStringProperty id= new SimpleStringProperty("");
	private final SimpleStringProperty firstName = new SimpleStringProperty("");
	private final SimpleStringProperty lastName = new SimpleStringProperty("");
	private final SimpleStringProperty address = new SimpleStringProperty("");
	private final SimpleStringProperty city = new SimpleStringProperty("");
	private final SimpleStringProperty state = new SimpleStringProperty("");
	private final SimpleStringProperty zip= new SimpleStringProperty("");
	
    public Student() {
    	this("", "", "","","","","");
    }
	
    public Student(String id, String firstName, String lastName, String address, String city, String state, String zip) {
    	setId(id);
    	setFirstName(firstName);
        setLastName(lastName);
        setAddress(address);
        setCity(city);
        setState(state);
        setZip(zip);
    }
	public String getFirstName() {
        return firstName.get();
    }
 
    public void setFirstName(String fName) {
        firstName.set(fName);
    }

	public String getId() {
		return id.get();
	}

	public void setId(String id) {
		this.id.set(id);
	}
	public String getLastName() {
		return lastName.get();
	}

    public void setLastName(String lName) {
        lastName.set(lName);
    }
    
	public String getAddress() {
		return address.get();
	}

    public void setAddress(String address) {
        this.address.set(address);
    }


	public String getCity() {
		return city.get();
	}
	
    public void setCity(String city) {
        this.city.set(city);
    }

	public String getState() {
		return state.get();
	}

    public void setState(String st) {
        state.set(st);
    }
	public String getZip() {
		return zip.get();
	}

    public void setZip(String zip) {
        this.zip.set(zip);
    }
    
}

