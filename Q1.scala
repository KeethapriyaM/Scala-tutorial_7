object Q1 extends App {
    val x = new Rational(1,2)
    val y = x.neg
    println(y.numerator + "/" + y.denominator)
}

class Rational(num:Int, den:Int) {
    //validate input parameters
    require(denominator > 0, "Denominator must be greater than 0")
    def numerator = num
    def denominator = den

    def neg = new Rational(-this.numerator, this.denominator)
}