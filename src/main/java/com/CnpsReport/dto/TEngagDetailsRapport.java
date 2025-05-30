package com.CnpsReport.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TEngagDetailsRapport {

    private String section;
    private String amountOpening;
    private String amountClosing;
    private String decrease;
    private String increase;
    private Integer grayRow;
}
