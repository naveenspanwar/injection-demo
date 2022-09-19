package com.knoldus.beans;

import javax.enterprise.context.RequestScoped;

import static com.knoldus.res.ResponseStub.CONSTRUCTOR_RESPONSE;

@RequestScoped
public class ConstructorCDI {

    public String getMsg() {
        return CONSTRUCTOR_RESPONSE;
    }
}
