package $1_where.$2_system_logic.$3_on_mapper.mapper

import $1_where.$2_system_logic.$3_on_mapper.domain._
import $1_where.$2_system_logic.$3_on_mapper.mapper.table.ContractRepositoryTable

object ContractRepositoryMapper extends ContractRepository {
  override def status(id: ContractId): Status = {
    val (start, confirm, arrears, end) = ContractRepositoryTable.row(id)

    Status.convert(start, confirm, arrears, end)
  }
}
