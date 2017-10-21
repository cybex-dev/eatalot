
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
/*1.2*/import Global.Html5.footer

object footer_wrapper extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*5.2*/footerContent/*5.15*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.19*/("""
    """),format.raw/*6.5*/("""<div class="footer navbar-inverse">
        <div class="container">
            <p class="footer-brand">Created by Intelligents 2017 (NMU)</p>
        </div>
    </div>
""")))};
Seq[Any](format.raw/*3.4*/("""

"""),format.raw/*11.2*/("""

"""),_display_(/*13.2*/footer/*13.8*/.apply("", footerContent)),format.raw/*13.33*/("""
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
                  DATE: Sat Oct 21 09:12:56 SAST 2017
                  SOURCE: /home/cybex/Projects/eatalot-temp/app/views/Global/Static/footer_wrapper.scala.html
                  HASH: 800cf4a34a385ad8cb1a20f9c8ed2a72dc6cdece
                  MATRIX: 665->1|998->30|1078->35|1099->48|1179->52|1210->57|1418->32|1447->227|1476->230|1490->236|1536->261
                  LINES: 24->1|29->3|33->5|33->5|35->5|36->6|42->3|44->11|46->13|46->13|46->13
                  -- GENERATED --
              */
          