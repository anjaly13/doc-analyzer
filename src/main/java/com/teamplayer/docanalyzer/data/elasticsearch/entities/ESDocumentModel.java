package com.teamplayer.docanalyzer.data.elasticsearch.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.teamplayer.docanalyzer.data.dto.Pages;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;
import java.util.List;

@TypeAlias(value = "Documents")
@Document(indexName = "document")
@Data
@JsonIgnoreType
public class ESDocumentModel {

    @Id
    private String id;

    private String docName;

    @Field(type = FieldType.Nested)
    private List<Pages> docContent;

    @Field(type = FieldType.Date,format = DateFormat.date_optional_time)
    private Date createdAt;

    private boolean isDeleted;

    private boolean favourite;

}
