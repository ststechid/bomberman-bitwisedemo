package id.ststech.javabasic.usingbitwise;

public class BomberMan {

	private final static int BOMB_MASK_MAX = 15;
	private final static int FIRE_MASK_MAX = 15;
	private final static int BOOT_MASK_MAX = 15;
	
	// Start 0b, means binary, this is 15
	public final static int BOMB_MASK = 0b0000_0000_0000_0000_0000_0000_0000_1111;

	// Start 0b, means binary, this is 240
	public final static int FIRE_MASK = 0b0000_0000_0000_0000_0000_0000_1111_0000;

	// Start 0b, means binary, this is 3840
	public final static int BOOT_MASK = 0b0000_0000_0000_0000_0000_1111_0000_0000;

	// Start 0b, means binary, this is 4096
	public final static int CAN_KICK_MASK = 0b0000_0000_0000_0000_0001_0000_0000_0000;

	// Start 0b, means binary, this is 8192
	public final static int CAN_THROW_MASK = 0b0000_0000_0000_0000_0010_0000_0000_0000;

	// Start 0b, means binary, this is 16384
	public final static int POISONED_MASK = 0b0000_0000_0000_0000_0100_0000_0000_0000;

	private int data;
	
	/**
	 * Set the bomb count
	 * @param bombCount bomb count from 1 to 15, if zero given, the bomb will set to 1, if greater than 15, it will set to 15
	 */
	public void setBomb(int bombCount) {
		
		if(bombCount == 0) bombCount = 1;
		if(bombCount > BOMB_MASK_MAX) bombCount = BOMB_MASK_MAX;
		
		// Make the 1-4 bits from right is zero
		data = data & 0b1111_1111_1111_1111_1111_1111_1111_0000;
		
		// Then set the bits using bombCount;
		data = data | bombCount;
	}
	
	/**
	 * Get the bomb count
	 * @return bomb count
	 */
	public int getBomb() {
		return data & BOMB_MASK; 
	}
	
	/**
	 * Set the fire count
	 * @param fireCount fire count from 1 to 15, if zero given, the fire will set to 1, if greater than 15, it will set to 15
	 */
	public void setFire(int fireCount) {
		
		if(fireCount == 0) fireCount = 1;
		if(fireCount > FIRE_MASK_MAX) fireCount = FIRE_MASK_MAX;
		
		// Make the 5-8 bits from right is zero
		data = data & 0b1111_1111_1111_1111_1111_1111_0000_1111;
		
		// Then set the bits using bombCount;
		data = data | (fireCount << 4);
	}
	
	/**
	 * Get the fire count
	 * @return fire count
	 */
	public int getFire() {
		return (data & FIRE_MASK ) >> 4; 
	}
	
	/**
	 * Set the boot count
	 * @param bootCount fire count from 1 to 15, if zero given, the fire will set to 1, if greater than 15, it will set to 15
	 */
	public void setBoot(int bootCount) {
		
		if(bootCount == 0) bootCount = 1;
		if(bootCount > BOOT_MASK_MAX) bootCount = BOOT_MASK_MAX;
		
		// Make the 9-12 bits from right is zero
		data = data & 0b1111_1111_1111_1111_1111_0000_1111_1111;
		
		// Then set the bits using bombCount;
		data = data | (bootCount << 8);
	}
	
	/**
	 * Get the boot count
	 * @return boot count
	 */
	public int getBoot() {
		return (data & BOOT_MASK ) >> 8; 
	}
	
	/**
	 * Set whether can kick or not
	 * @param canKick true for can kick, or false if cannot kick
	 */
	public void setCanKick(boolean canKick) {
		if (canKick) {
			data = data | CAN_KICK_MASK;
		} else {
			// ~ is used for invert
			data = data & ~CAN_KICK_MASK;
		}
	}

	/**
	 * Whether can kick or not
	 * @return true if can kick, false if cannot kick
	 */
	public boolean isCanKick() {
		return (data & CAN_KICK_MASK) == CAN_KICK_MASK; 
	}
	
	/**
	 * Set whether can throw or not
	 * @param canThrow true for can throw, or false if cannot throw
	 */
	public void setCanThrow(boolean canThrow) {
		if (canThrow) {
			data = data | CAN_THROW_MASK;
		} else {
			// ~ is used for invert
			data = data & ~CAN_THROW_MASK;
		}
	}

	/**
	 * Whether can throw or not
	 * @return true if can throw, false if cannot throw
	 */
	public boolean isCanThrow() {
		return (data & CAN_THROW_MASK) == CAN_THROW_MASK; 
	}
	
	/**
	 * Set whether is poisoned
	 * @param poisoned true for poisoned, or false if not
	 */
	public void setPoisoned(boolean poisoned) {
		if (poisoned) {
			data = data | POISONED_MASK;
		} else {
			// ~ is used for invert
			data = data & ~POISONED_MASK;
		}
	}

	/**
	 * Whether poisoned or not
	 * @return true if poisoned, false if not
	 */
	public boolean isPoisoned() {
		return (data & POISONED_MASK) == POISONED_MASK; 
	}
}
