package com.rawatdivyanshu.petclinic.Controllers;

import com.rawatdivyanshu.petclinic.Services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping({"/owners"})
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String getOwnersList(Model model) {

        model.addAttribute("owners",ownerService.findAll());

        return "owners/index";
    }
}
