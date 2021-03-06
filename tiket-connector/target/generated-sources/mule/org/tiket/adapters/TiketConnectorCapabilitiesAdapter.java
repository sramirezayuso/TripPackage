
package org.tiket.adapters;

import javax.annotation.Generated;
import org.tiket.TiketConnector;
import org.tiket.basic.Capabilities;
import org.tiket.basic.Capability;


/**
 * A <code>TiketConnectorCapabilitiesAdapter</code> is a wrapper around {@link TiketConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.0", date = "2013-11-19T04:05:26-03:00", comments = "Build 3.4.0.1555.8df15c1")
public abstract class TiketConnectorCapabilitiesAdapter
    extends TiketConnector
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
