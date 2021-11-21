package Cultivos;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class testCultivos {
	
	private Cultivo cultivo;
	private Region region;
	private Region region2;
	private Soja soja;
	private Trigo trigo;
	
	@BeforeEach
	public void setUP() throws Exception {
		trigo = new Trigo();
		soja = new Soja();
		region = new Region();
		region.setCultivos(new Cultivo[]{soja,soja,trigo,trigo});
		region2 = new Region();
		region2.setCultivos(new Cultivo[] {soja,soja,region,trigo});
	}

	
	@Test
	public void testGananaciaAnualDeLaSoja() {
		assertEquals(soja.getGananciaAnual(), 500);
	}
	
	@Test
	public void testGananciaAnualDelTrigo() {
		assertEquals(trigo.getGananciaAnual(), 300);
	}
	
	@Test 
	public void testGananciaAnualDeLaRegion() {
		assertEquals(region.getGananciaAnual(), (1600/4) );
	}
	
	@Test
	public void testGananciaAnualDelCultivo() {
		assertEquals(region2.getGananciaAnual(), 425);
	}
}
