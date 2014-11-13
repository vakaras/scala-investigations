object Ex4Task3 {
  
  trait I {};
  trait J {};
	class C extends J {};
	class D {};
	
	class Converter {
		type T;
		def convertC(c: C): T = c.asInstanceOf[T]
	}
	
	val c = new C()                           //> c  : Ex4Task3.C = Ex4Task3$C@7946738
	val converterToJ = new Converter{type T = J}
                                                  //> converterToJ  : Ex4Task3.Converter{type T = Ex4Task3.J} = Ex4Task3$$anonfun$
                                                  //| main$1$$anon$1@19a1b0af
	val j: J = converterToJ.convertC(c)       //> j  : Ex4Task3.J = Ex4Task3$C@7946738
	val converterToD = new Converter{type T = D}
                                                  //> converterToD  : Ex4Task3.Converter{type T = Ex4Task3.D} = Ex4Task3$$anonfun$
                                                  //| main$1$$anon$2@4656be4e
	val d: D = converterToD.convertC(c)       //> java.lang.ClassCastException: Ex4Task3$C cannot be cast to Ex4Task3$D
                                                  //| 	at Ex4Task3$$anonfun$main$1.apply$mcV$sp(Ex4Task3.scala:17)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at Ex4Task3$.main(Ex4Task3.scala:11)
                                                  //| 	at Ex4Task3.main(Ex4Task3.scala)
	//var i: I = c.asInstanceOf[I];
	//var d: D = c.asInstanceOf[D];
	
}