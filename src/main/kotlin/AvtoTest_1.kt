
// добавлена новая ветка
//Новая ветка проба
// Добавлена переменная для комита
// Я чтото написал еще. переменная
// Определение комиссии перевода и его возможности
const val commit = 1000
const val git = 200
const val yyy =111


const val commisConst = 0.0075 // Комиссия - 0.75%
const val commisConstM = 0.006 // Комиссия - 0.6%
const val commisMin: Int = 35_00   // Минимальная комиссия
const val commisD: Int = 20_00   //  комиссия +20 руб
var tipKard: String = "1"
var ok: Boolean = true
var comisKop = 0

////////////////////////////////////////////////////////////////////////
fun main() {
//////////////////////////////
    do {
        println(
            "Введите тип карты:\n  Mastercard,\n" + "  Maestro,\n" + "  Visa,\n" + "  Mir,\n" + "  VK_Pay:"
        )
        tipKard = readln()
    } while (tipKard != "Mastercard" && tipKard != "Maestro" && tipKard != "Visa" && tipKard != "Mir" && tipKard != "VK_Pay")
    print("Введите сумму предыдущего перевода в копейках: ")
    val summOld = readln().toInt()
    print("Введите сумму перевода в копейках: ")
    val summNew = readln().toInt()
///////////////////////////////
    if (summNew <= 150_000_00 && (summNew + summOld) <= 600_000_00) {
        comisKop = commission(tipKard, summOld, summNew)
    } else {
        ok = false
        comisKop = 0
        println("Превышен суточный/месячный лимит по карте!")
    }
///////////////////////////////
    if (ok) println("Итоговая сумма комиссиии в копейках: $comisKop")
    else println("Перевод отклонен!")
}

///////////////////////////////////////////////////////////////////////////////////////////
fun commission(tipKard: String, summOld: Int, summNew: Int): Int {
    var comissionKop = 0
    when (tipKard) {
        "VK_Pay" -> {
            println(tipKard)
            if (summNew > 15_000_00 || (summNew + summOld) > 40_000_00) {
                println("Превышен суточный/месячный лимит по аккаунту!")
                ok = false
                comissionKop = -1
            } else comissionKop = 0
        }

        "Maestro", "Mastercard" -> {
            println(tipKard)
            if ((summNew + summOld) < 75_000_00) {
                println("комиссии нет!")
                comissionKop = 0
                ok = true
            } else comissionKop = (summNew * commisConstM + commisD).toInt()
        }

        "Visa", "Mir" -> {
            println(tipKard)
            val commissionOtSum = (summNew * commisConst).toInt()
            comissionKop = if (commissionOtSum <= commisMin) commisMin else commissionOtSum
        }
    }
    return comissionKop
}
