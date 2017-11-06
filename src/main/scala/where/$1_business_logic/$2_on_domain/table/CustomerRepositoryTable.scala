package where.$1_business_logic.$2_on_domain.table

import where.$1_business_logic.$2_on_domain.domain.{Customer, CustomerRepository}

object CustomerRepositoryTable extends CustomerRepository {
  override def all(): List[Customer] = {
    /*

    selector.findAll("select id, plan, start from customer")
      .map(
        id, plan, start => Customer(
          CustomerId(id), Plan(plan), StartDate(start)
        )
      )

     */
    ???
  }
}
