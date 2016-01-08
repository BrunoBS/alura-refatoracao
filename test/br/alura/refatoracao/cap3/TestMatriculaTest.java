package br.alura.refatoracao.cap3;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Test;

public class TestMatriculaTest {

	@Test
	public void testeIsTrial() {
		Matricula matricula = new Matricula(true, new GregorianCalendar(2020,
				Calendar.APRIL, 2));
		
		assertFalse(matricula.estadoValido());

	}
	
	@Test
	public void testeDataInferiorAHoje() {
		Matricula matricula = new Matricula(false, new GregorianCalendar(2010,
				Calendar.APRIL, 2));
		assertFalse(matricula.estadoValido());

	}
	
	@Test
	public void testeNaoEhTrialEDataSuperiorAHoje() {
		Matricula matricula = new Matricula(false, new GregorianCalendar(2020,
				Calendar.APRIL, 2));
		assertTrue(matricula.estadoValido());

	}

}
