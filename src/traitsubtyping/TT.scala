package traitsubtyping

class TT extends T1 with T3 {
  override def foo = {
    super.foo
    println("TT")
  }
}