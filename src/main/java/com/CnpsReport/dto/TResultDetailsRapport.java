package com.CnpsReport.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TResultDetailsRapport {

    private String indication;
    private String n;
    private String n1;
    private String n2;
    private String n3;
    private String n4;
    private Integer grayRow;
}
