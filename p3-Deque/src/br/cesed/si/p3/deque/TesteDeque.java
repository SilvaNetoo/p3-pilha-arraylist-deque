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
	public void testeAddFinal(){
		d.addFinal("Object 1");
		d.addFinal("Object 2");
		Assert.assertEquals(d.getLastObj(), "Object 2");
	}
	
	@Test
	public void testeAddInit(){
		d.addFinal("Object 1");
		d.addFinal("Object 2");
		d.addInit("Object 3");
		Assert.assertEquals(d.getFirstObj(), "Object 3");
	} 

	@Test
	public void testeRemoveFinal(){
		d.addFinal("Object 1");
		d.addFinal("Object 2");
		d.removeFinal();
		Assert.assertEquals(d.getFirstObj(), "Object 1");
	}
	
	@Test
	public void testeRemoveInit(){
		d.addFinal("Object 1");
		d.addFinal("Object 2");
		d.removeInit();
		Assert.assertEquals(d.getFirstObj(), "Object 2");
	}
}
