package ar.edu.unlam.pb2.recuperatorio;

public class Vivienda extends Bien{
	
	private String calle, ciudad, localidad, provincia;

	public Vivienda(String calle, String ciudad, String localidad, String provincia) {
		this.setCalle(calle);
		this.setCiudad(ciudad);
		this.setLocalidad(localidad);
		this.setProvincia(provincia);
	}

	public String getCalle() {
		return calle;
	}

	private void setCalle(String calle) {
		this.calle = calle;
	}

	public String getCiudad() {
		return ciudad;
	}

	private void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getLocalidad() {
		return localidad;
	}

	private void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	private void setProvincia(String provincia) {
		this.provincia = provincia;
	}

}
