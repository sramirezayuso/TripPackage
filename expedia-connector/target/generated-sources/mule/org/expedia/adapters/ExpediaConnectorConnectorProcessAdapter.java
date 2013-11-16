
package org.expedia.adapters;

import javax.annotation.Generated;
import org.expedia.ExpediaConnectorConnector;
import org.expedia.process.ProcessAdapter;
import org.expedia.process.ProcessCallback;
import org.expedia.process.ProcessTemplate;
import org.expedia.process.ProcessTemplate;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;


/**
 * A <code>ExpediaConnectorConnectorProcessAdapter</code> is a wrapper around {@link ExpediaConnectorConnector } that enables custom processing strategies.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.0", date = "2013-11-13T05:00:27-03:00", comments = "Build 3.4.0.1555.8df15c1")
public abstract class ExpediaConnectorConnectorProcessAdapter
    extends ExpediaConnectorConnectorLifecycleAdapter
    implements ProcessAdapter<ExpediaConnectorConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, ExpediaConnectorConnectorCapabilitiesAdapter> getProcessTemplate() {
        final ExpediaConnectorConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,ExpediaConnectorConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, ExpediaConnectorConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, ExpediaConnectorConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
