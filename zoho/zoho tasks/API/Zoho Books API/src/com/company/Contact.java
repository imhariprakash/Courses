package com.company;

import java.util.HashMap;
import java.util.Map;

public class Contact {
    private String contact_type;
    private String customer_sub_type;
    private String contact_name;
    private String company_name;
    private boolean is_portal_enabled;

    private String website;
    private String language_code = "en";

    private HashMap<String, String> billing_address;
    private HashMap<String, String> shipping_address;

    public Contact(String contact_type, String customer_sub_type, String contact_name, String company_name, boolean is_portal_enabled) {
        this.contact_type = contact_type;
        this.customer_sub_type = customer_sub_type;
        this.contact_name = contact_name;
        this.company_name = company_name;
        this.is_portal_enabled = is_portal_enabled;
    }

    public String getContactType() {
        return contact_type;
    }

    public String getCustomerSubType() {
        return customer_sub_type;
    }

    public String getContactName() {
        return contact_name;
    }

    public String getCompanyName() {
        return company_name;
    }

    public boolean getIsPortalEnabled() {
        return is_portal_enabled;
    }

    public String getWebsite() {
        return website;
    }

    public String getLanguageCode() {
        return language_code;
    }

    public Map<String, String> getBillingAddress() {
        return billing_address;
    }

    public Map<String, String> getShippingAddress() {
        return shipping_address;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setLanguageCode(String language_code) {
        this.language_code = language_code;
    }

    public void setBillingAddress(HashMap<String, String> billing_address) {
        this.billing_address = billing_address;
    }

    public void setShippingAddress(HashMap<String, String> shipping_address) {
        this.shipping_address = shipping_address;
    }

    public void setShippingAddress(){
        System.out.println("Enter shipping address: \n");
        getAddress(shipping_address);
    }

    public void setBillingAddress(){
        System.out.println("Enter billing address: \n");
        getAddress(billing_address);
    }

    public void getAddress(Map<String,String> address_map) {
        String attention = UserInput.getString("Enter attention: ");
        String address = UserInput.getString("Enter address : ");
        String street2 = UserInput.getString("Enter street2: ");
        String state_code = UserInput.getString("Enter state code: ");
        String city = UserInput.getString("Enter city: ");
        String state = UserInput.getString("Enter state: ");
        String zip = UserInput.getString("Enter zip code: ");
        String country = UserInput.getString("Enter country: ");
        String fax = UserInput.getString("Enter fax: ");
        String phone = UserInput.getString("Enter phone: ");
        address_map = new HashMap<String,String>();
        address_map.put("attention", attention);
        address_map.put("address", address);
        address_map.put("street2", street2);
        address_map.put("state_code", state_code);
        address_map.put("city", city);
        address_map.put("state", state);
        address_map.put("zip", zip);
        address_map.put("country", country);
        address_map.put("fax", fax);
        address_map.put("phone", phone);
    }
}
