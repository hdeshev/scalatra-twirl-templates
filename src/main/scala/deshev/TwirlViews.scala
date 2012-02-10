package deshev

import org.scalatra._

class TwirlViews extends ScalatraServlet with TwirlSupport {
  get("/") {
    val name = params.get("name").getOrElse("Anonymous")
    views.html.index(name = name)
  }

  get("/text") {
    val name = params.get("name").getOrElse("Anonymous")
    views.txt.index(name = name)
  }

  get("/auto-content-type") {
    //views.html.index(name = "Auto-content-type")
    views.txt.index(name = "Auto-content-type")
  }
}
