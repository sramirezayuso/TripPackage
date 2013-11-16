
package org.tiket.adapters;

import javax.annotation.Generated;
import org.tiket.TiketConnector;
import org.tiket.connection.Connection;


/**
 * A <code>TiketConnectorConnectionIdentifierAdapter</code> is a wrapper around {@link TiketConnector } that implements {@link org.mule.devkit.dynamic.api.helper.Connection} interface.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.0", date = "2013-11-16T03:08:13-03:00", comments = "Build 3.4.0.1555.8df15c1")
public abstract class TiketConnectorConnectionIdentifierAdapter
    extends TiketConnectorProcessAdapter
    implements Connection
{


    public String getConnectionIdentifier() {
        return super.connectionId();
    }

}
