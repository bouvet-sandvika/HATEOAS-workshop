package no.bouvet.hateoasserver;

import static org.assertj.core.api.Assertions.assertThat;

import no.bouvet.hateoasserver.domain.EmployeeModel;
import no.bouvet.hateoasserver.excercises.RepresentationModels;
import org.junit.jupiter.api.Test;
import org.springframework.hateoas.mediatype.hal.Jackson2HalModule;

public class PartTwoRepresentationModels {

    private final RepresentationModels representationModel = new RepresentationModels();

    @Test
    public void exerciseOne() {
        EmployeeModel employee = representationModel.myFirstRepresentationModel();
    }
}
