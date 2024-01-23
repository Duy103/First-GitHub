package tapHop

class TapHop {
    private var x: Int
    private var k: Int
    private var list: List<Int>

    constructor(){
        x = 0
        k = 0
        list = listOf()
    }

    constructor(x: Int, k: Int, list: List<Int>) {
        this.x = x
        this.k = k
        this.list = list
    }

    fun addValueX(){
        val result = arrayListOf<Int>()
        if(list.isEmpty()) {
            if(k==0) {
                result.add(x)
                list = result
            }
            return
        }
        result.addAll(list)
        if(k <= list.size){
            result.add(k-1,x)
        }else if(k == list.size) {
            result.add(x)
        }
        list =result
    }

    fun addValueX(x: Int, k: Int) {
        this.x= x
        this.k = k
        addValueX()
    }

    fun printList()
    {
        list.forEach{
            print(" $it ")
        }
    }

    fun timVaXoaSoNguyenTo() {
        val result = arrayListOf<Int>()
        result.addAll(list)

        result.forEach{
            if(kiemTraSoNguyenTo(it)){
                result.remove(it)
            }
        }
    }

 /*   fun kiemTraSoNguyenTo(number: Int): Boolean {
        if (number <= 1) {
            return false
        }

        for (i in 2 until number) {
            if (number % i == 0) {
                return false
            }
        }

        return true
    }*/

    fun kiemTraSoNguyenTo(number: Int): Boolean{
        if(number in 1..3) return true
        for(item in 2.. (number/2)) {
            if(number % item ==0) {
                return false
            }
        }
        return true
    }
}