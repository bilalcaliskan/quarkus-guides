package org.acme.lifecycle;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

@ApplicationScoped
public class AppLifecycleBean {

    private static final Logger LOGGER = Logger.getLogger("ListenerBean");

    @Inject
    EagerAppBean eagerAppBean;

    void onStart(@Observes StartupEvent startupEvent) {
        LOGGER.info("Application is starting..." + eagerAppBean.getName());
    }

    void onStop(@Observes ShutdownEvent shutdownEvent) {
        LOGGER.info("The application is stopping..." + eagerAppBean.getName());
    }

}