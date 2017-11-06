package where.$2_system_logic.$3_on_mapper

import where.$2_system_logic.$3_on_mapper.domain.{ContractId, ContractRepository, Status}

object Main extends App {
  val finder: ContractRepository = ???
  val id = ContractId("123")

  val status: Status = finder.status(id)
}
