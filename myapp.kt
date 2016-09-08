/*
 変数
   - val:型推論(Stringなどの用途目的の型を定義しないとエラーとなる)
   - var:valよりも楽。書き方はSwiftやRubyっぽい。型定義不要。
　型
   - String:文字列(複数OK)、ダブルクゥオーテーション
   - c:文字型(単一のみ)、ダブルクゥオーテーションでなくシングルクゥオーテーション
   - Int:数値
   - Long:数値型の末尾にLが必須
   - Double:浮動小数点型
   - Flat:浮動小数点型の末尾にFを付けるイメージ
   - Boolean:真偽値、RubyみたいにBoolではなく最後まで書くパターン
*/


fun main(args: Array<String>) {
  val msg: String = "Next Hello World"
  println(msg)

  var c:Char = 'c'
  println(c)

  val i: Int  = 100
  println( i )

  val l: Long  = 1000000000L
  println( l )

  val d: Double  = 3.141956
  println( d )

  val f: Float  = 3.141956F
  println( f )

  var b: Boolean = true
  println(b)
}
