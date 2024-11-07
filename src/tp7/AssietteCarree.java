package tp7;

public class AssietteCarree extends Assiette {
	private double cote;

	public AssietteCarree(int annee,double cote) {
		super(annee);
		this.cote=cote;
	}
	public double calc() {
		return cote*cote;
	}
	
	protected double calcd() {
		
		return super.calcd()*5;
	
	}


}
