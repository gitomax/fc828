package com.fc828.club.model;

import lombok.Data;

@Data
public class AddressDTO {

    private String unitNumber;
    private String buildingNumber;
    private String streetName;
    private String city;
    private String province;
    private String postalCode;
    private String country;

    private String state;
    private String zipCode;
    private String region;

    private String streetDirection;

}
