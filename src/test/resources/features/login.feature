
Feature: Logueo al sistema de credito SGCRED
  Yo como Analista de negocio
  Quiero loguearme al sistema SGCRED
  Para ingresar al menu principal

  Scenario: Loguearse al sistema de credito SGCRED con el perfil Asesor de Negocio
    Given el sistema este disponible
    When ingrese el usuario "alpama"
    And ingresar el password "prueba"
    And doy click en ingresar
    Then el sistema me muestra el home

