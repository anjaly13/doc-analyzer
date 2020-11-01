package com.teamplayer.docanalyzer.services.docdataprocessor;

import com.teamplayer.docanalyzer.data.dto.DocInput;
import com.teamplayer.docanalyzer.data.elasticsearch.entities.ESDocumentModel;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

@Component
public class PrepareDocData {

    public ESDocumentModel prepareDataForDocSave (DocInput docInput){
        ESDocumentModel esDocumentModel = new ESDocumentModel();
        esDocumentModel.setId(UUID.randomUUID().toString());
        esDocumentModel.setDocName(docInput.getDocName());
        esDocumentModel.setDocContent(docInput.getDocContent());
        esDocumentModel.setCreatedAt(new Date());
        esDocumentModel.setDeleted(false);
        esDocumentModel.setFavourite(false);
        return esDocumentModel;
    }
}
