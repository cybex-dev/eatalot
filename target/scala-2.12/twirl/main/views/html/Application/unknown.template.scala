
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

object unknown extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*5.2*/bodyContent/*5.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.17*/("""
    """),format.raw/*6.5*/("""<div style="background-color: #eaeaea;">
        <div class="center-parent">
            <div class="center-child">
                <img src=""""),_display_(/*9.28*/routes/*9.34*/.Assets.versioned("images/navigation/question_mark.png")),format.raw/*9.90*/("""" class="top img-fluid">
                <p class="bottom">"""),_display_(/*10.36*/message),format.raw/*10.43*/("""</p>
            </div>
        </div>
    </div>
    <br/>
    """),_display_(/*15.6*/helper/*15.12*/.form( action = controllers.Application.routes.HomeController.index())/*15.82*/ {_display_(Seq[Any](format.raw/*15.84*/("""
        """),_display_(/*16.10*/helper/*16.16*/.CSRF.formField),format.raw/*16.31*/("""
        """),format.raw/*17.9*/("""<input type="submit" class="btn btn-default button-small" value="Home">
    """)))}),format.raw/*18.6*/("""
""")))};
Seq[Any](format.raw/*3.19*/("""

"""),format.raw/*19.2*/("""

"""),_display_(/*21.2*/masterpage/*21.12*/.apply(" :: Page not found", bodyContent)))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Oct 22 22:44:13 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Application/unknown.scala.html
                  HASH: 0281d5a284f32df79cac2a2641176794a2e1fe51
                  MATRIX: 663->1|1001->35|1096->55|1115->66|1195->70|1226->75|1395->218|1409->224|1485->280|1572->340|1600->347|1691->412|1706->418|1785->488|1825->490|1862->500|1877->506|1913->521|1949->530|2056->607|2097->52|2126->609|2155->612|2174->622
                  LINES: 24->1|29->3|33->5|33->5|35->5|36->6|39->9|39->9|39->9|40->10|40->10|45->15|45->15|45->15|45->15|46->16|46->16|46->16|47->17|48->18|50->3|52->19|54->21|54->21
                  -- GENERATED --
              */
          