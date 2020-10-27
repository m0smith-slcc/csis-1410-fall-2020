/**
 * 
 */
package cutter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author matt
 *
 */
class CutterTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void cutter__array() {
		PruningShears ps = new PruningShears(10);
		ElectricPruningShears eps = new ElectricPruningShears(24);
		eps.onOff();
		
		Pliers flush =  new Pliers(8, PliersType.FLUSH_CUTTER);
		Pliers nipper =  new Pliers(7, PliersType.END_NIPPER);
		Cutter side =  new Pliers(800, PliersType.SIDE_CUTTER);
		
		
		Cutter[] cutters = new Cutter[] {ps, eps, flush, nipper, side};
		for(Cutter c : cutters) {
			System.out.println(c.cut());
		}
		
		
	}
	
	@Test
	void cutter__downcast() {
		Integer i = new Integer(9);
		Cutter eps = new ElectricPruningShears(24);
		if(eps instanceof ElectricPruningShears) {
			ElectricPruningShears down = (ElectricPruningShears) eps;
		
			down.onOff();
		}
		
	}

}
