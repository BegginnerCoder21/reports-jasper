package com.CnpsReport.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CRDetailsRapport {

    private String ref;
    private String title;
    private String managF;
    private String managA;
    private String managV;
    private String managM;
    private String managS;
    private String managG;
    private String managI;
    private String managE;
    private String managT;
    private String totalN;
    private String totalN1;
    private Integer grayRow;
}
