package where.$2_system_logic.$2_on_domain.table

import where.$2_system_logic.$2_on_domain.domain.{ContractId, ContractRepository, Status}

object ContractRepositoryTable extends ContractRepository {
  override def status(id: ContractId): Status = {
    /*

    val start, confirm, arrears, end = selector.findAll("select start, confirm, arrears, end from contract where id = id.value")

    Status.create(start, confirm, arrears, end)

     */
    ???
  }
}
