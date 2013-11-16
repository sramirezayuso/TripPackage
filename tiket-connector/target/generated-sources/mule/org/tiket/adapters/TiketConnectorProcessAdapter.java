
package org.tiket.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.tiket.TiketConnector;
import org.tiket.process.ProcessAdapter;
import org.tiket.process.ProcessCallback;
import org.tiket.process.ProcessTemplate;
import org.tiket.process.ProcessTemplate;


/**
 * A <code>TiketConnectorProcessAdapter</code> is a wrapper around {@link TiketConnector } that enables custom processing strategies.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.0", date = "2013-11-16T03:08:13-03:00", comments = "Build 3.4.0.1555.8df15c1")
public abstract class TiketConnectorProcessAdapter
    extends TiketConnectorLifecycleAdapter
    implements ProcessAdapter<TiketConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, TiketConnectorCapabilitiesAdapter> getProcessTemplate() {
        final TiketConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,TiketConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, TiketConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, TiketConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
