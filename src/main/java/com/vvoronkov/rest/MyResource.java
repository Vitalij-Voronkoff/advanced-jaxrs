package com.vvoronkov.rest;

import javax.inject.Singleton;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Date;

@Path("{pathParam}/test")
//@Singleton
public class MyResource {

    private int count;
    @PathParam("pathParam")
    private String pathParamExample;
    @QueryParam("queryParam")
    private String queryParamExample;

//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String testMethod() {
//        count++;
//        //return "It works! This method called " + count + " times";
//        return "Path param used " + pathParamExample + " and query param used " + queryParamExample;
//    }

//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public Date testMethod() {
//        return new Date();
//    }

    @GET
    @Produces("text/shortdate")
    public Date testMethod() {
        return new Date();
    }
}
