package money;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WalletTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void wallet__add_bills() {
		Wallet wallet = new Wallet();
		wallet.add(USBill.GEORGE);
		wallet.add(USBill.FRANKLIN);
		assertEquals(10100, wallet.getValue());
	}
	
	@Test
	void wallet__class() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Class<?> clazz = Class.forName("money.Wallet");
		Object j = clazz.getDeclaredConstructor().newInstance();
		Method m = clazz.getMethod("add", Spendable.class);
		m.invoke(j, USBill.FRANKLIN);
	}

}
