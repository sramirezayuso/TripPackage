
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
 * GetTokenMessageProcessor invokes the {@link org.tiket.TiketConnector#getToken(java.lang.String, java.lang.String)} method in {@link TiketConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.0", date = "2013-11-19T04:05:26-03:00", comments = "Build 3.4.0.1555.8df15c1")
public class GetTokenMessageProcessor
    extends AbstractMessageProcessor<Object>
    implements Disposable, Initialisable, Startable, Stoppable, MessageProcessor
{

    protected Object secretkey;
    protected String _secretkeyType;
    protected Object outputtoken;
    protected String _outputtokenType;

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
     * Sets outputtoken
     * 
     * @param value Value to set
     */
    public void setOutputtoken(Object value) {
        this.outputtoken = value;
    }

    /**
     * Sets secretkey
     * 
     * @param value Value to set
     */
    public void setSecretkey(Object value) {
        this.secretkey = value;
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
            final String _transformedSecretkey = ((String) evaluateAndTransform(getMuleContext(), event, GetTokenMessageProcessor.class.getDeclaredField("_secretkeyType").getGenericType(), null, secretkey));
            final String _transformedOutputtoken = ((String) evaluateAndTransform(getMuleContext(), event, GetTokenMessageProcessor.class.getDeclaredField("_outputtokenType").getGenericType(), null, outputtoken));
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
                    return ((TiketConnector) object).getToken(_transformedSecretkey, _transformedOutputtoken);
                }

            }
            , this, event);
            overwritePayload(event, resultPayload);
            return event;
        } catch (MessagingException messagingException) {
            messagingException.setProcessedEvent(event);
            throw messagingException;
        } catch (Exception e) {
            throw new MessagingException(CoreMessages.failedToInvoke("getToken"), event, e);
        }
    }

}
