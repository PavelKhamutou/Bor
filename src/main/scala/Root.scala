
object Root {

  val branchArray = scala.collection.mutable.ArrayBuffer[Branch]()
  def addWord(word: String): Unit = {
    val index = branchArray.indexOf(new Branch(word.head))
    if(index == -1){
      if(!word.tail.isEmpty) branchArray += new Branch(word.head, word.tail) else branchArray += new Branch(word.head)
    }
    else{
      if(!word.tail.isEmpty) branchArray(index).nextNode.addWord(word.tail)
    }
  }

  override def toString = branchArray.mkString("")
}
