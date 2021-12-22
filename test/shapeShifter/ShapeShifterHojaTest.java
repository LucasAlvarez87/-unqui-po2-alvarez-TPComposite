package shapeShifter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShapeShifterHojaTest {
	private ShapeShifterHoja sSimpleA;
	private ShapeShifterHoja sSimpleB;
	
	@BeforeEach
	public void setUp() {
		sSimpleA = new ShapeShifterHoja(1);
		sSimpleB = new ShapeShifterHoja(0);
	}

	@Test
	void testUnShapeShifterSimpleTieneValor1() {
		Integer valorEsperado = sSimpleA.getValue();
		assertEquals(1, valorEsperado);
	}
	
	@Test
	void testUnShapeShifterSimpleTieneValor2() {
		Integer valorEsperado = sSimpleB.getValue();
		assertEquals(0, valorEsperado);
	}
	
	@Test
	void testUnShapeSimpleTieneProfundidad0() {
		Integer result = sSimpleA.deepest();
		assertEquals(0, result);
	}
}
