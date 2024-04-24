package jdbc;


import jdbc.config.DatabaseConfiguration;
import jdbc.entity.Person;
import jdbc.repository.PersonRepositoryUsingCallableStatement;
import jdbc.repository.PersonRepositoryUsingPreparedStatement;
import jdbc.repository.PersonRepositoryUsingStatements;

public class Main {

    public static void main(String[] args) {
        PersonRepositoryUsingStatements personRepositoryUsingStmt = new PersonRepositoryUsingStatements();
        personRepositoryUsingStmt.createTable();
        personRepositoryUsingStmt.addPerson();
        personRepositoryUsingStmt.displayPerson();

        PersonRepositoryUsingPreparedStatement personRepositoryUsingPreparedStmt = new PersonRepositoryUsingPreparedStatement();
        Person person = personRepositoryUsingPreparedStmt.getPersonById(1);
        System.out.println("Name = " + person.getName());

        personRepositoryUsingPreparedStmt.updatePersonName("Silvia", 1);
        Person updatedPerson = personRepositoryUsingPreparedStmt.getPersonById(1);
        System.out.println("Name = " + updatedPerson.getName());

        personRepositoryUsingPreparedStmt.insertPerson("Alexandra", 26);
        Person insertedPerson = personRepositoryUsingPreparedStmt.getPersonById(2);
        System.out.println("Name = " + insertedPerson.getName());

        PersonRepositoryUsingCallableStatement personRepositoryUsingCallableStmt = new PersonRepositoryUsingCallableStatement();
        personRepositoryUsingCallableStmt.insertPerson(new Person("Andreea", 30.0));

        DatabaseConfiguration.closeDatabaseConnection();
    }
}
