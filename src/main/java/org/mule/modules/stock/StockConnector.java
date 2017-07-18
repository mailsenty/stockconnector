package org.mule.modules.stock;

import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;

import org.mule.modules.stock.config.ConnectorConfig;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


@Connector(name="stock", friendlyName="Stock")
public class StockConnector {

    @Config
    ConnectorConfig config;
    
    String historyURL="http://marketdata.websol.barchart.com/getHistory.json?key=d1a50e8ad3349ad625b09aee9f16d9ca&symbol=";
    String quoteURL="http://marketdata.websol.barchart.com/getQuote.json?key=d1a50e8ad3349ad625b09aee9f16d9ca&symbols=";
 
    @Processor
    public String getHistory(String symbols, String startDate) {
        /*
         * MESSAGE PROCESSOR CODE GOES HERE
         */
    	return processConnection(historyURL+symbols+"&type=daily&startDate="+startDate+"000000");
        
    }
    
    @Processor
    public String getQuote(String symbols) {
        /*
         * MESSAGE PROCESSOR CODE GOES HERE
         */
        return processConnection(quoteURL+symbols);
    }

    

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }
    
    private String processConnection(String urlString){
    	
    	URL url;
    	HttpURLConnection con ;
    	StringBuffer response = new StringBuffer();
        	
        	try {
        		System.out.println("urlString : " + urlString);
        		url= new URL(urlString);
    			con = (HttpURLConnection) url.openConnection();
    			
    			con.setRequestMethod("GET");

    			// add request header
    			int responseCode = con.getResponseCode();
    			System.out.println("\nSending 'GET' request to URL : " + url);
    			System.out.println("Response Code : " + responseCode);

    			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
    			String inputLine;
    			

    			while ((inputLine = in.readLine()) != null) {
    				response.append(inputLine);
    			}
    			in.close();
    		}  catch (Exception e) {
    			response=new StringBuffer("Error getting quote info");
    			e.printStackTrace();
    		}

    		// print result
    		return response.toString();
        }


}