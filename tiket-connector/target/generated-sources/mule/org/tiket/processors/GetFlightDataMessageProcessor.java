
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
 * GetFlightDataMessageProcessor invokes the {@link org.tiket.TiketConnector#getFlightData(java.lang.String, java.lang.String, java.lang.String, java.lang.String)} method in {@link TiketConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.0", date = "2013-11-16T03:08:13-03:00", comments = "Build 3.4.0.1555.8df15c1")
public class GetFlightDataMessageProcessor
    extends AbstractMessageProcessor<Object>
    implements Disposable, Initialisable, Startable, Stoppable, MessageProcessor
{

    protected Object token;
    protected String _tokenType;
    protected Object date;
    protected String _dateType;
    protected Object flight_id;
    protected String _flight_idType;
    protected Object outputgfd;
    protected String _outputgfdType;

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
     * Sets token
     * 
     * @param value Value to set
     */
    public void setToken(Object value) {
        this.token = value;
    }

    /**
     * Sets outputgfd
     * 
     * @param value Value to set
     */
    public void setOutputgfd(Object value) {
        this.outputgfd = value;
    }

    /**
     * Sets flight_id
     * 
     * @param value Value to set
     */
    public void setFlight_id(Object value) {
        this.flight_id = value;
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
            final String _transformedToken = ((String) evaluateAndTransform(getMuleContext(), event, GetFlightDataMessageProcessor.class.getDeclaredField("_tokenType").getGenericType(), null, token));
            final String _transformedDate = ((String) evaluateAndTransform(getMuleContext(), event, GetFlightDataMessageProcessor.class.getDeclaredField("_dateType").getGenericType(), null, date));
            final String _transformedFlight_id = ((String) evaluateAndTransform(getMuleContext(), event, GetFlightDataMessageProcessor.class.getDeclaredField("_flight_idType").getGenericType(), null, flight_id));
            final String _transformedOutputgfd = ((String) evaluateAndTransform(getMuleContext(), event, GetFlightDataMessageProcessor.class.getDeclaredField("_outputgfdType").getGenericType(), null, outputgfd));
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
                    return ((TiketConnector) object).getFlightData(_transformedToken, _transformedDate, _transformedFlight_id, _transformedOutputgfd);
                }

            }
            , this, event);
            overwritePayload(event, resultPayload);
            return event;
        } catch (MessagingException messagingException) {
            messagingException.setProcessedEvent(event);
            throw messagingException;
        } catch (Exception e) {
            throw new MessagingException(CoreMessages.failedToInvoke("getFlightData"), event, e);
        }
    }

}
