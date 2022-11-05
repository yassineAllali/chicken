@tag
Feature: Spaceship movement

  En tant que joueur, je veux déplacer la spaceship pour tuer les Chicken
  et éviter les Eggs des Chicken.

  Scenario Outline: move Left
    Given <Spaceship> à la position (<x>, <y>) [move]
    When le joueur déplace la Spaceship à gauche d'une distance <d>
    Then la nouvelle position de la Spaceship devient (<n_x>, <n_y>)

    Examples:
    | Spaceship | x | y | d | n_x | n_y |
    | spaceShip | 0 | 0 | 3 | -3  | 0   |
    | spaceShip | 1 | 2 | 7 | -6  | 2   |

  Scenario Outline: move Right
    Given <Spaceship> à la position (<x>, <y>) [move]
    When le joueur déplace la Spaceship à droite d'une distance <d>
    Then la nouvelle position de la Spaceship devient (<n_x>, <n_y>)

    Examples:
      | Spaceship | x | y | d | n_x | n_y |
      | spaceShip | 0 | 0 | 3 | 3   | 0   |
      | spaceShip | 1 | 2 | 7 | 8   | 2   |

  Scenario Outline: move Up
    Given <Spaceship> à la position (<x>, <y>) [move]
    When le joueur déplace la Spaceship en haut d'une distance <d>
    Then la nouvelle position de la Spaceship devient (<n_x>, <n_y>)

    Examples:
      | Spaceship | x | y | d | n_x | n_y |
      | spaceShip | 0 | 0 | 3 | 0   | 3   |
      | spaceShip | 1 | 2 | 7 | 1   | 9   |

  Scenario Outline: move Down
    Given <Spaceship> à la position (<x>, <y>) [move]
    When le joueur déplace la Spaceship en bas d'une distance <d>
    Then la nouvelle position de la Spaceship devient (<n_x>, <n_y>)

    Examples:
      | Spaceship | x | y | d | n_x | n_y |
      | spaceShip | 0 | 0 | 3 | 0   | -3  |
      | spaceShip | 1 | 2 | 7 | 1   | -9  |

