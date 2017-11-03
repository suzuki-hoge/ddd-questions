package where.$1_business_logic.$4_on_arg.domain

case class Target {
  def isFreeAndPassed2Years(plan: Plan, start: StartDate) = {
    plan == Plan.FREE && start.isPassedNYears(2)
  }
}
