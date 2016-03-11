
public class Droid extends Resistance{

	//Constructor that implements super class
	public Droid(String string) {
		super(string);
	}
	
	//overrides equals and checks equality based on super class
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Droid) {
			return super.equals(obj);
		}
		return false;
	}
}
