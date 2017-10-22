
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

object masterpage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pageTitle: String, bodyContent: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*3.2*/navContent/*3.12*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.16*/("""

""")))};def /*7.2*/scriptsContent/*7.16*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*7.20*/("""

""")))};
Seq[Any](format.raw/*1.40*/("""

"""),format.raw/*5.2*/("""

"""),format.raw/*9.2*/("""

"""),_display_(/*11.2*/essentials/*11.12*/.apply(pageTitle, navContent, bodyContent, scriptsContent)),format.raw/*11.70*/("""


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
                  DATE: Sun Oct 22 11:23:03 SAST 2017
                  SOURCE: /home/dylan/Desktop/eatalot/eatalot/app/views/Global/Static/masterpage.scala.html
                  HASH: 224926abb1a85987e7c23a6d59bf2694b43002b8
                  MATRIX: 972->1|1088->42|1106->52|1186->56|1211->62|1233->76|1313->80|1355->39|1383->59|1411->83|1440->86|1459->96|1538->154
                  LINES: 28->1|32->3|32->3|34->3|36->7|36->7|38->7|41->1|43->5|45->9|47->11|47->11|47->11
                  -- GENERATED --
              */
          