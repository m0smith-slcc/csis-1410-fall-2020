package balloon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BalloonTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void balloon_equal() {
		Balloon b1 = new Balloon(BalloonType.AIR, BalloonSize.S);
		Balloon b2 = new Balloon(BalloonType.AIR, BalloonSize.S);
		
		assertEquals(b1, b2);
	}

}
