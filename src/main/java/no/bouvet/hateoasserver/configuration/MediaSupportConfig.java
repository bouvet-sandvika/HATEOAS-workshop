package no.bouvet.hateoasserver.configuration;

import static org.springframework.hateoas.config.EnableHypermediaSupport.HypermediaType.HAL;

import org.springframework.context.annotation.Configuration;
import org.springframework.hateoas.config.EnableHypermediaSupport;

@EnableHypermediaSupport(type = HAL)
@Configuration
public class MediaSupportConfig {
}
