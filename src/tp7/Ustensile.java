package tp7;

public abstract class Ustensile {
	protected int annee;
	public Ustensile(int annee) {
		this.annee=annee;
	}
	protected double calcd() {
		int d=2024-annee ;
		if (d>50) {
			return d-50;
		}
		else {
			
		return 0;
		}
	}
}
