package sistemaDeArchivos;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DirectorioTestCase {

	Directorio directorio;
	Archive archivo ;
	Directorio directorio2 ;
	Archive archivo2;
	Archive archivo3;
	
	@BeforeEach
	public void setUP() {
		directorio = new Directorio("Carpeta");
		archivo = mock(Archive.class);
	}
	
	@Test
	public void testInicioDeDirectorio() {
		assertEquals(directorio.getName(), "Carpeta");
		assertEquals(directorio.getOrden(), 1);
		assertEquals(directorio.getUltimaModificacion(), new Date());
		assertTrue(directorio.getContenido().isEmpty());
	}
}
