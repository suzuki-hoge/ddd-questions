package $1_where.$2_system_logic.$3_on_mapper.mapper

import $1_where.$2_system_logic.$3_on_mapper.domain._

object Status {
  def convert(start: Option[StartDate], confirm: Option[ConfirmDate], arrears: Option[Arrears], end: Option[EndDate]): Status = {
    (start, confirm, arrears, end) match {
      case (Some(_), None, None, None) => Confirming
      case (Some(_), Some(_), None, None) => Using
      case (Some(_), Some(_), Some(_), None) => Stopping
      case (Some(_), Some(_), None, Some(_)) => Ended
    }
  }
}










