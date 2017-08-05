
package views.html.Application.Home

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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(pageTitle: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*5.2*/bodyHtml/*5.10*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.14*/("""
    """),format.raw/*6.5*/("""<p>The main loading page, add slider of images, text, etc</p>
    <p>And some more images</p>
""")))};
Seq[Any](format.raw/*3.21*/("""

"""),format.raw/*8.2*/("""

"""),format.raw/*10.1*/("""<html>
"""),_display_(/*11.2*/masterpage(pageTitle)/*11.23*/ {_display_(Seq[Any](format.raw/*11.25*/("""
    """),format.raw/*12.5*/("""<div class="body">
        <h1>User's homepage</h1>
        <p>TO order, loging or create an account (no login check yet)</p>

        <div class="container-small">
            <div class="pull-center">
                <div class="align-center">
                    <a href=""""),_display_(/*19.31*/controllers/*19.42*/.User.routes.AccountController.login()),format.raw/*19.80*/("""" class="btn btn-success">
                        Login to EatAloT</a>
                    <br/>
                    <br/>
                    <a href=""""),_display_(/*23.31*/controllers/*23.42*/.User.routes.AccountController.create()),format.raw/*23.81*/("""" class="btn btn-default">
                        Create Account</a>
                    <br/>
                    <br/>
                </div>
            </div>
        </div>
    </div>
""")))}),format.raw/*31.2*/("""
"""),format.raw/*32.1*/("""</html>"""))
      }
    }
  }

  def render(pageTitle:String): play.twirl.api.HtmlFormat.Appendable = apply(pageTitle)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (pageTitle) => apply(pageTitle)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Aug 05 23:16:05 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Application/Home/index.scala.html
                  HASH: 2a0ad32ec1a5f43ba15ca85b6dbebfdadbd88c5e
                  MATRIX: 668->1|1015->46|1112->68|1128->76|1208->80|1239->85|1373->65|1401->180|1430->182|1464->190|1494->211|1534->213|1566->218|1869->494|1889->505|1948->543|2129->697|2149->708|2209->747|2430->938|2458->939
                  LINES: 24->1|29->3|33->5|33->5|35->5|36->6|39->3|41->8|43->10|44->11|44->11|44->11|45->12|52->19|52->19|52->19|56->23|56->23|56->23|64->31|65->32
                  -- GENERATED --
              */
          