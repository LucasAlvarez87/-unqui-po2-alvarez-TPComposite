package juegoDeEstatregia;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;



public class testDeJuego {
	private Mapa mapa;
	private Ingeniero ingeniero;
	
	@BeforeEach
	public void setUP() throws Exception {
		mapa = new Mapa();
		ingeniero = new Ingeniero(new Point(0,0),mapa);
	}
	
	@Test
	public void elIngenieroSeMueve() {
		mapa = new Mapa();
		ingeniero = new Ingeniero(new Point(0,0),mapa);
		ingeniero = new Ingeniero(new Point(0,0),mapa);
		ingeniero.moverA(new Point(0,2));
		assertTrue(mapa.getMatriz() [0] [1].estaMarcado() );
	}
	
	public void elCaballeroSeMueve() {
		
	}
}
