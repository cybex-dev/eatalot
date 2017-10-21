
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

def /*5.6*/footerContent/*5.19*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.23*/("""
        """),format.raw/*6.9*/("""<div class="footer navbar-inverse round-corners-small small-margin">
            <div class="container center-parent">
                <div class="center-child">
                    <p class="footer-brand">Created by Intelligents 2017 (NMU)</p>
                </div>
            </div>
        </div>
    """)))};
Seq[Any](format.raw/*3.4*/("""

    """),format.raw/*13.6*/("""

    """),_display_(/*15.6*/footer/*15.12*/.apply("null", footerContent)),format.raw/*15.41*/("""
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
                  DATE: Sat Oct 21 11:02:13 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Global/Static/footer_wrapper.scala.html
                  HASH: 15c1f88bd8e1b4b3274498f44c15db93155ff4a7
                  MATRIX: 665->1|998->30|1078->39|1099->52|1179->56|1214->65|1559->32|1592->372|1625->379|1640->385|1690->414
                  LINES: 24->1|29->3|33->5|33->5|35->5|36->6|44->3|46->13|48->15|48->15|48->15
                  -- GENERATED --
              */
          