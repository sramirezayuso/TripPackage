
package org.expedia.config;

import javax.annotation.Generated;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;


/**
 * Registers bean definitions parsers for handling elements in <code>http://www.mulesoft.org/schema/mule/expediaconnector</code>.
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.0", date = "2013-11-13T05:00:27-03:00", comments = "Build 3.4.0.1555.8df15c1")
public class ExpediaconnectorNamespaceHandler
    extends NamespaceHandlerSupport
{


    /**
     * Invoked by the {@link DefaultBeanDefinitionDocumentReader} after construction but before any custom elements are parsed. 
     * @see NamespaceHandlerSupport#registerBeanDefinitionParser(String, BeanDefinitionParser)
     * 
     */
    public void init() {
        registerBeanDefinitionParser("config", new ExpediaConnectorConnectorConfigDefinitionParser());
        registerBeanDefinitionParser("my-processor", new MyProcessorDefinitionParser());
        registerBeanDefinitionParser("get-hotel-data", new GetHotelDataDefinitionParser());
        registerBeanDefinitionParser("say-hello", new SayHelloDefinitionParser());
    }

}
