/**
 * This file was automatically generated by the Mule Development Kit
 */
package org.expedia;

import java.io.IOException;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Connect;
import org.mule.api.annotations.ValidateConnection;
import org.mule.api.annotations.ConnectionIdentifier;
import org.mule.api.annotations.Disconnect;
import org.mule.api.annotations.param.ConnectionKey;
import org.mule.api.ConnectionException;
import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.rest.*;

/**
 * Cloud Connector
 *
 * @author MuleSoft, Inc.
 */
@Connector(name="expediaconnector", schemaVersion="1.0-SNAPSHOT", friendlyName="Expedia")
public abstract class ExpediaConnectorConnector
{

    /**
     * Configurable
     */
    @Configurable
    private String myProperty;

    /**
     * Set property
     *
     * @param myProperty My property
     */
    public void setMyProperty(String myProperty)
    {
        this.myProperty = myProperty;
    }

    /**
     * Get property
     */
    public String getMyProperty()
    {
        return this.myProperty;
    }

    /**
     * Connect
     *
     * @param username A username
     * @param password A password
     * @throws ConnectionException
     */
    @Connect
    public void connect(@ConnectionKey String username, String password)
        throws ConnectionException {
        /*
         * CODE FOR ESTABLISHING A CONNECTION GOES IN HERE
         */
    }

    /**
     * Disconnect
     */
    @Disconnect
    public void disconnect() {
        /*
         * CODE FOR CLOSING A CONNECTION GOES IN HERE
         */
    }

    /**
     * Are we connected
     */
    @ValidateConnection
    public boolean isConnected() {
        return true;
    }

    /**
     * Are we connected
     */
    @ConnectionIdentifier
    public String connectionId() {
        return "001";
    }

    /**
     * Custom processor
     *
     * {@sample.xml ../../../doc/ExpediaConnector-connector.xml.sample expediaconnector:my-processor}
     *
     * @param content Content to be processed
     * @return Some string
     */
    @Processor
    public String myProcessor(String content)
    {
        /*
         * MESSAGE PROCESSOR CODE GOES HERE
         */

        return "Hello";
    }
    /**
     * Custom processor
     *
     * {@sample.xml ../../../doc/ExpediaConnector-connector.xml.sample expediaconnector:my-processor}
     * 
     * @param apiKey
     *     key to use api
     * @param currencyCode
     *     currency
     * @param countryCode
     *     ISO country code
     * @param arrivalDate
     *     date of arrival
     * @param departureDate
     *     date of departure
     * @param room1
     *     number of guests
     * @param numberOfResults
     *     number of results to return
     * @param city
     *     a city
     * @param _type
     *     output format
     * @return Some string
     * @throws IOException
     *      when the call fails
     */
    @Processor
    @RestCall(uri = "http://api.ean.com/ean-services/rs/hotel/v3/list?", method = HttpMethod.GET)
    public abstract String getHotelData(
        @RestQueryParam("apiKey") String apiKey,
        @RestQueryParam("currencyCode") String currencyCode,
        @RestQueryParam("countryCode") String countryCode,
        @RestQueryParam("city") String city,
        @RestQueryParam("arrivalDate") String arrivalDate,
        @RestQueryParam("departureDate") String departureDate,
        @RestQueryParam("room1") String room1,
        @RestQueryParam("numberOfResults") String numberOfResults,
        @RestQueryParam("_type") String _type)
        throws IOException;

    /**
     * Custom processor
     *
     * {@sample.xml ../../../doc/ExpediaConnector-connector.xml.sample expediaconnector:my-processor}
     * 
     * @param apiKey
     *     key to use api
     * @param currencyCode
     *     currency
     * @param arrivalDate
     *     date of arrival
     * @param departureDate
     *     date of departure
     * @param room1
     *     number of guests
     * @param _type
     *     output format
     * @param hotelIdList
     *     selected hotels
     * @return Some string
     * @throws IOException
     *      when the call fails
     */
    @Processor
    @RestCall(uri = "http://api.ean.com/ean-services/rs/hotel/v3/list?", method = HttpMethod.GET)
    public abstract String getHotelData(
        @RestQueryParam("apiKey") String apiKey,
        @RestQueryParam("currencyCode") String currencyCode,
        @RestQueryParam("arrivalDate") String arrivalDate,
        @RestQueryParam("departureDate") String departureDate,
        @RestQueryParam("room1") String room1,
        @RestQueryParam("hotelIdList") String hotelIdList,
        @RestQueryParam("_type") String _type)
        throws IOException;
    
	/** 
	* Custom processor 
	* 
	* {@sample.xml ../../../doc/ExpediaConnector-connector.xml.sample expediaconnector:say-hello} 
	* 
	* @param uname Name to be processed 
	* @return Some string 
	*/
	@Processor
	public String sayHello(String uname) 
	{ 
	    return "Hello " + uname; 
	}

}
