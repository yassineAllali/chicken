@tag
Feature: Spaceship movement

  En tant que joueur, je veux lancer des boules de feu de la spaceship
  pour tuer les Chicken.

  Scenario Outline: kill Chicken
    Given <Spaceship> à la position (<s_x>, <s_y>) [shoot]
    And Chicken à la position (<c_x>, <c_y>)
    When le joueur lance la boule de feu
    Then Chicken est <morte>

    Examples:
      | Spaceship | s_x | s_y | c_x | c_y | morte   |
      | spaceShip | 5   | 0   | 5   | 9   | dead    |
      | spaceShip | 9   | 2   | 9   | 6   | dead    |

  Scenario Outline: Chicken still alive because they are not on the same line
    Given <Spaceship> à la position (<s_x>, <s_y>) [shoot]
    And Chicken à la position (<c_x>, <c_y>)
    When le joueur lance la boule de feu
    Then Chicken est toujours <vivante>

    Examples:
      | Spaceship | s_x | s_y | c_x | c_y | vivante   |
      | spaceShip | 5   | 0   | 6   | 9   | alive   |
      | spaceShip | 9   | 2   | 4   | 2   | alive   |

  Scenario Outline: Chicken still alive because it's bellow the spaceship
    Given <Spaceship> à la position (<s_x>, <s_y>) [shoot]
    And Chicken à la position (<c_x>, <c_y>)
    When le joueur lance la boule de feu
    Then Chicken est toujours <vivante>

    Examples:
      | Spaceship | s_x | s_y | c_x | c_y | vivante |
      | spaceShip | 5   | 10  | 5   | 9   | alive   |
      | spaceShip | 9   | 8   | 4   | 6   | alive   |