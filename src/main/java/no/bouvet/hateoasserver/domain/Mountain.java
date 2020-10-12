package no.bouvet.hateoasserver.domain;

import org.springframework.hateoas.RepresentationModel;

public class Mountain extends RepresentationModel<Mountain> {
    private String name;
    private Integer height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}
