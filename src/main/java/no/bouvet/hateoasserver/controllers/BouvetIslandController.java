package no.bouvet.hateoasserver.controllers;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.Arrays;
import java.util.Collection;

import no.bouvet.hateoasserver.domain.Mountain;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BouvetIslandController {

    @GetMapping("/api/mountains")
    public CollectionModel<Mountain> getMountains() {
        Mountain mountain1 = new Mountain();
        mountain1.setHeight(780);
        mountain1.setName("Olavtoppen");

        Mountain mountain2 = new Mountain();
        mountain2.setHeight(665);
        mountain2.setName("Skoddenuten");

        Collection<Mountain> mountains = Arrays.asList(mountain1, mountain2);
        CollectionModel<Mountain> mountainCollectionModel = CollectionModel.of(mountains);
        mountainCollectionModel.add(linkTo(methodOn(BouvetIslandController.class).getMountains()).withSelfRel());
        return mountainCollectionModel;
    }
}
