package traitsubtyping

trait T3 extends T0 {
	override def foo = { super.foo; println("T3"); }
}