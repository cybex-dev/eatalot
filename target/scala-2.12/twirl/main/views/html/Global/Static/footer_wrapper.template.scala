
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
/*2.2*/import Global.Html5.h_line

object footer_wrapper extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*6.2*/footerContent/*6.15*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.19*/("""
    """),format.raw/*7.5*/("""<div class="footer navbar-inverse">
        <div class="container">
            <p class="footer-brand">Created by Intelligents 2017 (NMU)</p>
        </div>
    </div>
""")))};
Seq[Any](format.raw/*4.4*/("""

"""),format.raw/*12.2*/("""

"""),_display_(/*14.2*/footer/*14.8*/.apply("", footerContent)),format.raw/*14.33*/("""
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
                  DATE: Sat Oct 07 12:53:16 SAST 2017
                  SOURCE: /home/dylan/Documents/project/goaway/eatalot-master (backup)/Order-Management-Devel/app/views/Global/Static/footer_wrapper.scala.html
                  HASH: d4193a38f1f6bc4ccf2be8a6bcafc75ceeaf4d62
                  MATRIX: 665->1|699->29|1032->58|1112->63|1133->76|1213->80|1244->85|1452->60|1481->255|1510->258|1524->264|1570->289
                  LINES: 24->1|25->2|30->4|34->6|34->6|36->6|37->7|43->4|45->12|47->14|47->14|47->14
                  -- GENERATED --
              */
          