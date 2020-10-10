package no.bouvet.hateoasserver.controllers;

import java.util.Arrays;
import java.util.Collection;

import no.bouvet.hateoasserver.domain.Mountain;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BouvetIslandController {

    @GetMapping("/api/mountains")
    public CollectionModel<EntityModel<Mountain>> getMountains() {
        Mountain mountain1 = new Mountain();
        mountain1.setHeight(780);
        mountain1.setName("Olavtoppen");

        Mountain mountain2 = new Mountain();
        mountain2.setHeight(665);
        mountain2.setName("Skoddenuten");

        Collection<EntityModel<Mountain>> mountains = Arrays.asList(EntityModel.of(mountain1), EntityModel.of(mountain2));
        CollectionModel<EntityModel<Mountain>> mountainCollectionModel = CollectionModel.of(mountains);
        return mountainCollectionModel;
    }
}
