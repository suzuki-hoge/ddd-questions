package where.$1_business_logic.$4_on_arg.domain

class Target {
  def isFreeAndPassed2Years(plan: Plan, start: StartDate) = {
    plan == Plan.FREE && start.isPassedNYears(2)
  }
}
