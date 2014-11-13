package traitsubtyping

trait T2 extends T0 {
  override def foo = { super.foo; println("T2"); }
}