object AnonymousClasses {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  class Cell {
		var value: Int = 0
		def put( v: Int ) = { value = v }
		def get: Int = value
	}
  trait Backup extends Cell {
		var backup: Int = 0;
		override def put( v: Int ) = {
			backup = value
			super.put( v )
			}
		def undo = { super.put( backup ) }
	}
  val a = new Cell with Backup                    //> a  : AnonymousClasses.Cell with AnonymousClasses.Backup = AnonymousClasses$$
                                                  //| anonfun$main$1$$anon$1@7bce6a36
  val b = new Cell with Backup {}                 //> b  : AnonymousClasses.Cell with AnonymousClasses.Backup = AnonymousClasses$$
                                                  //| anonfun$main$1$$anon$2@acf3c39
}