
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
/*1.2*/import controllers.Application.AppTags
/*2.2*/import Global.Html5._
/*3.2*/import Global.Static._

object essentials extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,Html,Html,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(pageTitle: String, navExt: Html, bodyContent: Html, scriptsContent: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*7.6*/headerHtml/*7.16*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*7.20*/("""
        """),_display_(/*8.10*/meta/*8.14*/.apply()),format.raw/*8.22*/("""
        """),_display_(/*9.10*/stylesheets/*9.21*/.apply()),format.raw/*9.29*/("""
        """),_display_(/*10.10*/title(AppTags.General.SITENAME + pageTitle)),format.raw/*10.53*/("""
    """)))};def /*13.6*/bodyHtml/*13.14*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*13.18*/("""
        """),_display_(/*14.10*/for(key <- Array("danger","warning","success","info")) yield /*14.64*/ {_display_(Seq[Any](format.raw/*14.66*/("""
            """),_display_(/*15.14*/if(flash().containsKey(key))/*15.42*/ {_display_(Seq[Any](format.raw/*15.44*/("""
                """),format.raw/*16.17*/("""<div class="alert alert-"""),_display_(/*16.42*/key),format.raw/*16.45*/("""">
                    <a href="#" class="close" data-dismiss="alert" aria-label="close">"""),_display_(/*17.88*/flash/*17.93*/.get(key).toString),format.raw/*17.111*/("""<i class="glyphicon glyphicon-book"></i></a>
                </div>
            """)))}),format.raw/*19.14*/("""
        """)))}),format.raw/*20.10*/("""
        """),_display_(/*21.10*/nav_wrapper(navExt)),format.raw/*21.29*/("""
        """),_display_(/*22.10*/bodyContent),format.raw/*22.21*/("""
        """),_display_(/*23.10*/footer_wrapper/*23.24*/.apply()),format.raw/*23.32*/("""
    """)))};
Seq[Any](format.raw/*5.76*/("""

    """),format.raw/*11.6*/("""

    """),format.raw/*24.6*/("""

    """),format.raw/*26.5*/("""<html xmlns="http://www.w3.org/1999/xhtml">
        """),_display_(/*27.10*/header/*27.16*/.apply(headerHtml)),format.raw/*27.34*/("""
        """),_display_(/*28.10*/body/*28.14*/.apply("body", bodyHtml)),format.raw/*28.38*/("""
        """),_display_(/*29.10*/scripts/*29.17*/.apply()),format.raw/*29.25*/("""
        """),_display_(/*30.10*/scriptsContent),format.raw/*30.24*/("""
    """),format.raw/*31.5*/("""</html>
"""))
      }
    }
  }

  def render(pageTitle:String,navExt:Html,bodyContent:Html,scriptsContent:Html): play.twirl.api.HtmlFormat.Appendable = apply(pageTitle,navExt,bodyContent,scriptsContent)

  def f:((String,Html,Html,Html) => play.twirl.api.HtmlFormat.Appendable) = (pageTitle,navExt,bodyContent,scriptsContent) => apply(pageTitle,navExt,bodyContent,scriptsContent)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Oct 14 13:03:13 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Global/Static/essentials.scala.html
                  HASH: 69b64538b96d2cf242f5c47a0469f912d0fdd8a8
                  MATRIX: 665->1|711->41|740->64|1087->89|1239->170|1257->180|1337->184|1373->194|1385->198|1413->206|1449->216|1468->227|1496->235|1533->245|1597->288|1626->301|1643->309|1724->313|1761->323|1831->377|1871->379|1912->393|1949->421|1989->423|2034->440|2086->465|2110->468|2227->558|2241->563|2281->581|2393->662|2434->672|2471->682|2511->701|2548->711|2580->722|2617->732|2640->746|2669->754|2714->163|2747->294|2780->760|2813->766|2893->819|2908->825|2947->843|2984->853|2997->857|3042->881|3079->891|3095->898|3124->906|3161->916|3196->930|3228->935
                  LINES: 24->1|25->2|26->3|31->5|35->7|35->7|37->7|38->8|38->8|38->8|39->9|39->9|39->9|40->10|40->10|41->13|41->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|49->19|50->20|51->21|51->21|52->22|52->22|53->23|53->23|53->23|55->5|57->11|59->24|61->26|62->27|62->27|62->27|63->28|63->28|63->28|64->29|64->29|64->29|65->30|65->30|66->31
                  -- GENERATED --
              */
          