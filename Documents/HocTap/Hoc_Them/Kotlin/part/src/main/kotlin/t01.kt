import tapHop.BieuThuc
import tapHop.TapHop

fun main() {
    /*val taphop = TapHop(10, 2, listOf(1, 2, 3, 4))
    taphop.addValueX()

    taphop.printList()

    taphop.timVaXoaSoNguyenTo()
    taphop.printList()*/


    val n = 5
    val x = 2.0

    val bt = BieuThuc(n,x)
    val result = bt.tinhTong()

    println("Tong cua bieu thuc la: $result")
}


