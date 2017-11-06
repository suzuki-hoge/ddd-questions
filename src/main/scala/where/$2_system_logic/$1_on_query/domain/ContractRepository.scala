package where.$2_system_logic.$1_on_query.domain

trait ContractRepository {
  def status(id: ContractId): Status
}
