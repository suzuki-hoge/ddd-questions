package where.$2_system_logic.$1_on_query.domain

sealed trait Status

case object Confirming extends Status

case object Using extends Status

case object Stopping extends Status

case object Ended extends Status

object Status {
  def create(value: String): Status = value match {
    case "1" => Confirming
    case "2" => Using
    case "3" => Stopping
    case "4" => Ended
  }
}
