/**
 * 
 */
package id.ststech.javabasic.usingbitwise;

/**
 * @author Ali Irawan
 *
 */
public class BitwiseDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BomberMan player1 = new BomberMan();
		
		System.out.println(BomberMan.BOMB_MASK);
		System.out.println(BomberMan.FIRE_MASK);
		System.out.println(BomberMan.BOOT_MASK);
		System.out.println(BomberMan.CAN_KICK_MASK);
		System.out.println(BomberMan.CAN_THROW_MASK);
		System.out.println(BomberMan.POISONED_MASK);
		
	}

}
