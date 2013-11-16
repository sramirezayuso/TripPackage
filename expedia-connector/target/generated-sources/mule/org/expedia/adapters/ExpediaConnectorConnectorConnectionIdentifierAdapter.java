
package org.expedia.adapters;

import javax.annotation.Generated;
import org.expedia.ExpediaConnectorConnector;
import org.expedia.connection.Connection;


/**
 * A <code>ExpediaConnectorConnectorConnectionIdentifierAdapter</code> is a wrapper around {@link ExpediaConnectorConnector } that implements {@link org.mule.devkit.dynamic.api.helper.Connection} interface.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.0", date = "2013-11-13T05:00:27-03:00", comments = "Build 3.4.0.1555.8df15c1")
public abstract class ExpediaConnectorConnectorConnectionIdentifierAdapter
    extends ExpediaConnectorConnectorProcessAdapter
    implements Connection
{


    public String getConnectionIdentifier() {
        return super.connectionId();
    }

}
