
package org.expedia.adapters;

import javax.annotation.Generated;
import org.expedia.ExpediaConnectorConnector;
import org.expedia.basic.Capabilities;
import org.expedia.basic.Capability;


/**
 * A <code>ExpediaConnectorConnectorCapabilitiesAdapter</code> is a wrapper around {@link ExpediaConnectorConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.0", date = "2013-11-19T04:02:39-03:00", comments = "Build 3.4.0.1555.8df15c1")
public abstract class ExpediaConnectorConnectorCapabilitiesAdapter
    extends ExpediaConnectorConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(Capability capability) {
        if (capability == Capability.LIFECYCLE_CAPABLE) {
            return true;
        }
        if (capability == Capability.CONNECTION_MANAGEMENT_CAPABLE) {
            return true;
        }
        return false;
    }

}
