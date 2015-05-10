
object Root {

  val branchMap = scala.collection.mutable.Map[Char, Branch]()
  val branchSet = scala.collection.mutable.Set[Branch]()

  def addWord(word: String): Unit = {
    if(!checkBranch(word.head))
      branchSet += new Branch(word.head, word.tail)
    else {
      val i = branchSet.filter(_.getName == word.head)

    }
  }


  private def checkBranch(c: Char): Boolean = {
    branchMap.contains(c)
  }

  //override def toString = branchSet.head.nextNode
  def printAll = {
    branchSet.toArray.foreach(println)
  }

}
