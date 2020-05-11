package org.acme.config;

import io.quarkus.arc.config.ConfigProperties;

import java.util.List;
import java.util.Optional;

/*
When using a regular class annotated with @ConfigProperties the class doesn’t necessarily have to declare getters and
setters. Having simple public non-final fields is valid as well.
*/
@ConfigProperties(prefix = "greeting")
public class GreetingConfigurationPublicNested {

    public String message;
    public String suffix = "!";
    public Optional<String> name;
    /*
    Furthermore the configuration classes support nested object configuration. Suppose there was a need to have an extra
    layer of greeting configuration named hidden that would contain a few fields. The name of the field (not the class name)
    will determine the name of the properties that are bound to the object.
    This could be achieved like so:
    */
    public HiddenConfig hidden;

    public static class HiddenConfig {
        // greeting.hidden.prizeAmount=10
        public Integer prizeAmount;
        // greeting.hidden.recipients=Jane,John
        public List<String> recipients;
    }

}