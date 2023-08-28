package com.gp.currencyexchange.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;



@Data
@ToString
@AllArgsConstructor
public class CompareDto {
    private String base;
    private String firstTarget;
    private String secondTarget;
    private String ConversionRate1;
    private String ConversionRate2;
    private String amount;
}
