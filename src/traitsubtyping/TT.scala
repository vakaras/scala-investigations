package traitsubtyping

class TT extends T1 with T2 {
  override def foo = {
    super.foo
    println("TT")
  }
}