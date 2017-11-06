package $1_where.$1_business_logic.$2_on_domain.domain

import java.time.LocalDate

case class StartDate(value: LocalDate) {
  def isPassedNYears(n: Int): Boolean = true
}
