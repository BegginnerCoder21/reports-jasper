package com.CnpsReport.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TEffectifDetailsRapport {

    private String category;
    private String workforce;
    private String totalPayroll;
    private Integer grayRow;
}
