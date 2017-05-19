trait Product { 
  def foo
}

class ConcreteProduct extends Product { 
  def foo = println("foo!")
}

trait Creator { 
  def getProduct: Product
}

object ConcreteCreator extends Creator { 
  def getProduct = new ConcreteProduct
}

object TestConcreteCreator extends App { 
  ConcreteCreator.getProduct.foo
}
