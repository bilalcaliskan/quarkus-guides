package org.acme.config;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/greeting")
public class GreetingResource {

    @Inject
    GreetingConfigurationPrivate greetingConfiguration;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return greetingConfiguration.getMessage() + " " + greetingConfiguration.getName().orElse("world")
                + greetingConfiguration.getSuffix();
    }

}