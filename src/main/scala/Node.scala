
class Node() {
  val branchArray = scala.collection.mutable.ArrayBuffer[Branch]()
  
  def addWord(word: String): Unit = {

    val index = branchArray.indexOf(new Branch(word.head))
    if(index == -1){
      if(!word.tail.isEmpty) branchArray += new Branch(word.head, word.tail) else branchArray += new Branch(word.head)
    }
    else{
      val n = branchArray(index)
      if(n.nextNode != null) n.nextNode.addWord(word.tail) //доделать часть когда все слово совподает.
    }
  }
  override def toString = branchArray.mkString(" ")
}


