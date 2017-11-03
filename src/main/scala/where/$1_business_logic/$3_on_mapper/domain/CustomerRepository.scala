package where.$1_business_logic.$3_on_mapper.domain

trait CustomerRepository {
  def campaignTarget(): List[CampaignTargetCustomer]
}
