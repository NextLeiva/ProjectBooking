Feature:
  Yo Como usuario quiero utilizar el servicio de reservas para encontrar la mejor opcion de alojamiento

#  Background: Ingresar en la pestana Stays
#    Given yo cierro la pantalla el inicio de sesion

  @test-HP @HappyPath
  Scenario Outline: Validar que se puede reservar un servicio de alojamiento
    Given cierro la pantalla el inicio de sesion
    When se haga tap en el servicio de alojamiento
    And se haga tap busca la ciudad de destino <destino>
    And se haga tap en el boton de Seleccionar fechas
    And se selecciona la habitacion para las personas
    And se selecciona el hotel en la vista del listados de hoteles
    And se selecciono la habitacion en la vista de detalle de Hotel
    And ingreso mis datos personale en la vista de Formulario
      | Campo              | Valor                  |
      | Nombre             | Juan                   |
      | Apellido           | Pérez                  |
      | Correo electrónico | juan.perez@example.com |
      | Pais               | Peru                   |
      | Teléfono           | 123456789              |
    And se ingresa los datos de tarjeta para confirmar la reserva <CardNumber>,<Holdername>,<TypeCard>,<Expiradate>,<CVC>

    Examples:[HAPPY PATH]
      | destino   | CardNumber       | TypeCard | Holdername | Expiradate | CVC |
      | Cajamarca | 5213234123412341 | Visa     | joel       | 125        | 123 |

  @test-UP2 @NegativePath
  Scenario Outline: Validar que no se puede reservar un servicio de alojamiento cuando las fechas no están disponibles
    Given cierro la pantalla el inicio de sesion
    When se haga tap en el servicio de alojamiento
    And se haga tap busca la ciudad de destino <destino>
    And se haga tap en el boton de Seleccionar fechas
    And se selecciona una fecha no disponible
    Then debería ver un mensaje indicando que las fechas seleccionadas no están disponibles

    Examples:[UNHAPPY PATH - Fechas No Disponibles]
      | destino   |
      | Cajamarca |

