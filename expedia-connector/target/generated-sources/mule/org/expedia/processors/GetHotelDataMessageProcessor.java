
package org.expedia.processors;

import java.util.List;
import javax.annotation.Generated;
import org.expedia.ExpediaConnectorConnector;
import org.expedia.connectivity.ExpediaConnectorConnectorConnectionManager;
import org.expedia.process.ProcessAdapter;
import org.expedia.process.ProcessCallback;
import org.expedia.process.ProcessTemplate;
import org.mule.api.MessagingException;
import org.mule.api.MuleContext;
import org.mule.api.MuleEvent;
import org.mule.api.MuleException;
import org.mule.api.construct.FlowConstruct;
import org.mule.api.lifecycle.Disposable;
import org.mule.api.lifecycle.Initialisable;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.api.lifecycle.Startable;
import org.mule.api.lifecycle.Stoppable;
import org.mule.api.processor.MessageProcessor;
import org.mule.config.i18n.CoreMessages;


/**
 * GetHotelDataMessageProcessor invokes the {@link org.expedia.ExpediaConnectorConnector#getHotelData(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)} method in {@link ExpediaConnectorConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.0", date = "2013-11-13T05:00:27-03:00", comments = "Build 3.4.0.1555.8df15c1")
public class GetHotelDataMessageProcessor
    extends AbstractMessageProcessor<Object>
    implements Disposable, Initialisable, Startable, Stoppable, MessageProcessor
{

    protected Object apiKey;
    protected String _apiKeyType;
    protected Object currencyCode;
    protected String _currencyCodeType;
    protected Object countryCode;
    protected String _countryCodeType;
    protected Object city;
    protected String _cityType;
    protected Object arrivalDate;
    protected String _arrivalDateType;
    protected Object departureDate;
    protected String _departureDateType;
    protected Object room1;
    protected String _room1Type;
    protected Object numberOfResults;
    protected String _numberOfResultsType;

    /**
     * Obtains the expression manager from the Mule context and initialises the connector. If a target object  has not been set already it will search the Mule registry for a default one.
     * 
     * @throws InitialisationException
     */
    public void initialise()
        throws InitialisationException
    {
    }

    public void start()
        throws MuleException
    {
    }

    public void stop()
        throws MuleException
    {
    }

    public void dispose() {
    }

    /**
     * Set the Mule context
     * 
     * @param context Mule context to set
     */
    public void setMuleContext(MuleContext context) {
        super.setMuleContext(context);
    }

    /**
     * Sets flow construct
     * 
     * @param flowConstruct Flow construct to set
     */
    public void setFlowConstruct(FlowConstruct flowConstruct) {
        super.setFlowConstruct(flowConstruct);
    }

    /**
     * Sets currencyCode
     * 
     * @param value Value to set
     */
    public void setCurrencyCode(Object value) {
        this.currencyCode = value;
    }

    /**
     * Sets numberOfResults
     * 
     * @param value Value to set
     */
    public void setNumberOfResults(Object value) {
        this.numberOfResults = value;
    }

    /**
     * Sets room1
     * 
     * @param value Value to set
     */
    public void setRoom1(Object value) {
        this.room1 = value;
    }

    /**
     * Sets departureDate
     * 
     * @param value Value to set
     */
    public void setDepartureDate(Object value) {
        this.departureDate = value;
    }

    /**
     * Sets countryCode
     * 
     * @param value Value to set
     */
    public void setCountryCode(Object value) {
        this.countryCode = value;
    }

    /**
     * Sets arrivalDate
     * 
     * @param value Value to set
     */
    public void setArrivalDate(Object value) {
        this.arrivalDate = value;
    }

    /**
     * Sets apiKey
     * 
     * @param value Value to set
     */
    public void setApiKey(Object value) {
        this.apiKey = value;
    }

    /**
     * Sets city
     * 
     * @param value Value to set
     */
    public void setCity(Object value) {
        this.city = value;
    }

    /**
     * Invokes the MessageProcessor.
     * 
     * @param event MuleEvent to be processed
     * @throws MuleException
     */
    public MuleEvent process(final MuleEvent event)
        throws MuleException
    {
        Object moduleObject = null;
        try {
            moduleObject = findOrCreate(ExpediaConnectorConnectorConnectionManager.class, false, event);
            final String _transformedApiKey = ((String) evaluateAndTransform(getMuleContext(), event, GetHotelDataMessageProcessor.class.getDeclaredField("_apiKeyType").getGenericType(), null, apiKey));
            final String _transformedCurrencyCode = ((String) evaluateAndTransform(getMuleContext(), event, GetHotelDataMessageProcessor.class.getDeclaredField("_currencyCodeType").getGenericType(), null, currencyCode));
            final String _transformedCountryCode = ((String) evaluateAndTransform(getMuleContext(), event, GetHotelDataMessageProcessor.class.getDeclaredField("_countryCodeType").getGenericType(), null, countryCode));
            final String _transformedCity = ((String) evaluateAndTransform(getMuleContext(), event, GetHotelDataMessageProcessor.class.getDeclaredField("_cityType").getGenericType(), null, city));
            final String _transformedArrivalDate = ((String) evaluateAndTransform(getMuleContext(), event, GetHotelDataMessageProcessor.class.getDeclaredField("_arrivalDateType").getGenericType(), null, arrivalDate));
            final String _transformedDepartureDate = ((String) evaluateAndTransform(getMuleContext(), event, GetHotelDataMessageProcessor.class.getDeclaredField("_departureDateType").getGenericType(), null, departureDate));
            final String _transformedRoom1 = ((String) evaluateAndTransform(getMuleContext(), event, GetHotelDataMessageProcessor.class.getDeclaredField("_room1Type").getGenericType(), null, room1));
            final String _transformedNumberOfResults = ((String) evaluateAndTransform(getMuleContext(), event, GetHotelDataMessageProcessor.class.getDeclaredField("_numberOfResultsType").getGenericType(), null, numberOfResults));
            Object resultPayload;
            ProcessTemplate<Object, Object> processTemplate = ((ProcessAdapter<Object> ) moduleObject).getProcessTemplate();
            resultPayload = processTemplate.execute(new ProcessCallback<Object,Object>() {


                public List<Class> getManagedExceptions() {
                    return null;
                }

                public boolean isProtected() {
                    return false;
                }

                public Object process(Object object)
                    throws Exception
                {
                    return ((ExpediaConnectorConnector) object).getHotelData(_transformedApiKey, _transformedCurrencyCode, _transformedCountryCode, _transformedCity, _transformedArrivalDate, _transformedDepartureDate, _transformedRoom1, _transformedNumberOfResults);
                }

            }
            , this, event);
            overwritePayload(event, resultPayload);
            return event;
        } catch (MessagingException messagingException) {
            messagingException.setProcessedEvent(event);
            throw messagingException;
        } catch (Exception e) {
            throw new MessagingException(CoreMessages.failedToInvoke("getHotelData"), event, e);
        }
    }

}
