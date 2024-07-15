Feature:
  Yo Como usuario quiero utilizar el servicio de reservas para encontrar la mejor opcion de alojamiento

#  Background: Ingresar en la pestana Stays
#    Given yo cierro la pantalla el inicio de sesion

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


    Examples:[HAPPY PATH]
      | destino   |
      | Cajamarca |



