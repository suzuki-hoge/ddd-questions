package $1_where.$1_business_logic.$3_on_mapper.mapper.table

import $1_where.$1_business_logic.$3_on_mapper.mapper.Customer

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
