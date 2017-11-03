package where.$1_business_logic.$3_on_mapper.mapper

import java.time.LocalDate

case class StartDate(value: LocalDate) {
   def isPassedNYears(n: Int): Boolean = true
 }
