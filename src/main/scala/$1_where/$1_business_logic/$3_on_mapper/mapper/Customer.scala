package $1_where.$1_business_logic.$3_on_mapper.mapper

import $1_where.$1_business_logic.$3_on_mapper.domain.{CampaignTargetCustomer, CustomerId}

case class Customer(id: CustomerId, plan: Plan, start: StartDate) {
  def isCampaignTarget: Boolean = {
    plan == Plan.FREE && start.isPassedNYears(2)
  }

  def toCampaignTarget: CampaignTargetCustomer = {
    CampaignTargetCustomer(id)
  }
}
