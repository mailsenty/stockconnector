package org.mule.modules.stock;

import static org.junit.Assert.*;



import org.junit.Test;

public class StockConnectorTest {
	
	StockConnector stockConnector = new StockConnector();

	@Test
	public void testGetHistory() {
		System.out.println(stockConnector.getHistory("GOOG", "20161212"));
		
	}

	@Test
	public void testGetQuote() {
		System.out.println(stockConnector.getQuote("GOOG,AAPL"));
	}

}
