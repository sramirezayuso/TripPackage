
package org.tiket.process;

import javax.annotation.Generated;


/**
 * Callback with logic to execute within a controlled environment provided by {@link ProcessTemplate}
 *  @param <T> type of the return value of the processing execution
 * 
 */
@Generated(value = "Mule DevKit Version 3.4.0", date = "2013-11-19T04:05:26-03:00", comments = "Build 3.4.0.1555.8df15c1")
public interface ProcessCallback<T,O >{

    T process(O object) throws Exception;

    java.util.List<Class> getManagedExceptions();

    boolean isProtected();

}
