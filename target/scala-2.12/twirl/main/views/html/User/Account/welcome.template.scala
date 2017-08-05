
package views.html.User.Account

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

object welcome extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Integer,String,Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Integer, user: String, bEmail: Boolean):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.46*/("""

"""),format.raw/*3.1*/("""<html>
    <header>
        <title>Welcome, """),_display_(/*5.26*/user),format.raw/*5.30*/("""</title>
        <p>id = """"),_display_(/*6.19*/id),format.raw/*6.21*/(""""</p>
    </header>

    <nav>
        """),_display_(/*10.10*/if(bEmail == true)/*10.28*/{_display_(Seq[Any](format.raw/*10.29*/("""
            """),format.raw/*11.13*/("""<p>Please note: email is still unverified</p>
        """)))}),format.raw/*12.10*/("""
    """),format.raw/*13.5*/("""</nav>

    <br>
    <br>

    <body>
        <p> to show refactored home page here</p>
    </body>
</html>"""))
      }
    }
  }

  def render(id:Integer,user:String,bEmail:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(id,user,bEmail)

  def f:((Integer,String,Boolean) => play.twirl.api.HtmlFormat.Appendable) = (id,user,bEmail) => apply(id,user,bEmail)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Aug 03 15:47:39 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Account/welcome.scala.html
                  HASH: 8f611516c1b31b80eea92043ea1a8509dd006566
                  MATRIX: 979->1|1118->45|1146->47|1217->92|1241->96|1294->123|1316->125|1383->165|1410->183|1449->184|1490->197|1576->252|1608->257
                  LINES: 28->1|33->1|35->3|37->5|37->5|38->6|38->6|42->10|42->10|42->10|43->11|44->12|45->13
                  -- GENERATED --
              */
          