package $1_where.$1_business_logic.$1_on_query

import $1_where.$1_business_logic.$1_on_query.domain.{CampaignTargetCustomer, CustomerRepository, NoticeRepository}

object Main extends App {
  val finder: CustomerRepository = ???
  val noticer: NoticeRepository = ???

  val targets: List[CampaignTargetCustomer] = finder.campaignTarget()

  targets.foreach(noticer.campaign)
}
