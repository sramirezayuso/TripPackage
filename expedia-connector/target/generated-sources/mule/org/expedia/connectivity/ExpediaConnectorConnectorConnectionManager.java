
package org.expedia.connectivity;

import javax.annotation.Generated;
import org.apache.commons.pool.impl.GenericKeyedObjectPool;
import org.expedia.ExpediaConnectorConnector;
import org.expedia.adapters.ExpediaConnectorConnectorRestClientAdapter;
import org.expedia.basic.Capabilities;
import org.expedia.basic.Capability;
import org.expedia.basic.MetadataAware;
import org.expedia.connection.ConnectionManager;
import org.expedia.process.ProcessAdapter;
import org.expedia.process.ProcessTemplate;
import org.mule.api.MuleContext;
import org.mule.api.config.MuleProperties;
import org.mule.api.construct.FlowConstruct;
import org.mule.api.context.MuleContextAware;
import org.mule.api.lifecycle.Initialisable;
import org.mule.api.retry.RetryPolicyTemplate;
import org.mule.config.PoolingProfile;


/**
 * A {@code ExpediaConnectorConnectorConnectionManager} is a wrapper around {@link ExpediaConnectorConnector } that adds connection management capabilities to the pojo.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.0", date = "2013-11-19T04:02:39-03:00", comments = "Build 3.4.0.1555.8df15c1")
public class ExpediaConnectorConnectorConnectionManager implements Capabilities, MetadataAware, ConnectionManager<ExpediaConnectorConnectorConnectionKey, ExpediaConnectorConnectorRestClientAdapter> , ProcessAdapter<ExpediaConnectorConnectorRestClientAdapter> , MuleContextAware, Initialisable
{

    /**
     * 
     */
    private String username;
    /**
     * 
     */
    private String password;
    private String myProperty;
    /**
     * Mule Context
     * 
     */
    protected MuleContext muleContext;
    /**
     * Flow Construct
     * 
     */
    protected FlowConstruct flowConstruct;
    /**
     * Connector Pool
     * 
     */
    private GenericKeyedObjectPool connectionPool;
    protected PoolingProfile connectionPoolingProfile;
    protected RetryPolicyTemplate retryPolicyTemplate;
    private final static String MODULE_NAME = "Expedia";
    private final static String MODULE_VERSION = "1.0-SNAPSHOT";
    private final static String DEVKIT_VERSION = "3.4.0";
    private final static String DEVKIT_BUILD = "3.4.0.1555.8df15c1";

    /**
     * Sets myProperty
     * 
     * @param value Value to set
     */
    public void setMyProperty(String value) {
        this.myProperty = value;
    }

    /**
     * Retrieves myProperty
     * 
     */
    public String getMyProperty() {
        return this.myProperty;
    }

    /**
     * Sets muleContext
     * 
     * @param value Value to set
     */
    public void setMuleContext(MuleContext value) {
        this.muleContext = value;
    }

    /**
     * Retrieves muleContext
     * 
     */
    public MuleContext getMuleContext() {
        return this.muleContext;
    }

    /**
     * Sets flowConstruct
     * 
     * @param value Value to set
     */
    public void setFlowConstruct(FlowConstruct value) {
        this.flowConstruct = value;
    }

    /**
     * Retrieves flowConstruct
     * 
     */
    public FlowConstruct getFlowConstruct() {
        return this.flowConstruct;
    }

    /**
     * Sets connectionPoolingProfile
     * 
     * @param value Value to set
     */
    public void setConnectionPoolingProfile(PoolingProfile value) {
        this.connectionPoolingProfile = value;
    }

    /**
     * Retrieves connectionPoolingProfile
     * 
     */
    public PoolingProfile getConnectionPoolingProfile() {
        return this.connectionPoolingProfile;
    }

    /**
     * Sets retryPolicyTemplate
     * 
     * @param value Value to set
     */
    public void setRetryPolicyTemplate(RetryPolicyTemplate value) {
        this.retryPolicyTemplate = value;
    }

    /**
     * Retrieves retryPolicyTemplate
     * 
     */
    public RetryPolicyTemplate getRetryPolicyTemplate() {
        return this.retryPolicyTemplate;
    }

    /**
     * Sets username
     * 
     * @param value Value to set
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Retrieves username
     * 
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Sets password
     * 
     * @param value Value to set
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Retrieves password
     * 
     */
    public String getPassword() {
        return this.password;
    }

    public void initialise() {
        GenericKeyedObjectPool.Config config = new GenericKeyedObjectPool.Config();
        if (connectionPoolingProfile!= null) {
            config.maxIdle = connectionPoolingProfile.getMaxIdle();
            config.maxActive = connectionPoolingProfile.getMaxActive();
            config.maxWait = connectionPoolingProfile.getMaxWait();
            config.whenExhaustedAction = ((byte) connectionPoolingProfile.getExhaustedAction());
        }
        connectionPool = new GenericKeyedObjectPool(new ExpediaConnectorConnectorConnectionFactory(this), config);
        if (retryPolicyTemplate == null) {
            retryPolicyTemplate = muleContext.getRegistry().lookupObject(MuleProperties.OBJECT_DEFAULT_RETRY_POLICY_TEMPLATE);
        }
    }

    public ExpediaConnectorConnectorRestClientAdapter acquireConnection(ExpediaConnectorConnectorConnectionKey key)
        throws Exception
    {
        return ((ExpediaConnectorConnectorRestClientAdapter) connectionPool.borrowObject(key));
    }

    public void releaseConnection(ExpediaConnectorConnectorConnectionKey key, ExpediaConnectorConnectorRestClientAdapter connection)
        throws Exception
    {
        connectionPool.returnObject(key, connection);
    }

    public void destroyConnection(ExpediaConnectorConnectorConnectionKey key, ExpediaConnectorConnectorRestClientAdapter connection)
        throws Exception
    {
        connectionPool.invalidateObject(key, connection);
    }

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

    @Override
    public<P >ProcessTemplate<P, ExpediaConnectorConnectorRestClientAdapter> getProcessTemplate() {
        return new ManagedConnectionProcessTemplate(this, muleContext);
    }

    public ExpediaConnectorConnectorConnectionKey getDefaultConnectionKey() {
        return new ExpediaConnectorConnectorConnectionKey(getUsername(), getPassword());
    }

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
