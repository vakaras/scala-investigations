package traitsubtyping

object TraitNames {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  class X extends T1 with T2 {}
  val c = new C                                   //> c  : traitsubtyping.C = traitsubtyping.C@57a165ca
  c.foo(new X)
}