package $1_where.$2_system_logic.$3_on_mapper.mapper.table

import $1_where.$2_system_logic.$3_on_mapper.domain.ContractId
import $1_where.$2_system_logic.$3_on_mapper.mapper.{Arrears, ConfirmDate, EndDate, StartDate}

object ContractRepositoryTable {
  def row(id: ContractId): (Option[StartDate], Option[ConfirmDate], Option[Arrears], Option[EndDate]) = {
    /*

    val start, confirm, arrears, end = selector.findAll("select start, confirm, arrears, end from contract where id = id.value")

    (Option(start).map(StartDate), Option(confirm).map(ConfirmDate), Option(arrears).map(Arrears), Option(end).map(EndDate))

     */
    ???
  }
}
