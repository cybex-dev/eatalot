
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
  def apply/*4.2*/(pageTitle: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*6.2*/navSection/*6.12*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.16*/("""

""")))};
Seq[Any](format.raw/*4.36*/("""

"""),format.raw/*8.2*/("""

"""),format.raw/*10.1*/("""<html xmlns="http://www.w3.org/1999/xhtml">

    """),_display_(/*12.6*/essentials(pageTitle)/*12.27*/{_display_(_display_(/*12.29*/navSection))}/*12.40*/{_display_(_display_(/*12.42*/content))}),format.raw/*12.50*/("""
"""),format.raw/*13.1*/("""</html>


"""))
      }
    }
  }

  def render(pageTitle:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pageTitle)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pageTitle) => (content) => apply(pageTitle)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Aug 03 15:47:39 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Global/Static/masterpage.scala.html
                  HASH: 07b86e2bf9f7601db3a803c65f4d018c959cf24f
                  MATRIX: 665->1|694->24|1031->49|1143->86|1161->96|1241->100|1283->83|1311->103|1340->105|1416->155|1446->176|1476->178|1498->189|1528->191|1559->199|1587->200
                  LINES: 24->1|25->2|30->4|34->6|34->6|36->6|39->4|41->8|43->10|45->12|45->12|45->12|45->12|45->12|45->12|46->13
                  -- GENERATED --
              */
          