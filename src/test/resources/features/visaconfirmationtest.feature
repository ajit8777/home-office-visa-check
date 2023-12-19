Feature: Visa Conformation Test Page

  @smoke@regression
  Scenario: anAustralianComingToUKForTourism
    Given I am on Start page
    When I click on start button
    And I Select a Nationality 'Australia'
    And I Click on Continue button
    And  I Select reason 'Tourism or visiting family and friends'
    And  I Click on Continue button
    Then I verify result 'You will not need a visa to come to the UK'

  @sanity @regression
  Scenario: aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths
    Given I am on Start page
    When I click on start button
    And I Select a Nationality 'Chile'
    And I Click on Continue button
    And I Select reason 'Work, academic visit or business'
    And  I Click on Continue button
    And I Select intendent to stay for 'longer than 6 months'
    And  I Click on Continue button
    And I Select have planning to work for 'Health and care professional'
    And I Click on Continue button
    Then I verify result 'You need a visa to work in health and care'

  @regression
  Scenario: aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card
    Given I am on Start page
    When I click on start button
    And I Select a Nationality 'Colombia'
    And I Click on Continue button
    And I Select reason 'Join partner or family for a long stay'
    And  I Click on Continue button
    And I verify result 'You may need a visa'


