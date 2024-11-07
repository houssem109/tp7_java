package tp7;

public class AssietteRonde extends Assiette {
	private double rayon;

	public AssietteRonde(int i, double rayon) {
		super(i);
		this.rayon=rayon;
	}

	public double calc() {
		return 3.14*rayon*rayon;
	}

	



}
