package com.teamplayer.docanalyzer.data.elasticsearch.repository;

import com.teamplayer.docanalyzer.data.elasticsearch.entities.ESDocumentModel;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ElasticSearchRepository extends ElasticsearchRepository<ESDocumentModel,String> {
}
