package $1_where.$1_business_logic.$2_on_domain.domain

case class Customer(id: CustomerId, plan: Plan, start: StartDate) {
  def isCampaignTarget: Boolean = {
    plan == Plan.FREE && start.isPassedNYears(2)
  }
}
