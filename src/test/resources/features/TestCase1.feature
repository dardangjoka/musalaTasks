

@tests
  Feature: Valdiate that email input doesnt take invalid entries.

   @TC1
      Scenario Outline: User enters invalid email.
        Given User is on the homepage
        And scrolls down to Contact section
        And clicks on Contact Us.
        And user should fill in "<Name>", "<Email>", "<Mobile>", "<Subject>" and "<Message>" input boxes
        Then Click the Send Button.
        Examples:
        | Name |  Email    | Mobile| Subject| Message     |
        |Dardan|  test1@te |  3048 | testing| Hello WOrld |
        |Dardan|  test2@te |  3048 | testing| Hello WOrld |
        |Dardan|  test2@te |  3048 | testing| Hello WOrld |
        |Dardan|  test4@te |  3048 | testing| Hello WOrld |
        |Dardan|  test5@te |  3048 | testing| Hello WOrld |

