/*
  四則演算は他言語同様 + - * / % で対応可能
  インクリメント、デクリメントも対応可能
  代入演算子も対応可能
  論理演算子も対応可能(varではなくvalなのが一般的?)
*/

fun main(args: Array<String>) {
  val x = 10
  println(x / 3 )
  println(x / 3.0 )
  println(x % 3.0 )

  var y = 10
  y++
  println(y)
  y--
  println(y)

  var z = 12
  z += 6
  println(z)

  val flag = true
  println(!flag)
}
