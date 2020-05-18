package com.apap.backend_tu.rest;

import com.apap.backend_tu.model.LowonganModel;
import com.apap.backend_tu.model.RestUserModel;
import com.apap.backend_tu.service.LowonganService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/perpustakaan")
@CrossOrigin(origins = "*")
public class PerpustakaanWebService {

    @GetMapping(value = "perpustakaan/viewall")
    public List<RestUserModel> perpustakaanViewAll() {
        final String uri = "http://si-perpus-b6.herokuapp.com/perpustakaan/user/viewall";
        RestTemplate restTemplate = new RestTemplate();
        List<RestUserModel> result = restTemplate.getForObject(uri, List.class);
        return result;
    }


}