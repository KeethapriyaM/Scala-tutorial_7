object Q2 extends App {
    val x = new Rational(3,4)
    val y = new Rational(5,8)
    val z = new Rational(2,7)
  
    val a = x-y-z
    println(a.numerator + "/" + a.denom)
}

class Rational(num:Int, den:Int) {
    //validate input parameters
    require(denom > 0, "Denominator must be greater than 0")
    def numerator = num
    def denom = den
    def neg = new Rational(-this.numerator, this.denom)
    def add(r:Rational) = new Rational(this.numerator*r.denom + this.denom*r.numerator, this.denom*r.denom)
    def -(r:Rational) = this.add(r.neg)
}