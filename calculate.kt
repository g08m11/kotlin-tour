/*
  valは定数の時に主に用いられる。SwiftでいうStrong?
  ifなどの条件分岐も他言語同様
  条件に合わせて値を設定することも出来る
*/

fun main(args: Array<String>) {
  val score = 100
  val score_2 = 10

  if (score > 80) {
    println("GREAT!!")
  }else if (score > 60){
    println("GOOD!")
  }else{
    println("soso...")
  }

  val result = if (score_2 > 80) "GREAT!" else "soso.."
  println(result)
}
