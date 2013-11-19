
package org.tiket.adapter;

import javax.annotation.Generated;

@Generated(value = "Mule DevKit Version 3.4.0", date = "2013-11-19T04:05:26-03:00", comments = "Build 3.4.0.1555.8df15c1")
public interface HttpCallbackAdapter {

      Integer getLocalPort();

    Integer getRemotePort();

    String getDomain();

    org.mule.api.transport.Connector getConnector();

    Boolean getAsync();

    String getPath();
}
