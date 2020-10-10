package no.bouvet.hateoasserver.controllers;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import org.springframework.hateoas.RepresentationModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/api")
    public RepresentationModel getApi() {
        RepresentationModel representationModel = new RepresentationModel();
        representationModel.add(linkTo(methodOn(BouvetIslandController.class).getMountains()).withRel("mountains"));
        return representationModel;
    }
}
