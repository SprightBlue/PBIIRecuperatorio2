package ar.edu.unlam.pb2.recuperatorio;

public abstract class Poliza {
	
	protected Integer numeroDePoliza;
	protected Persona asegurado;
	protected Double sumaAsegurada;
	protected Double prima;
	protected Double premio;

	public Poliza(Integer numeroDePoliza, Persona aseguradp, Double sumaAsegurada, Double prima) {
		this.setNumeroDePoliza(numeroDePoliza);
		this.setAsegurado(aseguradp);
		this.setSumaAsegurada(sumaAsegurada);
		this.setPrima(prima);
		this.setPremio();
	}
	
	public Integer getNumeroDePoliza() {
		return numeroDePoliza;
	}

	protected void setNumeroDePoliza(Integer numeroDePoliza) {
		this.numeroDePoliza = numeroDePoliza;
	}

	public Persona getAsegurado() {
		return asegurado;
	}

	protected void setAsegurado(Persona asegurado) {
		this.asegurado = asegurado;
	}

	public Double getSumaAsegurada() {
		return sumaAsegurada;
	}

	protected void setSumaAsegurada(Double sumaAsegurada) {
		this.sumaAsegurada = sumaAsegurada;
	}

	public Double getPrima() {
		return prima;
	}

	protected void setPrima(Double prima) {
		this.prima = prima;
	}

	public Double getPremio() {
		return premio;
	}

	protected void setPremio() {
		this.premio = this.prima+(this.prima*0.2);
	}

}
