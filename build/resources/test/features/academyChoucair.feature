# Author Erika Isabel Caita Avila
  @stories
  Feature: Choucair Job Area
    As a User, I want to register in the magneto job area form from the main page choucair
    @scenario1
    Scenario: Register in the magneto job area, Checks the behavior of the system when entering numeric characters in the "Name" field.
      Given than erika wants to verify the form of the work area in choucair
      | strUser    | strLastName   | strEmail               | strPhone  |
      | 2665515      | Caita       | eicaita@misena.edu.co  | 3175727990|
      When she search for the job area registration
      | strCourse    |
      | Magneto Jobs |
      Then she finds the area called
      | strCourse    |
      | Magneto Jobs |
    @scenario2
    Scenario: Register in the magneto job area, Check the behavior of the system when an invalid email is entered in the "Email" field.
      Given than erika wants to verify the form of the work area in choucair
        | strUser    | strLastName   | strEmail               | strPhone  |
        | Erika      | Caita         | eicaita@misena         | 3175727990|
      When she search for the job area registration
        | strCourse         |
        | Magneto Jobs  |
      Then she finds the area called
        | strCourse        |
        | Magneto Jobs |
    @scenario3
    Scenario: Register in the magneto job area, Check the behavior of the system when entering a number with alphabetic characters in the "Cellular" field Check the behavior of the system
      Given than erika wants to verify the form of the work area in choucair
        | strUser    | strLastName   | strEmail               | strPhone  |
        | Erika      | Caita         | eicaita@misena.edu.co  | asbdaadbb|
      When she search for the job area registration
        | strCourse         |
        | Magneto Jobs |
      Then she finds the area called
        | strCourse        |
        | Magneto Jobs |
    @scenario4
    Scenario: Register in the magneto job area, Check the behavior of the system when the option "I accept the treatment, use and storage of my personal data" is checked, and the "Name" field is empty
      Given than erika wants to verify the form of the work area in choucair
        | strUser    | strLastName   | strEmail               | strPhone  |
        | Erika      | Caita         | eicaita@misena.edu.co  | 3175727990|
      When she search for the job area registration
        | strCourse         |
        | Magneto Jobs |
      Then she finds the area called
        | strCourse        |
        | Magneto Jobs |
    @scenario5
    Scenario: Register in the magneto job area, Check the behavior of the system when all the fields of the form are empty
      Given than erika wants to verify the form of the work area in choucair
        | strUser    | strLastName   | strEmail               | strPhone  |
        |            |               |                        |           |
      When she search for the job area registration
        | strCourse         |
        | Magneto Jobs  |
      Then she finds the area called
        | strCourse        |
        | Magneto Jobs |
