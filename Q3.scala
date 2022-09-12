import scala.io.StdIn.readInt

object Q3 extends App  {
    var x = new Account(8000)
    var y = new Account(10000)

    x.transfer(y,2000);
    println(x.balance)
}

class Account(x: Int) {
    var balance = x

    def transfer(a: Account, x: Int) ={
        this.balance = this.balance - x
        a.balance = a.balance + x
    } 
}