const val TEEN = 10
const val HANDRED = 100
fun tip(bill: Int, percentage: Int = TEEN): Int = bill * percentage / HANDRED
