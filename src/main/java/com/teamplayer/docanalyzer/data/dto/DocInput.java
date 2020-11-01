package com.teamplayer.docanalyzer.data.dto;

import lombok.Data;

import java.util.List;

@Data
public class DocInput {

    private String docName;

    private List<Pages> docContent;
}
