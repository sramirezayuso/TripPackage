
package org.expedia.connectivity;

import javax.annotation.Generated;
import org.expedia.adapters.ExpediaConnectorConnectorConnectionIdentifierAdapter;
import org.expedia.connection.ConnectionManager;
import org.expedia.process.ManagedConnectionProcessInterceptor;
import org.expedia.process.ProcessCallback;
import org.expedia.process.ProcessCallbackProcessInterceptor;
import org.expedia.process.ProcessInterceptor;
import org.expedia.process.ProcessTemplate;
import org.expedia.process.RetryProcessInterceptor;
import org.mule.api.MuleContext;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;

@Generated(value = "Mule DevKit Version 3.4.0", date = "2013-11-13T05:00:27-03:00", comments = "Build 3.4.0.1555.8df15c1")
public class ManagedConnectionProcessTemplate<P >implements ProcessTemplate<P, ExpediaConnectorConnectorConnectionIdentifierAdapter>
{

    private final ProcessInterceptor<P, ExpediaConnectorConnectorConnectionIdentifierAdapter> processInterceptor;

    public ManagedConnectionProcessTemplate(ConnectionManager<ExpediaConnectorConnectorConnectionKey, ExpediaConnectorConnectorConnectionIdentifierAdapter> connectionManager, MuleContext muleContext) {
        ProcessInterceptor<P, ExpediaConnectorConnectorConnectionIdentifierAdapter> processCallbackProcessInterceptor = new ProcessCallbackProcessInterceptor<P, ExpediaConnectorConnectorConnectionIdentifierAdapter>();
        ProcessInterceptor<P, ExpediaConnectorConnectorConnectionIdentifierAdapter> managedConnectionProcessInterceptor = new ManagedConnectionProcessInterceptor<P>(processCallbackProcessInterceptor, connectionManager, muleContext);
        ProcessInterceptor<P, ExpediaConnectorConnectorConnectionIdentifierAdapter> retryProcessInterceptor = new RetryProcessInterceptor<P, ExpediaConnectorConnectorConnectionIdentifierAdapter>(managedConnectionProcessInterceptor, muleContext, connectionManager.getRetryPolicyTemplate());
        processInterceptor = retryProcessInterceptor;
    }

    public P execute(ProcessCallback<P, ExpediaConnectorConnectorConnectionIdentifierAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
        throws Exception
    {
        return processInterceptor.execute(processCallback, null, messageProcessor, event);
    }

    public P execute(ProcessCallback<P, ExpediaConnectorConnectorConnectionIdentifierAdapter> processCallback, Filter filter, MuleMessage message)
        throws Exception
    {
        return processInterceptor.execute(processCallback, null, filter, message);
    }

}
