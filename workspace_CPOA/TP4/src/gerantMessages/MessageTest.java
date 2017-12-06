package gerantMessages;

import static org.junit.Assert.*;
import org.junit.Test;

import Format.DashCap;
import Format.IFormat;
import Format.StarMin;

public class MessageTest {
	@Test
	public void test() {
		String texte = "Bonne Année !";
		IFormat starMin = new StarMin();
		IFormat dashCap = new DashCap();
        Message sm = new Message(texte,starMin);
        Message dc = new Message(texte,dashCap);

		assertEquals(" * bonne année ! * ", sm.toString());
		assertEquals(" # BONNE ANNÉE ! # ", dc.toString());
	}
}
