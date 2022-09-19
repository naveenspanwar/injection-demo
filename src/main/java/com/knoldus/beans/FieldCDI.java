package com.knoldus.beans;

import javax.enterprise.context.RequestScoped;

import static com.knoldus.res.ResponseStub.Field_RESPONSE;

@RequestScoped
public class FieldCDI {

    public String getMsg() {
        return Field_RESPONSE;
    }
}
