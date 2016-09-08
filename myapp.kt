/*
 変数
   - val:型推論(Stringなどの用途目的の型を定義しないとエラーとなる)
   - var:valよりも楽。書き方はSwiftやRubyっぽい
*/


fun main(args: Array<String>) {
  val msg: String = "Neo Hello World"
  println(msg)

  var msg2 = "Neo Hello World2"
  println(msg2)
}
