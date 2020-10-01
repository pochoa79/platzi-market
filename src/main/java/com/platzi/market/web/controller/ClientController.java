package com.platzi.market.web.controller;


import com.platzi.market.domain.Client;
import com.platzi.market.domain.service.ClientService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/all")
    @ApiOperation("Get all supermaket clients")
    @ApiResponse(code = 200, message = "OK")
    public ResponseEntity<List<Client>> getAll() {
        return new ResponseEntity<>(clientService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    @ApiOperation("Save Client")
    @ApiResponse(code = 200, message = "OK")
    public ResponseEntity<Client> save(
            @ApiParam(value = "Object type client", required = true)
            @RequestBody Client client) {
        return new ResponseEntity<>(clientService.save(client), HttpStatus.OK);
    }

}
