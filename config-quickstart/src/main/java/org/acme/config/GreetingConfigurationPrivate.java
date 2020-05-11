package org.acme.config;

import io.quarkus.arc.config.ConfigProperties;
import java.util.Optional;

/*
prefix is optional. If not set then the prefix to be used will be determined by the class name. In this case it would
still be greeting (since the Configuration suffix is removed). If the class were named GreetingExtraConfiguration then
the resulting default prefix would be greeting-extra. Camel cased letters will be replaced with "-".
 */
@ConfigProperties(prefix = "greeting")
public class GreetingConfigurationPrivate {

    private String message;
    private String suffix = "!";
    private Optional<String> name;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

}