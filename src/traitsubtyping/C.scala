package traitsubtyping

class C {
  def foo(x: T1 with T2 with T3) = {
    x.foo
    println("C");
  }
}
