package ar.edu.unlam.pb2.recuperatorio;

import java.util.TreeMap;
import java.util.Map;

public class PolizaCombinadoFamiliar extends Poliza implements SegurosDeVida, SegurosGenerales {

	private Bien bien;
	private Map<TipoDeBeneficiario, Persona> beneficiarios;
	private boolean robado;
	private boolean accidente;
	
	public PolizaCombinadoFamiliar(Integer numeroDePoliza, Persona aseguradp, Double sumaAsegurada, Double prima) {
		super(numeroDePoliza, aseguradp, sumaAsegurada, prima);
		this.bien = null;
		this.beneficiarios = new TreeMap<TipoDeBeneficiario, Persona>();
		this.robado = false;
		this.accidente = false;
	}
	
	public Bien getBien() {
		return bien;
	}

	@Override
	public void agregarBienAsegurado(Bien bien) {
		this.bien = bien;
	}

	@Override
	public void agregarBeneficiario(Persona persona, TipoDeBeneficiario tipo) {
		if(!this.beneficiarios.containsValue(persona)) {
			this.beneficiarios.put(tipo, persona);
		}
	}

	@Override
	public Integer obtenerCantidadDeBeneficiarios() {
		return this.beneficiarios.size();
	}

	@Override
	public boolean fueRobado() {
		return robado;
	}

	@Override
	public boolean tuvoAlgunAccidente() {
		return accidente;
	}

	@Override
	public void denunciarRobo() {
		this.robado = true;
	}

	@Override
	public void denunciarAccidente() {
		this.accidente = true;
	}

}
