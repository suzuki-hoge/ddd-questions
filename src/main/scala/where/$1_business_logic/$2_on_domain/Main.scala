package where.$1_business_logic.$2_on_domain

import where.$1_business_logic.$2_on_domain.domain.{Customer, CustomerRepository, NoticeRepository}

object Main extends App {
  val finder: CustomerRepository = ???
  val noticer: NoticeRepository = ???

  val customers: List[Customer] = finder.all()
  val targets: List[Customer] = customers.filter(_.isCampaignTarget)

  targets.foreach(noticer.campaign)
}
