package br.alura.refatoracao.cap6;

public enum Moeda {
	DOLAR(2.7), EURO(3.0), REAL(1D);

	private Double taxa;

	private Moeda(Double taxa) {
		this.taxa = taxa;
	}

	public Double getTaxa() {
		return taxa;
	}

}
