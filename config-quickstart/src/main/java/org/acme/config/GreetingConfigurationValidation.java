package org.acme.config;

import io.quarkus.arc.config.ConfigProperties;
import javax.validation.constraints.Size;

/*
Classes annotated with @ConfigProperties can be annotated with Bean Validation annotations.
If the validation fails with the given configuration, the application will fail to start and indicate the corresponding
validation errors in the log.
In the case of an interface being annotated with @ConfigProperties, the interface is allowed to extend other interfaces
and methods from the entire interface hierarchy are used to bind properties.
*/
@ConfigProperties(prefix = "greeting")
public class GreetingConfigurationValidation {

    @Size(min = 20)
    public String message;
    public String suffix = "!";

}