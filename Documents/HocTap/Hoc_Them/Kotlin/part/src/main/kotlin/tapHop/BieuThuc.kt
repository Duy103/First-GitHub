package tapHop

class BieuThuc {
    private val x: Double
    private val n: Int

    constructor(n: Int, x: Double) {
        this.x = x
        this.n = n
    }

    fun tinhTong(): Double {
        var sum = 0.0
        for(index in 0..n) {
            sum += tinhLuyThua(x, index) / tinhGiaiThua(index)
        }
        return sum
    }

    fun tinhLuyThua(x: Double, soMu: Int): Double {
        var result = 1.0
        for(i in 1..soMu) {
            result *= x
        }
        return result
    }

    fun tinhGiaiThua(number: Int): Long {
        var result: Long = 1
        for(i in 2..number) {
            result *= i.toLong()
        }
        return result
    }

}