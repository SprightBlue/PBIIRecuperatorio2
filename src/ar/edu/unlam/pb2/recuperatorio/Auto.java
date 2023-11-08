package ar.edu.unlam.pb2.recuperatorio;

public class Auto extends Bien {
	
	private String marca;
	private String modelo;
	private Integer añoDeFabricacion;
	private Double sumaAsegurada;

	public Auto(String marca, String modelo, Integer añoDeFabricacion, Double sumaAsegurada) {
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setAñoDeFabricacion(añoDeFabricacion);
		this.setSumaAsegurada(sumaAsegurada);
	}

	public String getMarca() {
		return marca;
	}

	private void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	private void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAñoDeFabricacion() {
		return añoDeFabricacion;
	}

	private void setAñoDeFabricacion(Integer añoDeFabricacion) {
		this.añoDeFabricacion = añoDeFabricacion;
	}

	public Double getSumaAsegurada() {
		return sumaAsegurada;
	}

	private void setSumaAsegurada(Double sumaAsegurada) {
		this.sumaAsegurada = sumaAsegurada;
	}

}
