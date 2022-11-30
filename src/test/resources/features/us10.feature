
Feature: My Appointments for Doctor
    Background:
          Given Doc goes to the Medunna web page
            And Doc clicks user icon
            And Doc clicks Sign in option
            And Doc sign in home page
            And Doc navigates to home page
            And Doc clicks MY PAGES dropdown menu
            And Doc clicks My Appointments option

      Scenario:
         Given Doc sees Appointments heading displayed
           And Appointment is listed
           And Time slots are displayed
    @US10-TC2
     Scenario:
        Given Doc sees Appointments heading displayed
          And Doc see the patient ID
          And Doc see the StarDataTime
          And Doc see the EndDateTime
          And doc see the Status

  @US10-TC3
     Scenario:
         Given Doc sees Appointments heading displayed
           But Appointment list is NOT empty

