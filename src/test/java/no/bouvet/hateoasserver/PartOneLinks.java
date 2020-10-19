package no.bouvet.hateoasserver;

import static org.assertj.core.api.Assertions.assertThat;

import no.bouvet.hateoasserver.excercises.Links;
import org.junit.jupiter.api.Test;
import org.springframework.hateoas.IanaLinkRelations;
import org.springframework.hateoas.Link;

public class PartOneLinks {
    private final Links links = new Links();


    @Test
    public void exerciseOne() {
        Link link = links.myFirstLink();

        assertThat(link.getHref()).isEqualTo("/my-first-link");
    }

    @Test
    public void exerciseTwo() {
        Link link = links.linkWithRelation();

        assertThat(link.getRel()).isNotEqualTo(IanaLinkRelations.SELF);
    }

    @Test
    public void exerciseThree() {
        Link link = links.linkWithTemplatedURI();
        assertThat(link.isTemplated());
        assertThat(link.getVariableNames()).contains("variableOne", "variableTwo");
    }

    @Test
    public void exerciseFour() {
        Link link = links.expandValuesOnTemplatedURI();
        assertThat(link.getHref()).contains("420", "69");
    }
}
