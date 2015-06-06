
case class Branch(char: Char) {

  var nextNode: Node = _
  var deepness = 0

  def this(char: Char, tail: String, deepness: Int){
    this(char)
    this.deepness = deepness
    if(tail.isEmpty) this.nextNode = new TailNode()
    else {
      this.nextNode = new ChainNode(deepness + 1)
      this.nextNode.addWord(tail)
    }
  }

  def changeNode(tail: String) = {
    nextNode = new ChainNode(deepness + 1)
    nextNode.addWord(tail)
  }

  override def toString = char + " -> " + nextNode

}
