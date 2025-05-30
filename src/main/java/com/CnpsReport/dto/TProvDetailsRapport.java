package com.CnpsReport.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TProvDetailsRapport {

    private String ref;
    private String title;
    private String provisionOpening;
    private String provisionClosing;
    private String decrease;
    private String increase;
    private Integer grayRow;
}
