package com.CnpsReport.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TCotisDetailsRapport {

    private String ventilationLabel;
    private String ventilationYear;
    private String movementRecovery;
    private String movementBet;
    private String movementIncome;
    private String movementTotal;
    private String cancellation;
    private String admission;
    private String discount;
    private String total;
    private String amount;
    private Integer grayRow;
}
