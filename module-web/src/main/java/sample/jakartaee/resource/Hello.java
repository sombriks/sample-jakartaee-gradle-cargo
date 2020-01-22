package sample.jakartaee.resource;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import sample.jakartaee.service.Thing;

@Stateless
@Path("/hello")
public class Hello {

    @EJB
    private Thing thing;

    @GET
    public String say() {
        return "Hello" + thing.now() + "!";
    }

}