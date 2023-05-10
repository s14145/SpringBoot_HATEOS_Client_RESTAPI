package com.hateoasclient.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientAPIResponse {

    private Long accountNumber;

    private BigDecimal amount;

    private double rateOfInterest;

    private AccountType accountType;

    private AccountStatus accountStatus;

    private Links links;
}
