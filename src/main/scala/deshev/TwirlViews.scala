package deshev

import org.scalatra._

class TwirlViews extends ScalatraServlet {
  get("/") {
    val name = params.get("name").getOrElse("Anonymous")
    views.html.index(name = name)
  }
}
