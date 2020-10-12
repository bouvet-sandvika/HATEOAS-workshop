package no.bouvet.hateoasserver;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.DEFINED_PORT;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.IanaLinkRelations;
import org.springframework.hateoas.Link;
import org.springframework.web.client.RestTemplate;

@AutoConfigureWebTestClient
@SpringBootTest(classes = HateoasServerApplication.class, webEnvironment = DEFINED_PORT)
class HateoasServerApplicationTests {

	@Test
	void test() {
		RestTemplate client = new RestTemplate();
		CollectionModel model = client.getForEntity("http://localhost:8080/api/mountains", CollectionModel.class).getBody();
		assertThat(model.getRequiredLink(IanaLinkRelations.SELF)).isEqualTo(Link.of("http://localhost/api/mountains"));
		assertThat(model.getContent()).hasSize(2);
	}

}
