
package org.tiket.oauth;

import javax.annotation.Generated;


/**
 * Exception thrown when the request token needed for building the authorization URL cannot be acquired
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.0", date = "2013-11-16T03:08:13-03:00", comments = "Build 3.4.0.1555.8df15c1")
public class UnableToAcquireRequestTokenException
    extends Exception
{


    public UnableToAcquireRequestTokenException(Throwable throwable) {
        super(throwable);
    }

}