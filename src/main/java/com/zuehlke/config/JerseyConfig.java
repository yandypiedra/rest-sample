package com.zuehlke.config;

import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.jaxrs.listing.ApiListingResource;
import com.zuehlke.resources.CustomerResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.wadl.internal.WadlResource;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

/**
 * Created by yapi on 19.03.17.
 */

@Component
@ApplicationPath("/rest-sample")
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        registerResources();
        configureSwagger();
    }

    private void configureSwagger() {
        register(ApiListingResource.class);
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0.2");
        beanConfig.setSchemes(new String[]{"http"});
        beanConfig.setHost("localhost:8080");
        beanConfig.setBasePath("/rest-sample");
        beanConfig.setResourcePackage("com.zuehlke.resources");
        beanConfig.setPrettyPrint(true);
        beanConfig.setScan(true);
    }


    private void registerResources() {
        register(WadlResource.class);
        register(CustomerResource.class);
//        packages("com.zuehlke.resources");
    }
}
