package $1_where.$1_business_logic.$4_on_arg.mapper

import $1_where.$1_business_logic.$4_on_arg.domain.{CampaignTargetCustomer, CustomerRepository, Target}
import $1_where.$1_business_logic.$4_on_arg.mapper.table.CustomerRepositoryTable


object CustomerRepositoryMapper extends CustomerRepository {
  override def campaignTarget(target: Target): List[CampaignTargetCustomer] = {
    val customers: List[Customer] = CustomerRepositoryTable.all()

    customers.filter(it => target.isFreeAndPassed2Years(it.plan, it.start)).map(_.toCampaignTarget)
  }
}
