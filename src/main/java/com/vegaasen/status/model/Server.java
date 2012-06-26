package com.vegaasen.status.model;

import java.util.List;

/**
 * @author vegaasen
 */
public class Server {

    private String name;
    private String ip;
    private String type;
    private List<TunnelUser> tunnelUsers;
    private List<ListenPort> ports;
    private List<Feature> features;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<TunnelUser> getTunnelUsers() {
        return tunnelUsers;
    }

    public void setTunnelUsers(List<TunnelUser> tunnelUsers) {
        this.tunnelUsers = tunnelUsers;
    }

    public List<ListenPort> getPorts() {
        return ports;
    }

    public void setPorts(List<ListenPort> ports) {
        this.ports = ports;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }
}
