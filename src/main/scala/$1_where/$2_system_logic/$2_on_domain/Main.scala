package $1_where.$2_system_logic.$2_on_domain

import $1_where.$2_system_logic.$2_on_domain.domain.{ContractId, ContractRepository, Status}

object Main extends App {
  val finder: ContractRepository = ???
  val id = ContractId("123")

  val status: Status = finder.status(id)
}
