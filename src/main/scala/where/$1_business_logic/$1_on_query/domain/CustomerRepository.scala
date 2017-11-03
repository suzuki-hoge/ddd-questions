package where.$1_business_logic.$1_on_query.domain

trait CustomerRepository {
  def campaignTarget(): List[CampaignTargetCustomer]
}
