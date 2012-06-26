package com.vegaasen.status.model;

/**
 * @author vegaasen
 */
public class Feature {

    private String name;
    private String type;
    private long updatedEvery;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getUpdatedEvery() {
        return updatedEvery;
    }

    public void setUpdatedEvery(long updatedEvery) {
        this.updatedEvery = updatedEvery;
    }
}
