package ar.edu.unlam.pb2.recuperatorio;

import java.util.TreeMap;
import java.util.Map;

public class PolizaAccidentesPersonales extends Poliza implements SegurosDeVida {

	private boolean accidente;
	
	private Map<TipoDeBeneficiario,Persona> beneficiarios;
	
	public PolizaAccidentesPersonales(Integer numeroDePoliza, Persona aseguradp, Double sumaAsegurada, Double prima) {
		super(numeroDePoliza, aseguradp, sumaAsegurada, prima);
		this.beneficiarios = new TreeMap<TipoDeBeneficiario, Persona>();
		this.accidente = false;
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
	public boolean tuvoAlgunAccidente() {
		return accidente;
	}

	@Override
	public void denunciarAccidente() {
		this.accidente = true;
	}

}
