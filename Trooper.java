
public class Trooper extends Resistance{

	// private blaster field
	private Blaster newBlaster;
	
	//constructor that assigns blaster to newBlaster and receives name
	public Trooper(String string, Blaster blaster) {
		super(string);
		newBlaster = blaster;
	}

	//constructor that receives name string
	public Trooper(String string) {
		super(string);
	}

	//returns blaster
	public Blaster getBlaster() {
		return newBlaster;
	}
	
	//overrides equals and checks if blasters are equal and are equal based on super class
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		} else if(obj instanceof Trooper) { 
			if ((((Trooper) obj).getBlaster() == null && this.getBlaster() == null)
					|| ((Trooper) obj).getBlaster().equals(this.getBlaster())) {
				return super.equals(obj);
			}
		} 
        return false;
    }

}
