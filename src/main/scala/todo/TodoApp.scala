package todo

import org.scalajs.dom._

object TodoApp {
  def main(args: Array[String]): Unit = {
    val p = document.createElement("p")
    val text = document.createTextNode("Todo!")
    document.body.appendChild(p.appendChild(text))
    ()
  }
}