package com.intiformation.jenkis.demo;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author IN-DF-017
 *
 */
public class CalculatriceTest {

	@Test
	public void testAdd() {
		Calculatrice cal = new Calculatrice();
		assertEquals("Est ce que l'addition est correcte",10,cal.add(5, 5));
	}

	@Test
	public void testMul() {
		Calculatrice cal = new Calculatrice();
		assertEquals("Est ce que l'addition est correcte",10,cal.mul(5, 3));
	}

}
