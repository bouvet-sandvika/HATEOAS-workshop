package no.bouvet.hateoasserver.domain;

import org.springframework.hateoas.RepresentationModel;

public class EmployeeModel extends RepresentationModel<EmployeeModel> {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
