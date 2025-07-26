package com.Portify.BackPortify.Controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Conceitos para lembrar:
//@RequestBody é a notação utilizada para se referir ao corpo da requisição.
//ResponseEntity -> É um tipo que representa toda a response http (status, corpo, header)


@RestController
@RequestMapping("/professional")
public class ProfessionalController {
    @PostMapping
    public void teste(){

    }
}
