
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
    """),format.raw/*6.5*/("""<div class="center-block align-middle">
        <p>"""),_display_(/*7.13*/message),format.raw/*7.20*/("""</p>
    </div>
""")))};
Seq[Any](format.raw/*3.19*/("""

"""),format.raw/*9.2*/("""

"""),_display_(/*11.2*/masterpage/*11.12*/.apply(" :: Forbidden", bodyContent)))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Oct 10 18:16:53 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Application/forbidden.scala.html
                  HASH: a7f65d1a4b13ad5f4e0df1632177304c7217d2ff
                  MATRIX: 663->1|1003->35|1098->55|1117->66|1197->70|1228->75|1306->127|1333->134|1389->52|1417->151|1446->154|1465->164
                  LINES: 24->1|29->3|33->5|33->5|35->5|36->6|37->7|37->7|40->3|42->9|44->11|44->11
                  -- GENERATED --
              */
          