fun main() {
    val employees = listOf(
        Developer("Ana", 3000.0),
        Manager("Juan", 5000.0),
        Designer("María", 3500.0),
        Developer("Luis", 1600.0)
    )

    println("Sistema de gestión de empleados:")
    for (employee in employees) {
        println("\n--------------------------------")

        employee.details()
        employee.work()

        val bonus = employee.calculateAnnualBonus()
        println("Bonus anual: $bonus €")

        if (employee is Evaluable) {
            print("Evaluación: ")
            employee.evaluatePerformance()
        }
    }
}