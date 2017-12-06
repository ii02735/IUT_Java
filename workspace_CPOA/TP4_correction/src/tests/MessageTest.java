package tests;

import static org.junit.Assert.*;
import org.junit.Test;

import formats.DashCap;
import formats.StarMin;
import gerantMessages.Message;



public class MessageTest {
	@Test
	public void test() {
		String texte = "Bonne Année !";
		Message sm = new Message(texte, new StarMin());
		Message dc = new Message(texte, new DashCap());

		assertEquals(" * bonne année ! * ", sm.toString());
		assertEquals(" # BONNE ANNÉE ! # ", dc.toString());
		dc.setFormat(new StarMin());
		assertEquals(" * bonne année ! * ", dc.toString());
	}
}
