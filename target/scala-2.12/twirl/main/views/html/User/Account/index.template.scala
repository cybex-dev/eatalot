
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
/*1.2*/import Global.Static.masterpage
/*2.2*/import Global.Html5._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.4*/("""

"""),format.raw/*6.1*/("""<html>
    """),_display_(/*7.6*/masterpage(" :: Home")/*7.28*/ {_display_(Seq[Any](format.raw/*7.30*/("""
        """),_display_(/*8.10*/body/*8.14*/ {_display_(Seq[Any](format.raw/*8.16*/("""
            """),format.raw/*9.13*/("""<form action=""""),_display_(/*9.28*/controllers/*9.39*/.User.routes.AccountController.login()),format.raw/*9.77*/("""" method="get">
                <input type="submit" value="Login">
            </form>
            <br>
            <form action=""""),_display_(/*13.28*/controllers/*13.39*/.User.routes.AccountController.create()),format.raw/*13.78*/("""" method="get">
                <input type="submit" value="Register">
            </form>
        """)))}),format.raw/*16.10*/("""
    """)))}),format.raw/*17.6*/("""
"""),format.raw/*18.1*/("""</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Aug 03 15:47:39 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Account/index.scala.html
                  HASH: 900e2a4dbcad8465d5c6dca3c589e0f4d9fd5708
                  MATRIX: 664->1|703->34|1022->58|1118->60|1146->62|1183->74|1213->96|1252->98|1288->108|1300->112|1339->114|1379->127|1420->142|1439->153|1497->191|1656->323|1676->334|1736->373|1867->473|1903->479|1931->480
                  LINES: 24->1|25->2|30->4|35->4|37->6|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|40->9|44->13|44->13|44->13|47->16|48->17|49->18
                  -- GENERATED --
              */
          