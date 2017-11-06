package where.$1_business_logic.$3_on_mapper.mapper.table

import where.$1_business_logic.$3_on_mapper.mapper.Customer

object CustomerRepositoryTable {
  def all(): List[Customer] = {
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
