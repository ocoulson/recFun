package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if(c <= 0 || c == r) 1
      else pascal(c, r-1) + pascal(c-1, r-1)
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def helper(characters: List[Char], count: Int): Boolean = {
        if (characters.isEmpty) count == 0
        else {
          if (count < 0) false
          else characters.head match {
            case '(' => helper(characters.tail,count+1)
            case ')' => helper(characters.tail,count-1)
            case _ => helper(characters.tail, count)
          }
        }
      }
      helper(chars, 0)
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = ???
  }
