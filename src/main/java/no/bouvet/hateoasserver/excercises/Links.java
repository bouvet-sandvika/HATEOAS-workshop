package no.bouvet.hateoasserver.excercises;

import java.util.Map;

import org.springframework.hateoas.Link;

public class Links {

    /*
    * Make the function myFirstLink return a Link with a href: /my-first-link
    * */

    public Link myFirstLink() {

        return null;
    }

    /*
    * Return a Link with a relation other than standard self relation
    * */

    public Link linkWithRelation() {
        return null;
    }

    /*
    * Return a Link with a templated URI containing variableOne and variableTwo
    * */
    public Link linkWithTemplatedURI() {
        return null;
    }


    /*
    * Expand values on link created with linkWithTemplatedURI function.
    *
    * variableOne = 420
    * variableTwo = 69
    * */
    public Link expandValuesOnTemplatedURI() {
        return null;
    }
}
