package com.poslovna.poslovna.controller;

import com.poslovna.poslovna.model.DnevnoStanje;
import com.poslovna.poslovna.service.DnevnoStanjeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/dnevnoStanje")
public class DnevnoStanjeController {

    @Autowired
    private DnevnoStanjeService dnevnoStanjeService;
}
