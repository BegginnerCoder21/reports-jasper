package com.CnpsReport.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TImmoDetailsRapport {

    private String ref;
    private String title;
    private String periodStartValue;
    private String periodEndValue;
    private String increaseAcquisition;
    private String increaseMore;
    private String increaseTransfer;
    private String divestmentDimunition;
    private String dimunitionTransfer;
    private Integer grayRow;
}
