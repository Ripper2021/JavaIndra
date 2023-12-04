import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class PruebasUnitarias 
{
	@Test
	public void testAdd()
	{
		Matematicas math = new Matematicas();
		assertEquals(5, math.add(2, 3));
	}
	
	@Test
	public void testResta()
	{
		Matematicas math = new Matematicas();
		assertEquals(10, math.resta(5, 5));
		
	}
	@Test
	public void testMulti()
	{
		Matematicas math = new Matematicas();
		assertEquals(100, math.mult(10, 10));
	}
	@Test
	public void testDivision()
	{
		Matematicas math = new Matematicas();
		assertEquals(1, math.division(5, 5));
	}
	
	
	@Test
	public void testIgualdadObjetos()
	{
		String cadena1= "Hola";
		String cadena2= "Chau";
		assertNotEquals(cadena1, cadena2); //Valida que NO sean iguales. 
	}
	
	
	@Test
	public void testValorNulo()
	{
		String cadena= null;
		assertNull(cadena);
	}
	
	@Test
	public void testVerdadero()
	{
		assertTrue(5 > 3);
	}
	
	@Test
	public void testFalso()
	{
		assertFalse( 2==5);	
	}
}
class Matematicas
{
	public int add(int a, int b)
	{
		return a+b;
	}
	
	public int resta(int a, int b)
	{
		return a-b;
	}
	
	public int mult (int a, int b)
	{
		return a*b;
	}
	public int division (int a, int b)
	{
		return a/b;
	}
}