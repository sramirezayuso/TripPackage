
package org.tiket.processors;

import java.util.List;
import javax.annotation.Generated;
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
import org.tiket.TiketConnector;
import org.tiket.connectivity.TiketConnectorConnectionManager;
import org.tiket.process.ProcessAdapter;
import org.tiket.process.ProcessCallback;
import org.tiket.process.ProcessTemplate;


/**
 * SearchFlightsMessageProcessor invokes the {@link org.tiket.TiketConnector#searchFlights(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)} method in {@link TiketConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.0", date = "2013-11-19T04:05:26-03:00", comments = "Build 3.4.0.1555.8df15c1")
public class SearchFlightsMessageProcessor
    extends AbstractMessageProcessor<Object>
    implements Disposable, Initialisable, Startable, Stoppable, MessageProcessor
{

    protected Object token;
    protected String _tokenType;
    protected Object d;
    protected String _dType;
    protected Object a;
    protected String _aType;
    protected Object date;
    protected String _dateType;
    protected Object adult;
    protected String _adultType;
    protected Object outputsf;
    protected String _outputsfType;

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
     * Sets outputsf
     * 
     * @param value Value to set
     */
    public void setOutputsf(Object value) {
        this.outputsf = value;
    }

    /**
     * Sets d
     * 
     * @param value Value to set
     */
    public void setD(Object value) {
        this.d = value;
    }

    /**
     * Sets token
     * 
     * @param value Value to set
     */
    public void setToken(Object value) {
        this.token = value;
    }

    /**
     * Sets a
     * 
     * @param value Value to set
     */
    public void setA(Object value) {
        this.a = value;
    }

    /**
     * Sets adult
     * 
     * @param value Value to set
     */
    public void setAdult(Object value) {
        this.adult = value;
    }

    /**
     * Sets date
     * 
     * @param value Value to set
     */
    public void setDate(Object value) {
        this.date = value;
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
            moduleObject = findOrCreate(TiketConnectorConnectionManager.class, false, event);
            final String _transformedToken = ((String) evaluateAndTransform(getMuleContext(), event, SearchFlightsMessageProcessor.class.getDeclaredField("_tokenType").getGenericType(), null, token));
            final String _transformedD = ((String) evaluateAndTransform(getMuleContext(), event, SearchFlightsMessageProcessor.class.getDeclaredField("_dType").getGenericType(), null, d));
            final String _transformedA = ((String) evaluateAndTransform(getMuleContext(), event, SearchFlightsMessageProcessor.class.getDeclaredField("_aType").getGenericType(), null, a));
            final String _transformedDate = ((String) evaluateAndTransform(getMuleContext(), event, SearchFlightsMessageProcessor.class.getDeclaredField("_dateType").getGenericType(), null, date));
            final String _transformedAdult = ((String) evaluateAndTransform(getMuleContext(), event, SearchFlightsMessageProcessor.class.getDeclaredField("_adultType").getGenericType(), null, adult));
            final String _transformedOutputsf = ((String) evaluateAndTransform(getMuleContext(), event, SearchFlightsMessageProcessor.class.getDeclaredField("_outputsfType").getGenericType(), null, outputsf));
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
                    return ((TiketConnector) object).searchFlights(_transformedToken, _transformedD, _transformedA, _transformedDate, _transformedAdult, _transformedOutputsf);
                }

            }
            , this, event);
            overwritePayload(event, resultPayload);
            return event;
        } catch (MessagingException messagingException) {
            messagingException.setProcessedEvent(event);
            throw messagingException;
        } catch (Exception e) {
            throw new MessagingException(CoreMessages.failedToInvoke("searchFlights"), event, e);
        }
    }

}
