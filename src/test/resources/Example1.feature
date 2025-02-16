#language: en
@allure.label.epic=Main_Functionality>Minor_functionality>Lower_functionality
@allure.label.feature=Second_Lower_Level>Second_very_low_level
Feature: Practical of cucumber keywords

  Rule: DataTable functionality for single value

  Scenario: Verify different types of data tables of cucumber - single field
    Given There is a step with one parameter parameter1
    When There is a step with datatable having only one column without header
    | onecolumn_withoutHeader |

  Rule: DataTable functionality for multi value

    Scenario: Verify different types of data tables of cucumber - multi row but single column
      Given There is a step with one parameter parameter1
      When There is a step with datatable having only one column with header
        | header_column           |
        | onecolumn_withHeader1 |
        | onecolumn_withHeader2 |

    Scenario: Verify different types of data tables of cucumber - multi column multi row
      Given There is a step with one parameter parameter1
      When There is a step with datatable having multiple column with header
        | header_column1           | header_column2           |
        | multicolumn_withHeader11 | multicolumn_withHeader12 |
        | multicolumn_withHeader21 | multicolumn_withHeader22 |


  Rule: Doc Strings functionality for single value
    Scenario: Verify doc strings of cucumber
      Given There is a step with one parameter parameter1
      When There is a step with Doc strings
      """
        This is a step having doc string. Line #1
        Line #2
        Line #3
        Line#4

      """

  Rule: DataTable functionality for parameter type

    Scenario: Verify different types of data tables of cucumber - parameter type - multi row but single column
      Given There is a step with one parameter parameter1
      When There is a step with parameter type datatable having only one column with header
        | header_column         |
        | onecolumn_withHeader1 |
        | onecolumn_withHeader2 |

@Local
    Scenario: Verify different types of data tables of cucumber - parameter type - multi column multi row
      Given There is a step with one parameter parameter1
      When There is a step with parameter type datatable having multiple column with header
        | field           | value           |
        | name            | John K          |
        | id              | 12345           |
        | subjects        | [126,132]              |
