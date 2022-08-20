package com.cpc.dp.builder;

import java.time.LocalDate;
import java.time.Period;

//The concrete builder for UserWebDTO
//TODO implement builder
public class UserWebDTOBuilder implements UserDTOBuilder {

    String name;
    String address;
    String age;

    UserWebDTO dto;

    @Override
    public UserDTOBuilder withFirstName(String fname) {
        this.name = fname;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lname) {
        this.name = name + " " + lname;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthday(LocalDate date) {
        Period period = Period.between(date, LocalDate.now());
        this.age = String.valueOf(period.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address.getHouseNumber() + ", " + address.getStreet()
                + "\n" + address.getCity()
                + "\n" + address.getState() + ", " + address.getZipcode();

        return this;
    }

    @Override
    public UserDTO build() {
        dto = new UserWebDTO(name, address, age);
        return dto;
    }

    @Override
    public UserDTO getUserDTO() {
        return dto;
    }
}
