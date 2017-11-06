package where.$2_system_logic.$2_on_domain.domain

sealed trait Status

case object Confirming extends Status

case object Using extends Status

case object Stopping extends Status

case object Ended extends Status

object Status {
  def create(start: String, confirm: String, arrears: Int, end: String): Status = (Option(start), Option(confirm), Option(arrears), Option(end)) match {
      case (Some(_), None, None, None) => Confirming
      case (Some(_), Some(_), None, None) => Using
      case (Some(_), Some(_), Some(_), None) => Stopping
      case (Some(_), Some(_), None, Some(_)) => Ended
    }
}
