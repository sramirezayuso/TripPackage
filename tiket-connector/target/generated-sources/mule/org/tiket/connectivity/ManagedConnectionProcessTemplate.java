
package org.tiket.connectivity;

import javax.annotation.Generated;
import org.mule.api.MuleContext;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.tiket.adapters.TiketConnectorConnectionIdentifierAdapter;
import org.tiket.connection.ConnectionManager;
import org.tiket.process.ManagedConnectionProcessInterceptor;
import org.tiket.process.ProcessCallback;
import org.tiket.process.ProcessCallbackProcessInterceptor;
import org.tiket.process.ProcessInterceptor;
import org.tiket.process.ProcessTemplate;
import org.tiket.process.RetryProcessInterceptor;

@Generated(value = "Mule DevKit Version 3.4.0", date = "2013-11-16T03:08:13-03:00", comments = "Build 3.4.0.1555.8df15c1")
public class ManagedConnectionProcessTemplate<P >implements ProcessTemplate<P, TiketConnectorConnectionIdentifierAdapter>
{

    private final ProcessInterceptor<P, TiketConnectorConnectionIdentifierAdapter> processInterceptor;

    public ManagedConnectionProcessTemplate(ConnectionManager<TiketConnectorConnectionKey, TiketConnectorConnectionIdentifierAdapter> connectionManager, MuleContext muleContext) {
        ProcessInterceptor<P, TiketConnectorConnectionIdentifierAdapter> processCallbackProcessInterceptor = new ProcessCallbackProcessInterceptor<P, TiketConnectorConnectionIdentifierAdapter>();
        ProcessInterceptor<P, TiketConnectorConnectionIdentifierAdapter> managedConnectionProcessInterceptor = new ManagedConnectionProcessInterceptor<P>(processCallbackProcessInterceptor, connectionManager, muleContext);
        ProcessInterceptor<P, TiketConnectorConnectionIdentifierAdapter> retryProcessInterceptor = new RetryProcessInterceptor<P, TiketConnectorConnectionIdentifierAdapter>(managedConnectionProcessInterceptor, muleContext, connectionManager.getRetryPolicyTemplate());
        processInterceptor = retryProcessInterceptor;
    }

    public P execute(ProcessCallback<P, TiketConnectorConnectionIdentifierAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
        throws Exception
    {
        return processInterceptor.execute(processCallback, null, messageProcessor, event);
    }

    public P execute(ProcessCallback<P, TiketConnectorConnectionIdentifierAdapter> processCallback, Filter filter, MuleMessage message)
        throws Exception
    {
        return processInterceptor.execute(processCallback, null, filter, message);
    }

}
