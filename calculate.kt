/*
  whenの書き方は独特なので注意
  swiftだとcaseを使い「case num = 10」といった表現をするが
  kotinは「-> 10」と表現する
  また型もwhen内での条件が数値であった場合、
  比較対象も数値である必要がある。(ロジック見ずに適当にStringとかにするとコケる)

*/

fun main(args: Array<String>) {
  val num = 10

  when(num){
    0 -> println("ZERO")
    1 -> println("ONE")
    2, 3 -> println("Two Or Three")
    in 4..10 -> println("I don't know. so many")
    else -> println("other")
  }
}
