
Feature: My Appointments edit "Request a test" only by Physician (Doctor)
  Background:
    Given Doc goes to the Medunna web page
    And Doc clicks user icon
    And Doc clicks Sign in option
    And Doc sign in home page
    And Doc navigates to home page
    And Doc clicks MY PAGES dropdown menu
    And Doc clicks My Appointments option
    And Doc clicks Edit button to update patients info
@sa
  Scenario:
    Given Doc navigate to the appointment update page
      And Doc clicks Request A Test button
     Then Doc navigate to the Test Items page

#    Scenario:
#     Given Doc navigate to the appointment update page
#       And Doc clicks Request A Test button
#       And Doc navigate to the Test Items page
#       And Doc sees "Glucose" displayed on the Test Items page
#       And Doc sees "Urea" displayed on the Test Items page
#       And Doc sees "Creatinine" displayed on the Test Items page
#       And Doc sees "Sodium Potassium" displayed on the Test Items page
#       And Doc sees "Total protein "displayed on the Test Items page
#       And Doc sees "Albumin" displayed on the Test Items page
#       And Doc sees "Hemoglobin" displayed on the Test Items page
  @sa
    Scenario:
      Given Doc navigate to the appointment update page
      And Doc clicks Request A Test button
      And Doc navigate to the Test Items page
      And Doc sees items below as checkmark options
          |Urea|
          |Albumin|
          |Total Protein-|
          |Hemoglobin|




