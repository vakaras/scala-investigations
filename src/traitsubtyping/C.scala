package traitsubtyping

class C {
  def foo(x: T1 with T2) = {
    x.foo
    println("C");
  }
}
