package com.paymentchain.customer.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;



@Data
@Schema(description = "Una descripción del modelo")
public class CustomerResponse {

    @Schema(name = "Customer Id", required = false, example = "1")
    private long customerId;

    @Schema(name = "Name", required = false, example = "Jorge")
    private String name;

    @Schema(name = "Code", required = false, example = "777")
    private String code;

    @Schema(name = "Iban number", required = false, example = "22091")
    private String iban;

    @Schema(name = "Names", required = false, example = "Jorge Antonio")
    private String names;

    @Schema(name = "Surname", required = false, example = "George")
    private String surname;

    @Schema(name = "Phone number", required = false, example = "56645674")
    private String phoneNumber;

    @Schema(name = "Address", required = false, example = "Prados de Sta Clara")
    private String address;

}
