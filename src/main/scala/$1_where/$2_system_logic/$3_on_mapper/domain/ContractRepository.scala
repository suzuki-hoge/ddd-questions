package $1_where.$2_system_logic.$3_on_mapper.domain

trait ContractRepository {
  def status(id: ContractId): Status
}
