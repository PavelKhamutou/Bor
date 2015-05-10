
class Node(rootBranch: Branch, word: String) {
  val branchMap = scala.collection.mutable.Map[Char, Branch]()
  val branchSet = scala.collection.mutable.Set[Branch]()
  addBranch()
  def addBranch(): Unit = {
    /*if(word.tail.isEmpty) branchMap.put('$', new Branch('$', ""))
    else branchMap.put(word.head, new Branch(word.head, word.tail))
  */
    branchSet += new Branch(word.head, word.tail)
  }

  override def toString = branchSet.toString
}
