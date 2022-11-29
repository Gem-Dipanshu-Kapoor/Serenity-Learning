Feature: Demoqa.com_Forms
  @run
  Scenario Outline: User fills the form
    Given launch demoqa.com
    Then User navigates to forms page
    Then User fills in data eg '<fname>','<lname>','<mail>','<ph>','<gender>'
    Examples: |fname|lname|mail|ph|gender|
              |abc  |def  |abcdef@gmail.com|987|1|
              |abc  |def  |abc             |987|2|