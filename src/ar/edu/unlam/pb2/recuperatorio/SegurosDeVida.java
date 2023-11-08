package ar.edu.unlam.pb2.recuperatorio;

public interface SegurosDeVida {

	public void agregarBeneficiario(Persona persona, TipoDeBeneficiario tipo);

	public Integer obtenerCantidadDeBeneficiarios();
	
	public boolean tuvoAlgunAccidente();
	
	public void denunciarAccidente();

}
