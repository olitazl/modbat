package modbat.test

import modbat.dsl._

class SimpleLingelingModel extends Model {
  var num_variables : Int = 0
  var num_clauses : Int = 0
  var added_clauses : Int = 0

  // transitions
  "reset" -> "init" := {
     System.out.println ("init")
  }
  "init" -> "cnf" := {
     added_clauses = 0
     num_variables = choose (100, 1000);
     var threshold = choose (350, 450);
     num_clauses = (num_variables * threshold) / 100
  }
  "cnf" -> "clause" := { require(added_clauses < num_clauses) }
  "cnf" -> "generated" := { require(added_clauses == num_clauses) }
  "clause" -> "binary" := {
    var lit = 1 // chooseLit
    System.out.println ("add " + lit);
  }
  "binary" -> "ternary" := {
    var lit = 2 // chooseLit
    System.out.println ("add " + lit)
  }
  "ternary" -> "cnf" := {
    var lit = 3 // chooseLit
    System.out.println ("add " + lit)
    System.out.println ("add 0")
    added_clauses += 1
  }
  "generated" -> "sat" := { System.out.println ("sat"); }
  "generated" -> "init" := skip
  "generated" -> "simp" := {
    var simplificationLevel : Int = 1 //choose between 0 and 3
    System.out.println ("simp " + simplificationLevel)
  }
  "generated" -> "end" := skip
}

