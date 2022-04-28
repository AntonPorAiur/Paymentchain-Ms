package com.paymentchain.customer.common;

import com.paymentchain.customer.dto.CustomerResponse;
import com.paymentchain.customer.entities.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerResponseMapper {

    // Si los nombres de los campos no coinciden se tienen que especificar de manera manual

    @Mappings({
            @Mapping(source = "id", target = "customerId"),
            @Mapping(source = "phone", target = "phoneNumber")
    })
    CustomerResponse CustomerToCustomerResponse(Customer source);

    List<CustomerResponse> CustomerLstToCustomerResponseLst(List<Customer> source);

}
