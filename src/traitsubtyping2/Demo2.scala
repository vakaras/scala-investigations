package traitsubtyping2

object Demo2 {

  def main(args: Array[String]): Unit = {
    val c = new C
    val tt = new TT
    c.foo(tt)
  }

}