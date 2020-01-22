package sample.jakartaee.resource;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Stateless
@Path("/hello")
public class Hello {

    @GET 
    public String say(){
        return "Hello!";
    }

}