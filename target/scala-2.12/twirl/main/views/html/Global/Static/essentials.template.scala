
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

object essentials extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Html,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(pageTitle: String)(navExt: Html)(bodyContent: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.54*/("""

"""),format.raw/*7.1*/("""<html xmlns="http://www.w3.org/1999/xhtml">
    """),_display_(/*8.6*/header/*8.12*/ {_display_(Seq[Any](format.raw/*8.14*/("""

        """),_display_(/*10.10*/meta/*10.14*/.apply()),format.raw/*10.22*/("""
        """),_display_(/*11.10*/stylesheets/*11.21*/.apply()),format.raw/*11.29*/("""

        """),_display_(/*13.10*/title(AppTags.General.SITENAME + pageTitle)),format.raw/*13.53*/("""
    """)))}),format.raw/*14.6*/("""
    """),_display_(/*15.6*/body/*15.10*/ {_display_(Seq[Any](format.raw/*15.12*/("""

        """),_display_(/*17.10*/for(key <- Array(AppTags.ErrorCodes.values())) yield /*17.56*/ {_display_(Seq[Any](format.raw/*17.58*/("""
            """),_display_(/*18.14*/if(flash().containsKey(key))/*18.42*/ {_display_(Seq[Any](format.raw/*18.44*/("""
                """),format.raw/*19.17*/("""<div class="alert alert-"""),_display_(/*19.42*/key),format.raw/*19.45*/("""">
                    """),_display_(/*20.22*/flash/*20.27*/.get(key)),format.raw/*20.36*/("""
                    """),format.raw/*21.21*/("""<a href="#" class="close" data-dismiss="alert" aria-label="close"><i class="glyphicon glyphicon-remove"></i></a>
                </div>
            """)))}),format.raw/*23.14*/("""
        """)))}),format.raw/*24.10*/("""

        """),_display_(/*26.10*/nav_wrapper(navExt)),format.raw/*26.29*/("""
        """),_display_(/*27.10*/bodyContent),format.raw/*27.21*/("""
        """),_display_(/*28.10*/footer_wrapper/*28.24*/.apply()),format.raw/*28.32*/("""

    """)))}),format.raw/*30.6*/("""

    """),_display_(/*32.6*/scripts/*32.13*/.apply()),format.raw/*32.21*/("""

"""),format.raw/*34.1*/("""</html>"""))
      }
    }
  }

  def render(pageTitle:String,navExt:Html,bodyContent:Html): play.twirl.api.HtmlFormat.Appendable = apply(pageTitle)(navExt)(bodyContent)

  def f:((String) => (Html) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pageTitle) => (navExt) => (bodyContent) => apply(pageTitle)(navExt)(bodyContent)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Aug 05 23:24:59 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Global/Static/essentials.scala.html
                  HASH: fd2199dbc37c2e6deafe5092cb3dd4c36bd9e741
                  MATRIX: 665->1|711->41|740->64|1082->89|1229->141|1257->143|1331->192|1345->198|1384->200|1422->211|1435->215|1464->223|1501->233|1521->244|1550->252|1588->263|1652->306|1688->312|1720->318|1733->322|1773->324|1811->335|1873->381|1913->383|1954->397|1991->425|2031->427|2076->444|2128->469|2152->472|2203->496|2217->501|2247->510|2296->531|2476->680|2517->690|2555->701|2595->720|2632->730|2664->741|2701->751|2724->765|2753->773|2790->780|2823->787|2839->794|2868->802|2897->804
                  LINES: 24->1|25->2|26->3|31->5|36->5|38->7|39->8|39->8|39->8|41->10|41->10|41->10|42->11|42->11|42->11|44->13|44->13|45->14|46->15|46->15|46->15|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|54->23|55->24|57->26|57->26|58->27|58->27|59->28|59->28|59->28|61->30|63->32|63->32|63->32|65->34
                  -- GENERATED --
              */
          