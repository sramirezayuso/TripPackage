
package org.expedia.config;

import javax.annotation.Generated;
import org.expedia.processors.GetHotelDataMessageProcessor;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

@Generated(value = "Mule DevKit Version 3.4.0", date = "2013-11-19T04:02:39-03:00", comments = "Build 3.4.0.1555.8df15c1")
public class GetHotelDataDefinitionParser
    extends AbstractDefinitionParser
{


    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(GetHotelDataMessageProcessor.class.getName());
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        parseConfigRef(element, builder);
        parseProperty(builder, element, "apiKey", "apiKey");
        parseProperty(builder, element, "currencyCode", "currencyCode");
        parseProperty(builder, element, "countryCode", "countryCode");
        parseProperty(builder, element, "city", "city");
        parseProperty(builder, element, "arrivalDate", "arrivalDate");
        parseProperty(builder, element, "departureDate", "departureDate");
        parseProperty(builder, element, "room1", "room1");
        parseProperty(builder, element, "numberOfResults", "numberOfResults");
        parseProperty(builder, element, "_type", "_type");
        parseProperty(builder, element, "username", "username");
        parseProperty(builder, element, "password", "password");
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}
