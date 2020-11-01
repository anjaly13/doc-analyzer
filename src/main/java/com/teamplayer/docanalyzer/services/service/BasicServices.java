package com.teamplayer.docanalyzer.services.service;

import com.teamplayer.docanalyzer.data.dto.DocInput;
import com.teamplayer.docanalyzer.data.elasticsearch.entities.ESDocumentModel;
import com.teamplayer.docanalyzer.data.elasticsearch.repository.ElasticSearchRepository;
import com.teamplayer.docanalyzer.services.docdataprocessor.PrepareDocData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasicServices {

    @Autowired
    private PrepareDocData prepareDocData;

    @Autowired
    private ElasticSearchRepository elasticSearchRepository;

    public boolean putDocDataInES (DocInput docInput){
        elasticSearchRepository.save(prepareDocData.prepareDataForDocSave(docInput));
        return true;
    }
}
