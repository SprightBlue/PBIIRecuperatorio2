package ar.edu.unlam.pb2.recuperatorio;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CompaniaDeSeguro {
	
	private String nombre;
	private Set<Poliza> polizas;

	public CompaniaDeSeguro(String nombre) {
		this.setNombre(nombre);
		this.polizas = new TreeSet<Poliza>(new Comparator<Poliza>() {

			@Override
			public int compare(Poliza poliza1, Poliza poliza2) {
				return poliza1.getNumeroDePoliza().compareTo(poliza2.getNumeroDePoliza());
			}
			
		});
	}
	
	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregarPoliza(Poliza poliza) {
		if(!this.polizas.contains(poliza)) {
			this.polizas.add(poliza);
		}
	}

	public Integer obtenerLaCantidadDePolizasEmitidas() {
		return this.polizas.size();
	}

	public void denunciarSiniestro(Integer numeroDePoliza) throws PolizaInexistente {
		Poliza polizaBuscada = this.getPoliza(numeroDePoliza);
		if(polizaBuscada==null) {
			throw new PolizaInexistente();
		}
		if(polizaBuscada instanceof SegurosDeVida) {
			((SegurosDeVida) polizaBuscada).denunciarAccidente();
		}else if(polizaBuscada instanceof SegurosGenerales) {
			((SegurosGenerales) polizaBuscada).denunciarRobo();
		}
	}

	public Poliza getPoliza(Integer numeroDePoliza) {
		Poliza polizaBuscada = null;
		Iterator<Poliza> iterador = this.polizas.iterator();
		boolean encontrado = false;
		while(!encontrado && iterador.hasNext()) {
			Poliza polizaIterada = iterador.next();
			if(polizaIterada.getNumeroDePoliza().equals(numeroDePoliza)) {
				polizaBuscada = polizaIterada;
				encontrado = true;
			}
		}
		return polizaBuscada;
	}

}
