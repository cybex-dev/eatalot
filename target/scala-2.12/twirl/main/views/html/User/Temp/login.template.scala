
package views.html.User.Temp

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
        """),format.raw/*12.72*/("""
        """),format.raw/*13.18*/("""
        """),format.raw/*14.18*/("""
        """),format.raw/*15.81*/("""
        """),format.raw/*16.18*/("""
        """),format.raw/*17.36*/("""
        """),format.raw/*18.18*/("""
        """),format.raw/*19.9*/("""<form action=""""),_display_(/*19.24*/controllers/*19.35*/.Order.routes.AccountController.doLogin()),format.raw/*19.76*/("""" method="post">
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
                  DATE: Sat Oct 07 13:55:26 SAST 2017
                  SOURCE: /home/dylan/Documents/project/goaway/eatalot-master (backup)/Order-Management-Devel/app/views/User/Temp/login.scala.html
                  HASH: ab904839ddf9df19f6e856866e44cb8bc70a2e16
                  MATRIX: 958->1|1070->18|1098->20|1230->147|1267->165|1304->237|1341->255|1378->273|1415->354|1452->372|1489->408|1526->426|1562->435|1604->450|1624->461|1686->502
                  LINES: 28->1|33->1|35->3|42->10|43->11|44->12|45->13|46->14|47->15|48->16|49->17|50->18|51->19|51->19|51->19|51->19
                  -- GENERATED --
              */
          