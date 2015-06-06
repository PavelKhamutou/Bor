
case class Branch(char: Char) {
  var nextNode: Node = _
  def this(char: Char, tail: String){
    this(char)
    this.nextNode = new Node()
    this.nextNode.addWord(tail)
  }
  override def toString = char + " -> " + { if(nextNode == null) "$\n" else nextNode }
}
