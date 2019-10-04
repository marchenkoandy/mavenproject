Feature: My TestFeature 3

  Background:
    Given Background step with sleep

  @Passed
  Scenario: Test Scenario 1 in TestFeature 3
    Given Step passed

  @Failed
  Scenario: Test Scenario 2 in TestFeature 3
    Given Step passed
    Then Must be failed

  @Pending
  Scenario: Test Scenario 3 in TestFeature 3
    Given Step passed
    Then Must be pending