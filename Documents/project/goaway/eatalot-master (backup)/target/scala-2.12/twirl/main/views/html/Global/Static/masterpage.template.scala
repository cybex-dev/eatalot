
package views.html.Global.Static

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
/*1.2*/import Global.Html5._
/*2.2*/import Global.Static._

object masterpage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(pageTitle: String, bodyContent: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*6.2*/navContent/*6.12*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.16*/("""

""")))};def /*10.2*/scriptsContent/*10.16*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*10.20*/("""

""")))};
Seq[Any](format.raw/*4.40*/("""

"""),format.raw/*8.2*/("""

"""),format.raw/*12.2*/("""

"""),_display_(/*14.2*/essentials(pageTitle, navContent, bodyContent, scriptsContent)),format.raw/*14.64*/("""


"""))
      }
    }
  }

  def render(pageTitle:String,bodyContent:Html): play.twirl.api.HtmlFormat.Appendable = apply(pageTitle,bodyContent)

  def f:((String,Html) => play.twirl.api.HtmlFormat.Appendable) = (pageTitle,bodyContent) => apply(pageTitle,bodyContent)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Sep 29 17:56:52 SAST 2017
                  SOURCE: /home/dylan/Documents/project/goaway/eatalot-master/app/views/Global/Static/masterpage.scala.html
                  HASH: 96ace2b8fd66d5b4ff8b11f32a84399997d7a5f8
                  MATRIX: 665->1|694->24|1031->49|1147->90|1165->100|1245->104|1271->110|1294->124|1375->128|1417->87|1445->107|1474->131|1503->134|1586->196
                  LINES: 24->1|25->2|30->4|34->6|34->6|36->6|38->10|38->10|40->10|43->4|45->8|47->12|49->14|49->14
                  -- GENERATED --
              */
          