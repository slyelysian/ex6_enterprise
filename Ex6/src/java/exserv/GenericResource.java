/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exserv;

import java.io.StringWriter;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXB;

/**
 * REST Web Service
 *
 * @author kantanat
 */
@Path("generic")
public class GenericResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

    /**
     * Retrieves representation of an instance of exserv.GenericResource
     * @return an instance of java.lang.String
     */
    @GET
    @Path("{radian}")
    @Produces("application/xml")
    public String getXml(@PathParam("radian") String rad) {
        //TODO return proper representation object
        double r,area,circum; 
        double p = 3.14; 
        r=Double.parseDouble(rad);
        area = p * Math.pow(r, 2);
        circum = p * (r*2);
        
        
        StringWriter writer = new StringWriter();
        JAXB.marshal("area : " + area + "   |   " + "circumference : " + circum , writer);
        return writer.toString();
//return ans;
        //throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/xml")
    public void putXml(String content) {
    }
}
