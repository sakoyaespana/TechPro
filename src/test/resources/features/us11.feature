
Feature:

  Background:
            Given Doc goes to the Medunna web page
            And Doc clicks user icon
            And Doc clicks Sign in option
            And Doc sign in home page
            And Doc navigates to home page
            And Doc clicks MY PAGES dropdown menu
            And Doc clicks My Appointments option
            And Doc clicks Edit button to update patients info
           Then Doc navigate to the appointment update page


      @US11-TC1
      Scenario Outline: Doc verifies patient's info
              Given  Doc verifies patient is present
                And  Doc verifies id "<ID>"
                And  Doc verifies startDateTime "<StartDateTime>"
                And  Doc verifies EndDateTime "<EndDateTime>"
                And  Doc verifies Status "<Status>"
                And  Doc verifies Physician "<Physician>"
    Examples:
    |ID    |StartDateTime   |  EndDateTime   |Status |Physician                               |
    |300963|2022-11-30T01:00|2022-11-30T02:00|PENDING|301005:Dr.Saadet Yaman:INTERNAL_MEDICINE|


      @US11-TC2
      Scenario:  Create or Edit an Appointment
        Given Doc changes pending status to completed status
          And Doc fills in required fields
          |Anamnesis|abc|
          |Treatment|def|
          |Diagnosis|klm|
        And Doc clicks save button
       Then Doc Verifies "The Appointment is updated" popup

  @US11-TC3
  Scenario:
    Given Doc changes pending status to completed status
    And Doc fills in required fields
        |Treatment|def|
        |Diagnosis|klm|
#       |Prescription|pres|
#       |Description|desc|
      But Doc can NOT update the appointment












