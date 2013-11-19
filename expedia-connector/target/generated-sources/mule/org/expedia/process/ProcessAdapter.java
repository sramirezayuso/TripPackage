
package org.expedia.process;

import javax.annotation.Generated;

@Generated(value = "Mule DevKit Version 3.4.0", date = "2013-11-19T04:02:39-03:00", comments = "Build 3.4.0.1555.8df15c1")
public interface ProcessAdapter<O >{

    <T> ProcessTemplate<T, O> getProcessTemplate();
}
