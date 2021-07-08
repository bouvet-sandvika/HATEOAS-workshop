package no.bouvet.hateoasserver.excercises;

import no.bouvet.hateoasserver.domain.EmployeeModel;

public class RepresentationModels {


    /*
    *
    * */
    public EmployeeModel myFirstRepresentationModel() {
        EmployeeModel employee = new EmployeeModel();
        employee.setFirstName("Ola");
        employee.setLastName("Nordmann");
        return employee;
    }
}
