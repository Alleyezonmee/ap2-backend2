package com.soulinc.ap2backend.model;

public class College2 {
    private String college_id;
    private String college_name;
    private AddressDTO addressDTO;

    public String getCollege_id() {
        return college_id;
    }

    public void setCollege_id(String college_id) {
        this.college_id = college_id;
    }

    public String getCollege_name() {
        return college_name;
    }

    public void setCollege_name(String college_name) {
        this.college_name = college_name;
    }

    public AddressDTO getAddressDTO() {
        return addressDTO;
    }

    public void setAddressDTO(AddressDTO addressDTO) {
        this.addressDTO = addressDTO;
    }

    @Override
    public String toString() {
        return "College2{" +
                "college_id='" + college_id + '\'' +
                ", college_name='" + college_name + '\'' +
                ", address=" + addressDTO +
                '}';
    }
}
