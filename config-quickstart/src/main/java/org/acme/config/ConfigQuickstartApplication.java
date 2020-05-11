package org.acme.config;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class ConfigQuickstartApplication {

    public static void main(String ... args) {
        Quarkus.run(args);
    }

}