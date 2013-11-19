
package org.tiket.config;

import javax.annotation.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.tiket.processors.GetFlightDataMessageProcessor;
import org.w3c.dom.Element;

@Generated(value = "Mule DevKit Version 3.4.0", date = "2013-11-19T04:05:26-03:00", comments = "Build 3.4.0.1555.8df15c1")
public class GetFlightDataDefinitionParser
    extends AbstractDefinitionParser
{


    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(GetFlightDataMessageProcessor.class.getName());
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        parseConfigRef(element, builder);
        parseProperty(builder, element, "token", "token");
        parseProperty(builder, element, "date", "date");
        parseProperty(builder, element, "flight_id", "flight_id");
        parseProperty(builder, element, "outputgfd", "outputgfd");
        parseProperty(builder, element, "username", "username");
        parseProperty(builder, element, "password", "password");
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}
