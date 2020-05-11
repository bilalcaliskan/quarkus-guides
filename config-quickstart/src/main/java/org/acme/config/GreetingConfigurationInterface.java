package org.acme.config;

import io.quarkus.arc.config.ConfigProperties;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import java.util.Optional;

/*
Alternative style provided by Quarkus. When using @ConfigProperties on a class or an interface, if the value of one of
its fields is not provided, the application startup will fail and a javax.enterprise.inject.spi.DeploymentException
indicating the missing value information will be thrown. This does not apply to Optional fields and fields with a default
value.
*/
@ConfigProperties(prefix = "greeting")
public interface GreetingConfigurationInterface {

    /*
    The @ConfigProperty annotation is needed because the name of the configuration property that the method corresponds
    to doesn’t follow the getter method naming conventions.
    */
    @ConfigProperty(name = "message")
    String message();

    // In this case since name was not set, the corresponding property will be greeting.suffix.
    @ConfigProperty(defaultValue = "!")
    String getSuffix();

    /*
    It is unnecessary to specify the @ConfigProperty annotation because the method name follows the getter method naming
    conventions (greeting.name being the corresponding property) and no default value is needed.
    */
    Optional<String> getName();

}