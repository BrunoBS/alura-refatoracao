package br.alura.refatoracao.cap2;

import java.util.List;

public class Trem {

	private List<Vagao> vagoes;
	private int capacidade;

	public boolean podeReservar(int LugaresAReservar) {
		int lugaresDisponiveis = capacidade - lugaresJaRervados();
		return lugaresDisponiveis > LugaresAReservar;
	}

	private int lugaresJaRervados() {
		int lugaresJaReservados = 0;
		for (Vagao vagao : vagoes) {
			lugaresJaReservados += vagao.reservados();
		}
		return lugaresJaReservados;
	}

}