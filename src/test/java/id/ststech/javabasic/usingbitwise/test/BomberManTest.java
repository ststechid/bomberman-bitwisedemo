package id.ststech.javabasic.usingbitwise.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import id.ststech.javabasic.usingbitwise.BomberMan;

public class BomberManTest {

	/**
	 * Make sure the setter/getter for Bomb works correctly
	 */
	@Test
	public void testSetterGetterBomb() {

		BomberMan player1 = new BomberMan();

		// Bomb should can be set from 1 to 15 only

		player1.setBomb(0);
		Assertions.assertEquals(1, player1.getBomb());

		player1.setBomb(1);
		Assertions.assertEquals(1, player1.getBomb());

		player1.setBomb(2);
		Assertions.assertEquals(2, player1.getBomb());

		player1.setBomb(3);
		Assertions.assertEquals(3, player1.getBomb());

		player1.setBomb(4);
		Assertions.assertEquals(4, player1.getBomb());

		player1.setBomb(5);
		Assertions.assertEquals(5, player1.getBomb());

		player1.setBomb(6);
		Assertions.assertEquals(6, player1.getBomb());

		player1.setBomb(7);
		Assertions.assertEquals(7, player1.getBomb());

		player1.setBomb(8);
		Assertions.assertEquals(8, player1.getBomb());

		player1.setBomb(9);
		Assertions.assertEquals(9, player1.getBomb());

		player1.setBomb(10);
		Assertions.assertEquals(10, player1.getBomb());

		player1.setBomb(11);
		Assertions.assertEquals(11, player1.getBomb());

		player1.setBomb(12);
		Assertions.assertEquals(12, player1.getBomb());

		player1.setBomb(13);
		Assertions.assertEquals(13, player1.getBomb());

		player1.setBomb(14);
		Assertions.assertEquals(14, player1.getBomb());

		player1.setBomb(15);
		Assertions.assertEquals(15, player1.getBomb());

		player1.setBomb(16);
		Assertions.assertEquals(15, player1.getBomb());

		player1.setBomb(17);
		Assertions.assertEquals(15, player1.getBomb());
	}

	/**
	 * Make sure the setter/getter for Fire works correctly
	 */
	@Test
	public void testSetterGetterFire() {

		BomberMan player1 = new BomberMan();

		// Fire should can be set from 1 to 15 only

		player1.setFire(0);
		Assertions.assertEquals(1, player1.getFire());

		player1.setFire(1);
		Assertions.assertEquals(1, player1.getFire());

		player1.setFire(2);
		Assertions.assertEquals(2, player1.getFire());

		player1.setFire(3);
		Assertions.assertEquals(3, player1.getFire());

		player1.setFire(4);
		Assertions.assertEquals(4, player1.getFire());

		player1.setFire(5);
		Assertions.assertEquals(5, player1.getFire());

		player1.setFire(6);
		Assertions.assertEquals(6, player1.getFire());

		player1.setFire(7);
		Assertions.assertEquals(7, player1.getFire());

		player1.setFire(8);
		Assertions.assertEquals(8, player1.getFire());

		player1.setFire(9);
		Assertions.assertEquals(9, player1.getFire());

		player1.setFire(10);
		Assertions.assertEquals(10, player1.getFire());

		player1.setFire(11);
		Assertions.assertEquals(11, player1.getFire());

		player1.setFire(12);
		Assertions.assertEquals(12, player1.getFire());

		player1.setFire(13);
		Assertions.assertEquals(13, player1.getFire());

		player1.setFire(14);
		Assertions.assertEquals(14, player1.getFire());

		player1.setFire(15);
		Assertions.assertEquals(15, player1.getFire());

		player1.setFire(16);
		Assertions.assertEquals(15, player1.getFire());

		player1.setFire(17);
		Assertions.assertEquals(15, player1.getFire());
	}

	/**
	 * Make sure the setter/getter for Boot works correctly
	 */
	@Test
	public void testSetterGetterBoot() {

		BomberMan player1 = new BomberMan();

		// Boot should can be set from 1 to 15 only

		player1.setBoot(0);
		Assertions.assertEquals(1, player1.getBoot());

		player1.setBoot(1);
		Assertions.assertEquals(1, player1.getBoot());

		player1.setBoot(2);
		Assertions.assertEquals(2, player1.getBoot());

		player1.setBoot(3);
		Assertions.assertEquals(3, player1.getBoot());

		player1.setBoot(4);
		Assertions.assertEquals(4, player1.getBoot());

		player1.setBoot(5);
		Assertions.assertEquals(5, player1.getBoot());

		player1.setBoot(6);
		Assertions.assertEquals(6, player1.getBoot());

		player1.setBoot(7);
		Assertions.assertEquals(7, player1.getBoot());

		player1.setBoot(8);
		Assertions.assertEquals(8, player1.getBoot());

		player1.setBoot(9);
		Assertions.assertEquals(9, player1.getBoot());

		player1.setBoot(10);
		Assertions.assertEquals(10, player1.getBoot());

		player1.setBoot(11);
		Assertions.assertEquals(11, player1.getBoot());

		player1.setBoot(12);
		Assertions.assertEquals(12, player1.getBoot());

		player1.setBoot(13);
		Assertions.assertEquals(13, player1.getBoot());

		player1.setBoot(14);
		Assertions.assertEquals(14, player1.getBoot());

		player1.setBoot(15);
		Assertions.assertEquals(15, player1.getBoot());

		player1.setBoot(16);
		Assertions.assertEquals(15, player1.getBoot());

		player1.setBoot(17);
		Assertions.assertEquals(15, player1.getBoot());
	}

	/**
	 * Make sure can kick works
	 */
	@Test
	public void testCanKick() {

		BomberMan player1 = new BomberMan();

		player1.setCanKick(true);
		Assertions.assertTrue(player1.isCanKick());

		player1.setCanKick(false);
		Assertions.assertTrue(!player1.isCanKick());
	}

	/**
	 * Make sure can throw works
	 */
	@Test
	public void testCanThrow() {

		BomberMan player1 = new BomberMan();

		player1.setCanThrow(true);
		Assertions.assertTrue(player1.isCanThrow());

		player1.setCanThrow(false);
		Assertions.assertTrue(!player1.isCanThrow());
	}
	
	/**
	 * Make sure poisoned status works
	 */
	@Test
	public void testPoisonedStatus() {

		BomberMan player1 = new BomberMan();

		player1.setPoisoned(true);
		Assertions.assertTrue(player1.isPoisoned());

		player1.setPoisoned(false);
		Assertions.assertTrue(!player1.isPoisoned());
	}
}
