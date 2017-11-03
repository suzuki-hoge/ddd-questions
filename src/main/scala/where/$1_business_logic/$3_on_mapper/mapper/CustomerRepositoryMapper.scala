package where.$1_business_logic.$3_on_mapper.mapper

import where.$1_business_logic.$3_on_mapper.domain.{CampaignTargetCustomer, CustomerRepository}
import where.$1_business_logic.$3_on_mapper.mapper.table.CustomerRepositoryTable

object CustomerRepositoryMapper extends CustomerRepository {
  override def campaignTarget(): List[CampaignTargetCustomer] = {
    val customers: List[Customer] = CustomerRepositoryTable.all()

    customers.filter(_.isCampaignTarget).map(_.toCampaignTarget)
  }
}
