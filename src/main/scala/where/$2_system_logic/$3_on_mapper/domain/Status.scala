package where.$2_system_logic.$3_on_mapper.domain

sealed trait Status

case object Confirming extends Status

case object Using extends Status

case object Stopping extends Status

case object Ended extends Status
