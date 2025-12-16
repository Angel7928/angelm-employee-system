interface Evaluable {
    fun evaluatePerformance()
}

abstract class Employee(val name: String, val salary: Double) {
    fun details() {
        println("Nombre: $name, Salario: $salary")
    }

    abstract fun work()
    abstract fun calculateAnnualBonus(): Double
}

class Developer(name: String, salary: Double) : Employee(name, salary) {
    override fun work() {
        println("Writing and reviewing code.")
    }

    override fun calculateAnnualBonus(): Double {
        return salary * 0.10
    }
}

class Designer(name: String, salary: Double) : Employee(name, salary) {
    override fun work() {
        println("Creating and optimizing visual design.")
    }

    override fun calculateAnnualBonus(): Double {
        return salary * 0.15
    }
}

class Manager(name: String, salary: Double) : Employee(name, salary), Evaluable {
    override fun work() {
        println("Supervising the team and planning projects.")
    }

    override fun calculateAnnualBonus(): Double {
        return salary * 0.20
    }

    override fun evaluatePerformance() {
        println("The manager has achieved all his team's objectives.")
    }
}