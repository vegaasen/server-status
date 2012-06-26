package com.vegaasen.status.model;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vegaasen
 */
public class Servers {

    private static final Logger LOGGER = Logger.getLogger(Servers.class);

    private String name;
    private List<Server> servers = new ArrayList<Server>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Server> getServers() {
        return servers;
    }

    public void setServers(List<Server> servers) {
        this.servers = servers;
    }

    public void addServer(Server server) {
        if(servers!=null) {
            servers.add(server);
        }else{
            LOGGER.error("Unable to add server.");
        }
    }

}
