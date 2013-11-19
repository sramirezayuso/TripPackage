
package org.expedia.adapters;

import javax.annotation.Generated;
import org.expedia.ExpediaConnectorConnector;
import org.expedia.basic.MetadataAware;


/**
 * A <code>ExpediaConnectorConnectorMetadataAdapater</code> is a wrapper around {@link ExpediaConnectorConnector } that adds support for querying metadata about the extension.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.0", date = "2013-11-19T04:02:39-03:00", comments = "Build 3.4.0.1555.8df15c1")
public abstract class ExpediaConnectorConnectorMetadataAdapater
    extends ExpediaConnectorConnectorCapabilitiesAdapter
    implements MetadataAware
{

    private final static String MODULE_NAME = "Expedia";
    private final static String MODULE_VERSION = "1.0-SNAPSHOT";
    private final static String DEVKIT_VERSION = "3.4.0";
    private final static String DEVKIT_BUILD = "3.4.0.1555.8df15c1";

    public String getModuleName() {
        return MODULE_NAME;
    }

    public String getModuleVersion() {
        return MODULE_VERSION;
    }

    public String getDevkitVersion() {
        return DEVKIT_VERSION;
    }

    public String getDevkitBuild() {
        return DEVKIT_BUILD;
    }

}
