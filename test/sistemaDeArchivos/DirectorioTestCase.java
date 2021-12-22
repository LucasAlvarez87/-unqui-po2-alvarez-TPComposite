package sistemaDeArchivos;

import static org.junit.Assert.assertFalse;
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
	public void setUP() throws Exception {
		directorio = new Directorio("Carpeta");
		archivo = mock(Archive.class);
		directorio2 = mock(Directorio.class);
		archivo2 = mock(Archive.class);
		archivo3 = mock(Archive.class);
	}
	
	@Test
	public void testInicioDeDirectorio() {
		assertEquals(directorio.getName(), "Carpeta");
		assertEquals(directorio.getOrden(), 1);
		assertTrue(directorio.getContenido().isEmpty());
		assertEquals(directorio.getUltimaModificacion().getMinutes(), new Date().getMinutes());
	}
	
	@Test
	public void agregarArchivoADirectorio() {
		directorio.agregarFileSystem(archivo);
		assertFalse( directorio.getContenido().isEmpty());
	}
	
	@Test
	public void agregarDirectorioADirectorio() {
		directorio.agregarFileSystem(directorio2);
		assertFalse( directorio.getContenido().isEmpty());
	}
	
	@Test
	public void eliminarArchivoADirectorio() {
		directorio.agregarFileSystem(archivo);
		directorio.eliminarFyleSystem(archivo);
		assertTrue( directorio.getContenido().isEmpty());
	}
	
	@Test
	public void totalSizeDeDirectorio() {
		archivo = new Archive("archivo1", 120);
		archivo2 = new Archive("archivo2", 200);
		directorio2 = new Directorio("directorio2");
		archivo3 = new Archive("archivo3", 600);
		
		directorio.agregarFileSystem(archivo);
		directorio.agregarFileSystem(archivo2);
		directorio.agregarFileSystem(directorio2);
		
		directorio2.agregarFileSystem(archivo3);
		
		assertEquals(directorio2.totalSize(), 600);
		assertEquals(directorio.totalSize(), 920);
	}
	
	@Test
	public void lastModified() {
		archivo = new Archive("archivo1", 120);
		archivo2 = new Archive("archivo2", 200);
		
		directorio.agregarFileSystem(archivo);
		directorio.agregarFileSystem(archivo2);
		
		assertEquals(directorio.getUltimaModificacion(), archivo2);
	}
	
}
