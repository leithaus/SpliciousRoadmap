package com.biosimilarity.spirograph

import ru.circumflex._, core._, web._, freemarker._
import java.util.Date

class Main extends Router {
  val log = new Logger("com.biosimilarity.spirograph")

  'currentDate := new Date

  get("/roadmap") = redirect( "clickableGR.html" )
  get("/test") = "I'm fine, thanks!"
  get("/financials/1") = ftl("financials1.ftl")
  get("/financials/2") = ftl("financials2.ftl")
  get("/links/1") = ftl("findoutmore.ftl")
  get("/") = ftl("index.ftl")

}
