package modbat.mbt

import java.io.{File, FileOutputStream, IOException, PrintStream}
import modbat.log.Log

trait PathVisualizer {
  val dotDir: String
  val typeName: String
  val graphInitNode: String
  val modelClassName: String
  var out: PrintStream = null
  val outFile = modelClassName + "-" + graphInitNode + "-" + typeName + "Graph.dot"
  val fullOutFile = dotDir + File.separatorChar + outFile
  try {
    out = new PrintStream(new FileOutputStream(fullOutFile), false, "UTF-8")
  } catch {
    case ioe: IOException => {
      Log.error("Cannot open file " + fullOutFile + ":")
      Log.error(ioe.getMessage)
      //System.exit(1)
    }
  }
  def dotify(): (Int, Int, Int, Int, Int, Int, Int)
}
