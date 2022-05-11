fun tip(bill: Int, percentage: Int = 10 ): Int {
   val gratuity = bill * percentage / 100
   return gratuity
}