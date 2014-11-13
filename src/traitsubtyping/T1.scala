package traitsubtyping

trait T1 extends T0 {
  override def foo = { super.foo; println("T1"); }
}