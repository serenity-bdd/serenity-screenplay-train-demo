Feature: Buy season tickets
  In order to save money on regular trips
  As a frequent traveller
  I want to be able to buy season tickets online

  Scenario: The one where Bill needs a *weekly* season ticket between London to Brighton

    Given that Bill has decided to check season tickets
    When he looks at a Weekly season ticket from Winnersh to London Waterloo
    Then he should see the following season ticket options:
      | 7 Day Season Ticket                 |
      | 7 Day Season Ticket (1st Class)     |
      | 7 Day Travelcard Season Ticket      |
      | 7 Day Travelcard Season (1st Class) |

  Scenario: The one where Bill needs a *montly* season ticket between London to Brighton

    Given that Bill has decided to check season tickets
    When he looks at a Monthly season ticket from Winnersh to London Waterloo
    Then he should see the following season ticket options:
      | Season Ticket                 |
      | Season Ticket (1st Class)     |
      | Travelcard Season             |
      | Travelcard Season (1st Class) |
