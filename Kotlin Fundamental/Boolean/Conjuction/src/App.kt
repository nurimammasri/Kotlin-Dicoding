// main function
fun main() {
    val officeOpen = 7
    val officeClosed = 16
    val now = 20


    //now officeOpen..officeClosed
    val isOpen = now >= officeOpen && now <= officeClosed

    print("Office is open : $isOpen")
}