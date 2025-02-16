package org.sample.automation.stepDefinition;


import io.cucumber.datatable.DataTable;
import io.cucumber.datatable.TableTransformer;
import io.cucumber.java.AfterAll;
import io.cucumber.java.DataTableType;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.plugin.event.Result;
import org.sample.automation.model.User;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MyStepdefs {


    @ParameterType(".*")
    public int paramNumber(String param) {
        return Integer.parseInt(param.split("parameter")[1]);
    }

    @Given("There is a step with one parameter {paramNumber}")
    public void thereIsAStepWithOneParameterParameter(int arg0) {
        System.out.println(arg0);
    }

    @When("There is a step with datatable having only one column without header")
    public void thereIsAStepWithDatatableHavingOnlyOneColumnWithoutHeader(DataTable dataTable) {
        System.out.println("Give : There is a step with datatable having only one column without header");
        List<String> parameters = dataTable.asList();
        parameters.forEach(parameter -> System.out.println(parameter));
    }

    @When("There is a step with datatable having only one column with header")
    public void thereIsAStepWithDatatableHavingOnlyOneColumnWithHeader(DataTable dataTable) {
        List<List<String>> dataValues = dataTable.asLists();
        dataValues.forEach(dataValue ->  { System.out.println(".");
                dataValue.forEach(value -> System.out.print("\t" + value));});

        List<String> dataValues2 = dataTable.asList();
        dataValues2.forEach(dataValue ->  System.out.println("\n" +dataValue));



    }

    @When("There is a step with datatable having multiple column with header")
    public void thereIsAStepWithDatatableHavingMultipleColumnWithHeader(DataTable dataTable) {
        List<Map<String, String>> dataValues3 = dataTable.transpose().asMaps();
        System.out.println(dataValues3);
        dataValues3.forEach(dataValue ->
                {
               // System.out.println(dataValue.get("header_column1"));
               //     System.out.print(dataValue.get("header_column2"));


                }

                );


        System.out.println("::");
        Map<String, String> dataValues4 = dataTable.asMap();
        System.out.println(dataValues4);
       // System.out.println(dataValues4.get("header_column1"));


    }

    @When("There is a step with Doc strings")
    public void thereIsAStepWithDocStrings(String arg0) {
        System.out.println(arg0);
    }

    @When("There is a step with parameter type datatable having only one column with header")
    public void thereIsAStepWithParameterTypeDatatableHavingOnlyOneColumnWithHeader(DataTable dataTable) {
    }

    @When("There is a step with parameter type datatable having multiple column with header")
    public void thereIsAStepWithParameterTypeDatatableHavingMultipleColumnWithHeader(User user) {
        System.out.println(user.getName());
    }

    @DataTableType
    public User UserTableTransformer(DataTable table) throws Throwable {
        User user = new User();


         table.entries().get(0).keySet().forEach(key -> {
            // user.setName(key);
         });

//        System.out.println(dataMap);
        table.entries().stream().forEach(entry -> {
            entry.get(0);
            entry.get(1);


        });
        table.cells().stream().forEach(cell -> {
           // System.out.println(cell.get(0));
           // System.out.println(cell.get(1));
        });

        user.setName("test");
        return user;
    }


    @AfterAll
    public static void afterAll() {


    }
}
