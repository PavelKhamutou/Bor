
object Root extends Node{

  def isTailNode = false
  val branchArray = scala.collection.mutable.ArrayBuffer[Branch]()

  def addWord(word: String): Unit = {
    val index = branchArray.indexOf(new Branch(word.head))
    if(index == -1){
      branchArray += new Branch(word.head, word.tail, 0)
    }
    else{
      val branch = branchArray(index)
      if(!branch.nextNode.isTailNode && !word.tail.isEmpty) branch.nextNode.addWord(word.tail)

      if(branch.nextNode.isTailNode && !word.tail.isEmpty) branch.changeNode(word.tail)
    }
  }

  override def toString = branchArray.mkString("")
}
