package no.bouvet.hateoasserver;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.DEFINED_PORT;
import static org.springframework.hateoas.MediaTypes.HAL_JSON;

import no.bouvet.hateoasserver.domain.Mountain;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.IanaLinkRelations;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.core.TypeReferences;
import org.springframework.test.web.reactive.server.WebTestClient;

@AutoConfigureWebTestClient
@SpringBootTest(classes = HateoasServerApplication.class, webEnvironment = DEFINED_PORT)
class HateoasServerApplicationTests {

	@Autowired
	private WebTestClient client;

	@Test
	void test() {
		client.get().uri("http://localhost:8080/api/mountains").accept(HAL_JSON)
				.exchange()
				.expectStatus().isOk()
				.expectBody(new TypeReferences.CollectionModelType<EntityModel<Mountain>>() {})
				.consumeWith(result ->  {
					CollectionModel<EntityModel<Mountain>> model = result.getResponseBody();

					assertThat(model.getRequiredLink(IanaLinkRelations.SELF)).isEqualTo(Link.of("http://localhost/api/mountains"));
					assertThat(model.getContent()).hasSize(2);
				});
	}

}
