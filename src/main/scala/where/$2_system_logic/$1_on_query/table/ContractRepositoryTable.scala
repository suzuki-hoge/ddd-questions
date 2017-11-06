package where.$2_system_logic.$1_on_query.table

import where.$2_system_logic.$1_on_query.domain.{ContractId, ContractRepository, Status}

object ContractRepositoryTable extends ContractRepository {
  override def status(id: ContractId): Status = {
    /*

    val status = selector.findOne("
      select
        case
          when start is not null and confirm is     null then '1'
          when start is not null and confirm is not null then '2'
          when start is not null and confirm is not null and arrears is     null then '3'
          when start is not null and confirm is not null and arrears is not null and end is not null then '4'
        end
      from contract
      where id = id.value
    ")

    Status.create(status)

     */
    ???
  }
}
