package com.CnpsReport.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BilanPDetailsRapport {

    private String ref;
    private String title;
    private String exerciseN;
    private String exerciseN1;
    private Integer grayRow;
}
