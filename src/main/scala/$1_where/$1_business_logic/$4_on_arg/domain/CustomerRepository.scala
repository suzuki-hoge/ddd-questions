package $1_where.$1_business_logic.$4_on_arg.domain

trait CustomerRepository {
  def campaignTarget(target: Target): List[CampaignTargetCustomer]
}
