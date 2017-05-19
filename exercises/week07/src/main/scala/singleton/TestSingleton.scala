// Exercise 2:

// (a) Why might you decide to lazy-initialise a singleton instance rather than initialise it in its field declaration? Provide code examples of both approaches to illustrate your answer.

// Answer: it could be too expensive to create if it's not going to be used, or you may not have all you need yet to create it.

// this object won't get created until it's used, making its initialisation lazy:
object LazySingleton 

// non-lazy: we have to instantiate in main, as object creation is lazy in Scala:

class A private() { 
  def foo = println("foo")
}

object A { 
  var a: A = null
  def getA = { 
    if (a == null) a = new A()
    a
  }
}

object TestNonLazy extends App { 
  val a = A.getA 
  a.foo
}

/*
exercise 2b:

(b) There are many ways to break the singleton pattern. One is in a multi-threaded
environment but others include:
  If the class is Serializable.
  If it is Cloneable.
  It can be broken by reflection.
  If the class is loaded by multiple class loaders.
  Try and write a class SingletonProtected that addresses some (all?) of these issues.

Answer: I'm struggling with this one as none of this was discussed in the lectures leading up to this.
*/
