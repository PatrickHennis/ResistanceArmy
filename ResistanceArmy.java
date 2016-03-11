import java.util.ArrayList;

public class ResistanceArmy {

	//ArrayList of Resistance objects
	ArrayList<Resistance> army;
	
	//Default constructor initializes army ArrayList
	public ResistanceArmy() {
		army = new ArrayList<Resistance>();
	}
	
	//adds a resistance object to army ArrayList
	public void addSoldier(Resistance resistance) {
		army.add(resistance);
	}

	//returns army ArrayList
	public ArrayList<Resistance> getArmy() {
		return army;
	}

}
