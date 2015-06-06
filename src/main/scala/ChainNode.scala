
class ChainNode(deepness: Int) extends Node{
  val branchArray = scala.collection.mutable.ArrayBuffer[Branch]()

  def size = branchArray.size

  def addWord(word: String): Unit = {

    val index = branchArray.indexOf(new Branch(word.head))
    if(index == -1){
      branchArray += new Branch(word.head, word.tail, deepness)
    }
    else{
      val branch = branchArray(index)
      if(!branch.nextNode.isTailNode && !word.tail.isEmpty) branch.nextNode.addWord(word.tail)
      if(branch.nextNode.isTailNode && !word.tail.isEmpty) branch.changeNode(word.tail)
    }
  }

  def isTailNode = false
  override def toString = branchArray.mkString(" "*deepness*5)
}
