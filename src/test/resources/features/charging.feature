@tag
Feature: Charging

  En tant que user, je peux charger un objet chargeable.

  Scenario Outline: charger un chargeable
    Given <Chargeable> avec le niveau d'energy <energy>
    When l'utilisateur charge le chargeable avec le ChargerAdapter
    Then chargeable a le nouveau niveau d'energy supérieur à <energy>

    Examples:
      | Chargeable | energy |
      | chargeable | 0      |
      | chargeable | 9      |