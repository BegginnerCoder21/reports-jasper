package com.CnpsReport.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TDettesDetailsRapport {

    private String ref;
    private String title;
    private String amountBilan;
    private String maturityPlus1;
    private String maturityMinus1;
    private String maturityPlus5;
    private Integer grayRow;
}
