
package org.tiket.config;

import javax.annotation.Generated;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;


/**
 * Registers bean definitions parsers for handling elements in <code>http://www.mulesoft.org/schema/mule/tiket</code>.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.0", date = "2013-11-19T04:05:26-03:00", comments = "Build 3.4.0.1555.8df15c1")
public class TiketNamespaceHandler
    extends NamespaceHandlerSupport
{


    /**
     * Invoked by the {@link DefaultBeanDefinitionDocumentReader} after construction but before any custom elements are parsed. 
     * @see NamespaceHandlerSupport#registerBeanDefinitionParser(String, BeanDefinitionParser)
     * 
     */
    public void init() {
        registerBeanDefinitionParser("config", new TiketConnectorConfigDefinitionParser());
        registerBeanDefinitionParser("my-processor", new MyProcessorDefinitionParser());
        registerBeanDefinitionParser("search-flights", new SearchFlightsDefinitionParser());
        registerBeanDefinitionParser("get-flight-data", new GetFlightDataDefinitionParser());
        registerBeanDefinitionParser("get-token", new GetTokenDefinitionParser());
    }

}
