package com.knoldus;

import com.knoldus.beans.ConstructorCDI;
import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * This class demonstrate the injection using constructor
 */

@ApplicationScoped
@Path("/constructor")
public class ConstructorInjectionDemo {

    ConstructorCDI constructorCDI;

    public ConstructorInjectionDemo(ConstructorCDI constructorCDI) {
        this.constructorCDI = constructorCDI;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMessage() {
        return constructorCDI.getMsg();
    }
}