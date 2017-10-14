
package views.html.user

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <header>
        <title>Login Form</title>
    </header>
    <body>
        """),format.raw/*10.32*/("""
        """),format.raw/*11.18*/("""
        """),format.raw/*12.74*/("""
        """),format.raw/*13.18*/("""
        """),format.raw/*14.18*/("""
        """),format.raw/*15.81*/("""
        """),format.raw/*16.18*/("""
        """),format.raw/*17.36*/("""
        """),format.raw/*18.18*/("""
        """),format.raw/*19.9*/("""<form action=""""),_display_(/*19.24*/controllers/*19.35*/.routes.AccountController.doLogin()),format.raw/*19.70*/("""" method="post">
            <input type="submit" value="Login">
        </form>
    </body>
</html>"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Oct 14 13:03:14 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/user/login.scala.html
                  HASH: 66e13a141350e1ceb586fad394a98c3d780eeb97
                  MATRIX: 953->1|1065->18|1093->20|1225->147|1262->165|1299->239|1336->257|1373->275|1410->356|1447->374|1484->410|1521->428|1557->437|1599->452|1619->463|1675->498
                  LINES: 28->1|33->1|35->3|42->10|43->11|44->12|45->13|46->14|47->15|48->16|49->17|50->18|51->19|51->19|51->19|51->19
                  -- GENERATED --
              */
          