package com.vegaasen.status.run;

import com.vegaasen.status.run.container.StartJettyContainer;

/**
 * Simple runnable that allow users to start the application from
 * a simple command rather than installing the whole application in an Application-Container
 * alà Tomcat / Weblogic / Glassfish etc.
 *
 * Using Jetty status server for this.
 * Read more @ :
 * <a href="">Jetty Documentation</a>
 *
 * @author vegaasen
 * @version 1.0-SNAPSHOT
 */
public class Run {

    public static void main (String... args) {
        StartJettyContainer.initiateAndStartServer();
    }

}
