package where.$1_business_logic.$3_on_mapper

import where.$1_business_logic.$3_on_mapper.domain.{CampaignTargetCustomer, CustomerRepository, NoticeRepository}

object Main extends App {
  val finder: CustomerRepository = ???
  val noticer: NoticeRepository = ???

  val targets: List[CampaignTargetCustomer] = finder.campaignTarget()

  targets.foreach(noticer.campaign)
}
