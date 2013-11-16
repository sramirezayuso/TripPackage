
package org.tiket.oauth;

import javax.annotation.Generated;

@Generated(value = "Mule DevKit Version 3.4.0", date = "2013-11-16T03:08:13-03:00", comments = "Build 3.4.0.1555.8df15c1")
public interface OAuth1Adapter extends OAuthAdapter
{

        public String authorize(java.util.Map<String, String> extraParameters, String requestTokenUrl, String accessTokenUrl, String authorizationUrl, String redirectUri)
        throws UnableToAcquireRequestTokenException
    ;

    public void fetchAccessToken(String requestTokenUrl, String accessTokenUrl, String authorizationUrl, String redirectUri)
        throws UnableToAcquireAccessTokenException
    ;

    public String getAccessTokenSecret();

    public void setAccessTokenSecret(String value);
}
