```scala
class MyClass(val x: Int) {
  def this() = this(0) // Auxiliary constructor
}

val instance1 = new MyClass(5)
val instance2 = new MyClass()
```