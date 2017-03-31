package com.zuehlke.resources;

import com.zuehlke.model.Customer;
import com.zuehlke.services.CustomerService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.net.URI;

/**
 * Created by yapi on 19.03.17.
 */

@Api
@Component
@Path("/customers")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CustomerResource {

    @Autowired
    private CustomerService customerService;
    @Context
    private UriInfo uriInfo;

    @GET
    public Iterable<Customer> getAllCustomer(){
        return customerService.getAllCustomers();
    }

    @POST
    public Response createCustomer(Customer customer){
        Customer created = customerService.createCustomer(customer);
        return Response
                .created(getUri(created.getId()))
                .entity(created)
                .build();
    }


    private URI getUri(Long id) {
        String newId = String.valueOf(id);
        return uriInfo.getAbsolutePathBuilder().path(newId).build();
    }

}
