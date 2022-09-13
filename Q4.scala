import scala.io.StdIn.readInt

object Q4 extends App  {
    def negbalance(x: List[Account]) = {
        println("\nnegative balance")
        for(element <- x) {
            if (element.balance < 0) {
                println("Name:"+ element.name + " Balance:" + element.balance) 
            }
        }   
    }

    def sumbalance(x: List[Account]) = {
        var sum = 0.0;
        for(element <- x) {
            sum = sum + element.balance
        }
        println("\nTotal Balance is:" + sum)
    }

    def total(x: List[Account]) = {
        println("\nWith interest")
        for(element <- x) {
            element.balance = element.balance match {
                case x if element.balance > 0 => element.balance + element.balance*0.05
                case _ => element.balance + element.balance*0.1
            }
            println("Name:"+ element.name + " Balance:" + element.balance) 
        }
    }

    var A = new Account("A",7000)
    var B = new Account("B",-3000)
    var C = new Account("C",5000)
    var D = new Account("D",-1000)

    val bank = List(A,B,C,D);

    negbalance(bank)
    sumbalance(bank)
    total(bank)
}


class Account(n: String,x: Double) {
    val name = n
    var balance = x

    def transfer(a: Account, x: Int) = {
        this.balance = this.balance - x
        a.balance = a.balance + x
    }
}
