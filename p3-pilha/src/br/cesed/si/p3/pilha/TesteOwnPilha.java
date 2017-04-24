package br.cesed.si.p3.pilha;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TesteOwnPilha {

	private OwnPilha p;

	@Before
	public void TesteOwnPilha(){
		p = new OwnPilha(3);
	}
	
	
	@Test
	public void testSize(){
		p.push("Object 1");
		p.push("Object 2");
		Assert.assertEquals(p.size(), 2);
	}
	
	@Test
	public void testPush(){
		p.push("Object 1");
		Assert.assertEquals(p.top(), "Object 1");
	}
	
	@Test
	public void testPop(){
		p.push("Object 1");
		p.push("Object 2");
		p.pop();
		Assert.assertEquals(p.top(), "Object 1");
	}

	@Test
	public void testTop(){
		p.push("Object 1");
		p.push("Object 2");
		Assert.assertEquals(p.top(), "Object 2");
	}
}
