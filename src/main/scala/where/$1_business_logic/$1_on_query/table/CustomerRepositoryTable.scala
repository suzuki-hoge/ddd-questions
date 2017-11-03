package where.$1_business_logic.$1_on_query.table

import where.$1_business_logic.$1_on_query.domain.{CampaignTargetCustomer, CustomerRepository}

object CustomerRepositoryTable extends CustomerRepository {
  override def campaignTarget(): List[CampaignTargetCustomer] = {
    // selector.findAll("select * from customer where start >= ADD_MONTHS ( sysdate , -24 ) and plan = 'free'");
    ???
  }
}
