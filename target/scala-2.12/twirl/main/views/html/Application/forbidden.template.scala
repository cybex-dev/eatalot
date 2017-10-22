
package views.html.Application

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

object forbidden extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*5.2*/bodyContent/*5.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.17*/("""
    """),format.raw/*6.5*/("""<div style="background-color: #eaeaea;">
        <div class="center-parent">
            <div class="center-child">
                <img src=""""),_display_(/*9.28*/routes/*9.34*/.Assets.versioned("images/navigation/forbidden.png")),format.raw/*9.86*/("""" class="top img-fluid">
                <p class="bottom">"""),_display_(/*10.36*/message),format.raw/*10.43*/("""</p>
            </div>
        </div>
    </div>
    <br/>
"""),_display_(/*15.2*/helper/*15.8*/.form( action = controllers.Application.routes.HomeController.index())/*15.78*/ {_display_(Seq[Any](format.raw/*15.80*/("""
    """),_display_(/*16.6*/helper/*16.12*/.CSRF.formField),format.raw/*16.27*/("""
    """),format.raw/*17.5*/("""<input type="submit" class="btn btn-default button-small" value="Home">
""")))}),format.raw/*18.2*/("""
""")))};
Seq[Any](format.raw/*3.19*/("""

"""),format.raw/*19.2*/("""

"""),_display_(/*21.2*/masterpage/*21.12*/.apply(" :: Forbidden", bodyContent)))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Oct 22 11:23:04 SAST 2017
                  SOURCE: /home/dylan/Desktop/eatalot/eatalot/app/views/Application/forbidden.scala.html
                  HASH: d347fd9a8dfa40558e69746e883afc4f2d190e83
                  MATRIX: 663->1|1003->35|1098->55|1117->66|1197->70|1228->75|1397->218|1411->224|1483->276|1570->336|1598->343|1685->404|1699->410|1778->480|1818->482|1850->488|1865->494|1901->509|1933->514|2036->587|2077->52|2106->589|2135->592|2154->602
                  LINES: 24->1|29->3|33->5|33->5|35->5|36->6|39->9|39->9|39->9|40->10|40->10|45->15|45->15|45->15|45->15|46->16|46->16|46->16|47->17|48->18|50->3|52->19|54->21|54->21
                  -- GENERATED --
              */
          