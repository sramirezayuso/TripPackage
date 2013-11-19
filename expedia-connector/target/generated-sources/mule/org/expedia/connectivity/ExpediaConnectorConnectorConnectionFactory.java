
package org.expedia.connectivity;

import javax.annotation.Generated;
import org.apache.commons.pool.KeyedPoolableObjectFactory;
import org.expedia.adapters.ExpediaConnectorConnectorRestClientAdapter;
import org.mule.api.context.MuleContextAware;
import org.mule.api.lifecycle.Disposable;
import org.mule.api.lifecycle.Initialisable;
import org.mule.api.lifecycle.Startable;
import org.mule.api.lifecycle.Stoppable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Generated(value = "Mule DevKit Version 3.4.0", date = "2013-11-19T04:02:39-03:00", comments = "Build 3.4.0.1555.8df15c1")
public class ExpediaConnectorConnectorConnectionFactory implements KeyedPoolableObjectFactory
{

    private static Logger logger = LoggerFactory.getLogger(ExpediaConnectorConnectorConnectionFactory.class);
    private ExpediaConnectorConnectorConnectionManager connectionManager;

    public ExpediaConnectorConnectorConnectionFactory(ExpediaConnectorConnectorConnectionManager connectionManager) {
        this.connectionManager = connectionManager;
    }

    public Object makeObject(Object key)
        throws Exception
    {
        if (!(key instanceof ExpediaConnectorConnectorConnectionKey)) {
            if (key == null) {
                logger.warn("Connection key is null");
            } else {
                logger.warn("Cannot cast key of type ".concat(key.getClass().getName().concat(" to ").concat("org.expedia.connectivity.ExpediaConnectorConnectorConnectionKey")));
            }
            throw new RuntimeException("Invalid key type ".concat(key.getClass().getName()));
        }
        ExpediaConnectorConnectorRestClientAdapter connector = new ExpediaConnectorConnectorRestClientAdapter();
        connector.setMyProperty(connectionManager.getMyProperty());
        if (connector instanceof Initialisable) {
            ((Initialisable) connector).initialise();
        }
        if (connector instanceof MuleContextAware) {
            ((MuleContextAware) connector).setMuleContext(connectionManager.getMuleContext());
        }
        if (connector instanceof Startable) {
            ((Startable) connector).start();
        }
        if (connector instanceof MuleContextAware) {
            connector.setMuleContext((connectionManager.muleContext));
        }
        if (!connector.isConnected()) {
            connector.connect(((ExpediaConnectorConnectorConnectionKey) key).getUsername(), ((ExpediaConnectorConnectorConnectionKey) key).getPassword());
        }
        return connector;
    }

    public void destroyObject(Object key, Object obj)
        throws Exception
    {
        if (!(key instanceof ExpediaConnectorConnectorConnectionKey)) {
            if (key == null) {
                logger.warn("Connection key is null");
            } else {
                logger.warn("Cannot cast key of type ".concat(key.getClass().getName().concat(" to ").concat("org.expedia.connectivity.ExpediaConnectorConnectorConnectionKey")));
            }
            throw new RuntimeException("Invalid key type ".concat(key.getClass().getName()));
        }
        if (!(obj instanceof ExpediaConnectorConnectorRestClientAdapter)) {
            if (obj == null) {
                logger.warn("Connector is null");
            } else {
                logger.warn("Cannot cast connector of type ".concat(obj.getClass().getName().concat(" to ").concat("org.expedia.adapters.ExpediaConnectorConnectorRestClientAdapter")));
            }
            throw new RuntimeException("Invalid connector type ".concat(obj.getClass().getName()));
        }
        try {
            ((ExpediaConnectorConnectorRestClientAdapter) obj).disconnect();
        } catch (Exception e) {
            throw e;
        } finally {
            if (((ExpediaConnectorConnectorRestClientAdapter) obj) instanceof Stoppable) {
                ((Stoppable) obj).stop();
            }
            if (((ExpediaConnectorConnectorRestClientAdapter) obj) instanceof Disposable) {
                ((Disposable) obj).dispose();
            }
        }
    }

    public boolean validateObject(Object key, Object obj) {
        if (!(obj instanceof ExpediaConnectorConnectorRestClientAdapter)) {
            if (obj == null) {
                logger.warn("Connector is null");
            } else {
                logger.warn("Cannot cast connector of type ".concat(obj.getClass().getName().concat(" to ").concat("org.expedia.adapters.ExpediaConnectorConnectorRestClientAdapter")));
            }
            throw new RuntimeException("Invalid connector type ".concat(obj.getClass().getName()));
        }
        try {
            return ((ExpediaConnectorConnectorRestClientAdapter) obj).isConnected();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return false;
        }
    }

    public void activateObject(Object key, Object obj)
        throws Exception
    {
        if (!(key instanceof ExpediaConnectorConnectorConnectionKey)) {
            throw new RuntimeException("Invalid key type");
        }
        if (!(obj instanceof ExpediaConnectorConnectorRestClientAdapter)) {
            throw new RuntimeException("Invalid connector type");
        }
        try {
            if (!((ExpediaConnectorConnectorRestClientAdapter) obj).isConnected()) {
                ((ExpediaConnectorConnectorRestClientAdapter) obj).connect(((ExpediaConnectorConnectorConnectionKey) key).getUsername(), ((ExpediaConnectorConnectorConnectionKey) key).getPassword());
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void passivateObject(Object key, Object obj)
        throws Exception
    {
    }

}
