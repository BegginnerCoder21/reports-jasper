package com.CnpsReport.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InfoCnps {

    private String companyName;
    private String acronym;
    private String address;
    private String taxIdentification;
    private String closingDate;
    private String duration;
    private String tableHeader;
    private String title;
    private String subTitle;
}
