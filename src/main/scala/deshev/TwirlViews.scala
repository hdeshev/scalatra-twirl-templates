package deshev

import org.scalatra._

class TwirlViews extends ScalatraServlet {
  get("/") {
    val name = params.get("name").getOrElse("Anonymous")
    views.html.index(name = name)
  }

  get("/text") {
    contentType = "text/plain"
    val name = params.get("name").getOrElse("Anonymous")
    views.txt.index(name = name)
  }

  get("/auto-content-type") {
    autoContent {
      //views.html.index(name = "Auto-content-type")
      views.txt.index(name = "Auto-content-type")
    }
  }

  def autoContent(template: => twirl.api.Content) = {
    val rendered = template
    contentType = rendered.contentType
    rendered
  }
}
