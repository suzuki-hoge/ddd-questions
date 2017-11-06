package $1_where.$2_system_logic.$1_on_query

import $1_where.$2_system_logic.$1_on_query.domain.{ContractId, ContractRepository, Status}

object Main extends App {
  val finder: ContractRepository = ???
  val id = ContractId("123")

  val status: Status = finder.status(id)
}
