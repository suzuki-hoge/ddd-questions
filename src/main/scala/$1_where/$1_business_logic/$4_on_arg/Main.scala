package $1_where.$1_business_logic.$4_on_arg

import $1_where.$1_business_logic.$4_on_arg.domain.{CampaignTargetCustomer, CustomerRepository, NoticeRepository, Target}


object Main extends App {
  val finder: CustomerRepository = ???
  val noticer: NoticeRepository = ???

  val targets: List[CampaignTargetCustomer] = finder.campaignTarget(new Target())

  targets.foreach(noticer.campaign)
}
