package com.zoo.models;

/**
 * Represents a visitor to the zoo.
 */
public class Visitor {
    private String name;
    private int visitorId;
    private String contactNumber;

    /**
     * Constructor to initialize a Visitor.
     *
     * @param visitorId     The unique ID of the visitor.
     * @param name          The name of the visitor.
     * @param contactNumber The visitor's contact number.
     */
    public Visitor(int visitorId, String name, String contactNumber) {
        this.visitorId = visitorId;
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public int getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(int visitorId) {
        this.visitorId = visitorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "visitorId=" + visitorId +
                ", name='" + name + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }
}