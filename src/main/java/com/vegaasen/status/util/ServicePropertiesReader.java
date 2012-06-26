package com.vegaasen.status.util;

import com.vegaasen.status.model.Servers;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.Properties;

/**
 * @author vegaasen
 */
public class ServicePropertiesReader {

    private static final Logger LOGGER = Logger.getLogger(ServicePropertiesReader.class);

    public static Servers getServersFromPropertiesJSON(final String fileName) {
        Properties serverProperties = new Properties();
        try {
            serverProperties.load(ClassLoader.getSystemResource(fileName).openStream());
            if(!serverProperties.isEmpty()) {

            }
        } catch (IOException e) {
            LOGGER.error(String.format("Unable to read file [%s]",fileName));
        }
        return null;
    }

}
