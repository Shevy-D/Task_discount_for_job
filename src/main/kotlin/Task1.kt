/**
 * Метод "скидка". Применяет скидку discount к цене price, начиная с позиции offset
 * на количество позиций readLength. Новые цены округляем “вниз”,
 * до меньшего целого числа.
 * @param price - исходные цены.
 * @param discount - % скидки, от 1 до 99.
 * @param offset - номер позиции, с которой нужно применить скидку.
 * @param readLength - количество позиций, к которым нужно применить скидку.
 * @return - массив новых цен.
 */
/*public @Nullable int[] decryptData(@NonNull int[] price,
@IntRange(from = 1) int discount,
@IntRange(from = 0) int offset,
@IntRange(from = 1) int readLength) {
//TODO реализовать метод
}

Пример
Входные данные
price = [5,100,20,66,16]
discount = 50
offset = 1
readLength = 3
Ожидаемый результат работы
[50,10,33]*/

fun main() {
    val price = listOf<Int>(5,100,20,66,16)
    val discount = 50
    val offset = 1
    val readLength = 3
    val result = discount(discount, offset, readLength, price)

    println(result)
}

fun discount(discount: Int, offset: Int, readLength: Int, price: List<Int>) {
    val newPrice: MutableList<Int> = mutableListOf()
    if (discount in 1..99 && offset>0 && readLength<price.size){
    for (i in offset..readLength) {
        newPrice.add((price[i]*(1-(discount*0.01))).toInt())
    }
        println(newPrice)
    } else {
        println("Check the entered data")
    }
}