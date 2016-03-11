
public class Pilot extends Trooper{

	//Private xwing field
	private XWing newWing;
	
	//assigns string to name and xwing to the xwing field
	public Pilot(String string, XWing xwing) {
		super(string);
		this.newWing = xwing;
	}

	//returns the xwing field
	public XWing getXWing() {
		return newWing;
	}
	
	//overrides equals and checks if pilots xwing are equal and equality based on super class
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		} else if (obj instanceof Pilot) {
			Pilot n = (Pilot) obj;
			if (this.getXWing().equals(n.getXWing())) {
				return super.equals((Trooper) n);
			}
		}
        return false;
    }

}
