package traitsubtyping2

class C {
  def foo(t: T1 with T2 with T3) = {
    t.m1
    t.m2
    t.m3
    println("C")
  }
}