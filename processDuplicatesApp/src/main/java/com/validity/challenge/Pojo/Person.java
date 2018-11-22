package com.validity.challenge.Pojo;

import com.opencsv.bean.CsvBindByName;
import org.json.simple.JSONObject;

public class Person {
    @CsvBindByName(column = "id")
    private String id;

    @CsvBindByName(column = "first_name")
    private String first_name;

    @CsvBindByName(column = "last_name")
    private String last_name;

    @CsvBindByName(column = "company")
    private String company;

    @CsvBindByName(column = "email")
    private String email;

    @CsvBindByName(column = "address1")
    private String address1;

    @CsvBindByName(column = "address2")
    private String address2;

    @CsvBindByName(column = "zip")
    private String zip;

    @CsvBindByName(column = "city")
    private String city;

    @CsvBindByName(column = "state")
    private String state;

    @CsvBindByName(column = "phone")
    private String phone;

    public String getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getCompany() {
        return company;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getZip() {
        return zip;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPhone() {
        return phone;
    }



    /* Returns Json Object of each row*/
    public JSONObject getJson() {
        JSONObject jssonData = new JSONObject();
        jssonData.put("id", this.getId());
        jssonData.put("firstName", this.getFirst_name());
        jssonData.put("lastName", this.getLast_name());
        jssonData.put("company", this.getCompany());
        jssonData.put("email", this.getEmail());
        jssonData.put("address1", this.getAddress1());
        jssonData.put("address2", this.getAddress2());
        jssonData.put("zip", this.getZip());
        jssonData.put("city", this.getCity());
        jssonData.put("state", this.getState());
        jssonData.put("phone", this.getPhone());

        return jssonData;
    }
}