package br.cesed.si.p3.deque;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TesteDeque {

	private Deque d;
	
	@Before
	public void TesteDeque(){
		d = new Deque(3);
	}
	
	@Test
	public void testSize(){
		d.addFinal("Object 1");
		d.addFinal("Object 2");
		d.addFinal("Object 3");
		d.addFinal("Object 4");
		Assert.assertEquals(d.size(), 4);
	}
	
	@Test
	public void testeAddFinal(){
		d.addFinal("Object 1");
		d.addFinal("Object 2");
		d.addFinal("Object 3");
		d.addFinal("Object 4");
		Assert.assertEquals(d.getLastObj(), "Object 4");
	}
	
	@Test
	public void testAddInit(){
		d.addFinal("Object 1");
		d.addFinal("Object 2");
		d.addInit("Object 3");
		d.addFinal("Object 4");
		Assert.assertEquals(d.getFirstObj(), "Object 3");
	} 

	@Test
	public void testRemoveFinal(){
		d.addFinal("Object 1");
		d.addFinal("Object 2");
		d.addFinal("Object 3");
		d.addFinal("Object 4");
		d.removeFinal();
		Assert.assertEquals(d.getFirstObj(), "Object 1");
	}
	
	@Test
	public void testRemoveInit(){
		d.addFinal("Object 1");
		d.addFinal("Object 2");
		d.addFinal("Object 3");
		d.addFinal("Object 4");
		d.removeInit();
		Assert.assertEquals(d.getFirstObj(), "Object 2");
	}
}
