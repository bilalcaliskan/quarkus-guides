package org.acme.lifecycle;

import io.quarkus.runtime.Startup;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Startup
public class EagerAppBean {

    private final String name;

    EagerAppBean() {
        this.name = "generator.createName()";
    }

    public String getName() {
        return name;
    }
}
