
public class XWing extends Weapon{

	public XWing(int i) {
		super.changeStrength(i);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		} else if (obj instanceof XWing) {
			XWing n = (XWing) obj;
			if (this.getStrength() == n.getStrength()) {
				return true;
			}
		}
        return false;
    }
}
