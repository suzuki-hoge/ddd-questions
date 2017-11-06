package $1_where.$1_business_logic.$4_on_arg.mapper

import $1_where.$1_business_logic.$4_on_arg.domain.{CampaignTargetCustomer, CustomerId, Plan, StartDate}


case class Customer(id: CustomerId, plan: Plan, start: StartDate) {
  def toCampaignTarget: CampaignTargetCustomer = {
    CampaignTargetCustomer(id)
  }
}
