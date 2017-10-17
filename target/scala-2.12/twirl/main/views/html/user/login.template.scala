
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
/*1.2*/import views.html.Global.Static.masterpage

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.19*/("""

"""),format.raw/*5.1*/("""<!DOCTYPE html>

<html>
    <header>
        <title>Login Form</title>
    </header>
    <body>
        <h1>Login Form</h1>
        <br/>
        <label>Email:</label> <input type="loginId" name="edtEmail"/>
        <br/>
        <br/>
        <label>Password:</label> <input type="password" name="edtPassword"/>
        <br/>
        <label>"""),_display_(/*19.17*/message),format.raw/*19.24*/("""</label>
        <br/>
        <form action=""""),_display_(/*21.24*/controllers/*21.35*/.routes.AccountController.doLogin()),format.raw/*21.70*/("""" method="post">
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
                  DATE: Mon Oct 16 16:10:59 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/user/login.scala.html
                  HASH: 0bc2e90c0c5a258014cb28de9c1298ceebf27da7
                  MATRIX: 656->1|1003->46|1115->63|1143->65|1513->408|1541->415|1614->461|1634->472|1690->507
                  LINES: 24->1|29->3|34->3|36->5|50->19|50->19|52->21|52->21|52->21
                  -- GENERATED --
              */
          