package com.teamplayer.docanalyzer.api;

import com.teamplayer.docanalyzer.data.dto.DocInput;
import com.teamplayer.docanalyzer.services.service.BasicServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doc-analyzer")
public class BasicController {

    @Autowired
    private BasicServices basicServices;

    @PostMapping
    public ResponseEntity uploadDoc(){
        return null;
    }

    @PostMapping("/put-data")
    public boolean addData(@RequestBody DocInput docInput){
        return basicServices.putDocDataInES(docInput);
    }

    @GetMapping
    public ResponseEntity searchData (){
        return null;
    }
}
