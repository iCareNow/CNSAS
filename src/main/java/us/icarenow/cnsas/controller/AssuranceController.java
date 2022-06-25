package us.icarenow.cnsas.controller;

import org.springframework.web.bind.annotation.*;
import us.icarenow.cnsas.model.AssuranceStatus;
import us.icarenow.cnsas.model.dto.AssuranceResponse;

@RestController
@RequestMapping("/insurances")
public class AssuranceController {

    @GetMapping("/{cnp}")
    @ResponseBody
    public AssuranceResponse getAssuranceStatus(@PathVariable String cnp) {
        return new AssuranceResponse(AssuranceStatus.byCNP(cnp).getStatus());
    }
}

