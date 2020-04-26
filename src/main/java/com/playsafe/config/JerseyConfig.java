package com.playsafe.config;

import com.playsafe.controller.ConversionResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
import sun.reflect.Reflection;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/")
public final class JerseyConfig extends ResourceConfig {


        private final void registerEndpoints() {
            this.property("jersey.config.servlet.filter.forwardOn404", true);
            this.register(ConversionResource.class);
        }

        public JerseyConfig() {
            this.registerEndpoints();
        }

}
