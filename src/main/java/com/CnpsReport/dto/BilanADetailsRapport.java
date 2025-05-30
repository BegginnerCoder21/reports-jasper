package com.CnpsReport.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BilanADetailsRapport {

    private String ref;
    private String title;
    private String brut;
    private String amortProv;
    private String net;
    private String exerciseNet;
    private Integer grayRow;
}
