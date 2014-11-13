package traitsubtyping

object Demo {

  def main(args: Array[String]): Unit = {
    val c = new C
    val tt = new TT
    c.foo(tt)
  }

}