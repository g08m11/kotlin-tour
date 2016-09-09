/*
  文字列なら$を使うことでRubyの#{}と同じことが出来る
  数値による計算なら${}で${}内で計算が出来る
  改行とタブのコードは他言語と一緒
  改行:\n
  タブ\t

*/


fun main(args: Array<String>) {
  var name = "g08m11"
  println("my name is $name")

  println("my score is ${12 * 23}")

  println("I'm \t so \n Happy")
}
