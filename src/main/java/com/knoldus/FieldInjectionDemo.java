package com.knoldus;

import com.knoldus.beans.FieldCDI;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/fields")
public class FieldInjectionDemo {

    @Inject
    FieldCDI fieldCDI;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMessage() {
        return fieldCDI.getMsg();
    }
}