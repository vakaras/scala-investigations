object TraitInheritance {
  class A {
  	def foo = println("A")
  }
  class B extends A {
  	override def foo = {
  	 	println("B")
  	 	super.foo
  	 	}
  }
  trait TB extends B {
  	override def foo = {
  		println("TB")
  		super.foo
  	}
  }
  trait TA extends A {
  	override def foo = {
  		println("TA");
  		super.foo
  	}
  }
  class C extends B {
		override def foo = {
  		println("C");
  		super.foo
  	}
  }
  class D extends B with TA with TB {
  	override def foo = {
  		println("D");
  		super.foo
  	}
  }
  val c = new C with TA with TB {}                //> c  : TraitInheritance.C with TraitInheritance.TA with TraitInheritance.TB = 
                                                  //| TraitInheritance$$anonfun$main$1$$anon$1@a18678a
  c.foo                                           //> TB
                                                  //| TA
                                                  //| C
                                                  //| B
                                                  //| A
  val d = new D()                                 //> d  : TraitInheritance.D = TraitInheritance$D@7647b3ee
  d.foo                                           //> D
                                                  //| TB
                                                  //| TA
                                                  //| B
                                                  //| A
}