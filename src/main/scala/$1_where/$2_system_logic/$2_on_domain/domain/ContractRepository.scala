package $1_where.$2_system_logic.$2_on_domain.domain

trait ContractRepository {
  def status(id: ContractId): Status
}
