
public class Resistance {
	
	//Private field string name
	private String name;
	
	//Constructor that assigns a string to the name field
	public Resistance(String string) {
		name = string;
	}

	//Returns the name string
	public String getName() {
		return name;
	}
	
	//Overrides equal and checks the equality based on if they have the same name
	@Override
    public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		} else if(obj instanceof Resistance) { 
			if (((Resistance) obj).getName().equals(this.getName())) {
				return true;
			}
		} 
        return false;
    }
}
