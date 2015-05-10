
class Branch(val c: Char, tail: String) {
  val nextNode = if(!tail.isEmpty) new Node(this, tail) else '$'


  def getName = c
  override def toString = "" + c + " -> " + nextNode
}
