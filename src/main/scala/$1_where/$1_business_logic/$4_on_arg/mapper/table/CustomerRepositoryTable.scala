package $1_where.$1_business_logic.$4_on_arg.mapper.table

import $1_where.$1_business_logic.$4_on_arg.mapper.Customer

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
