package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TreasureChestTest {
	
	private TreasureChest chest;


	@BeforeEach
	void setUp() throws Exception {
		chest = new TreasureChest(10);
	}

	@Test
	void TreasureChestConstructor__happyPath() {
		
		int expected = 7;
		TreasureChest tc = new TreasureChest(expected);
		
		int actual = tc.getCoins();
		
		assertEquals(expected, actual);
		
		
	}

	@Test
	void addCoins__defaultChest__returnsNewQty() {
		int expected = 15;
		int actual = chest.addCoins(5);
		assertEquals(expected, actual);
	}
	
	@Test
	void addCoins__defaultChest__setsCoinCount() {
		int expected = 15;	 
		chest.addCoins(5);
		int actual = chest.getCoins();
		assertEquals(expected, actual);
	}
	
	@Test
	void addCoins__defaultChest__complainsAboutNegativeValue() {
		
		assertThrows(IllegalArgumentException.class, 
				() -> {chest.addCoins(-9);});
		
	}

	@Test
	void testRemoveCoins() {
		fail("Not yet implemented");
	}

	@Test
	void toString__defaultChest__happyPath() {
		String expected = "[ 10 coins ]";
		String actual = chest.toString();
		
		assertEquals(expected, actual);
	}

	@Test
	void testDollarValue() {
		fail("Not yet implemented");
	}

}
