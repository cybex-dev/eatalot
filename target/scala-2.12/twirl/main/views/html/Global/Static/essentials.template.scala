
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
/*3.2*/import controllers.Application.AppTags

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
                """),_display_(/*16.18*/show_flash(key, flash().get(key).toString)),format.raw/*16.60*/("""
            """)))}),format.raw/*17.14*/("""
        """)))}),format.raw/*18.10*/("""

        """),_display_(/*20.10*/nav_wrapper(navExt)),format.raw/*20.29*/("""
        """),_display_(/*21.10*/bodyContent),format.raw/*21.21*/("""
        """),_display_(/*22.10*/footer_wrapper/*22.24*/.apply()),format.raw/*22.32*/("""
    """)))};
Seq[Any](format.raw/*5.76*/("""

    """),format.raw/*11.6*/("""

    """),format.raw/*23.6*/("""

    """),format.raw/*25.5*/("""<html xmlns="http://www.w3.org/1999/xhtml">
        """),_display_(/*26.10*/header/*26.16*/.apply(headerHtml)),format.raw/*26.34*/("""
        """),_display_(/*27.10*/scripts/*27.17*/.apply()),format.raw/*27.25*/("""
        """),_display_(/*28.10*/scriptsContent),format.raw/*28.24*/("""
        """),_display_(/*29.10*/body/*29.14*/.apply("body", bodyHtml)),format.raw/*29.38*/("""
    """),format.raw/*30.5*/("""</html>
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
<<<<<<< HEAD
                  DATE: Sun Oct 22 22:44:13 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Global/Static/essentials.scala.html
=======
                  DATE: Sun Oct 22 11:23:03 SAST 2017
                  SOURCE: /home/dylan/Desktop/eatalot/eatalot/app/views/Global/Static/essentials.scala.html
>>>>>>> master
                  HASH: b65446c97ab61f212a5453fc30cc86c325010d02
                  MATRIX: 665->1|694->24|724->48|1087->89|1239->170|1257->180|1337->184|1373->194|1385->198|1413->206|1449->216|1468->227|1496->235|1533->245|1597->288|1626->301|1643->309|1724->313|1761->323|1831->377|1871->379|1912->393|1949->421|1989->423|2034->441|2097->483|2142->497|2183->507|2221->518|2261->537|2298->547|2330->558|2367->568|2390->582|2419->590|2464->163|2497->294|2530->596|2563->602|2643->655|2658->661|2697->679|2734->689|2750->696|2779->704|2816->714|2851->728|2888->738|2901->742|2946->766|2978->771
                  LINES: 24->1|25->2|26->3|31->5|35->7|35->7|37->7|38->8|38->8|38->8|39->9|39->9|39->9|40->10|40->10|41->13|41->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|47->17|48->18|50->20|50->20|51->21|51->21|52->22|52->22|52->22|54->5|56->11|58->23|60->25|61->26|61->26|61->26|62->27|62->27|62->27|63->28|63->28|64->29|64->29|64->29|65->30
                  -- GENERATED --
              */
          