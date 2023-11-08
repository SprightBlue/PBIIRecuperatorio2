package ar.edu.unlam.pb2.recuperatorio;

public class PolizaDeAuto extends Poliza implements SegurosGenerales {
	
	private Auto auto;
	private boolean robado;

	public PolizaDeAuto(Integer numeroDePoliza, Persona asegurado, Double sumaAsegurada, Double prima) {
		super(numeroDePoliza, asegurado, sumaAsegurada, prima);
		this.auto = null;
		this.robado = false;
	}

	@Override
	public void agregarBienAsegurado(Bien bien) {
		this.auto = (Auto) bien;
	}

	public Auto getAuto() {
		return auto;
	}

	@Override
	public boolean fueRobado() {
		return robado;
	}

	@Override
	public void denunciarRobo() {
		this.robado = true;
	}

}
