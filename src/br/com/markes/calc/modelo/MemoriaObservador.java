package br.com.markes.calc.modelo;

@FunctionalInterface
public interface MemoriaObservador {
	
	public void valorAlterado (String novoValor);

}
