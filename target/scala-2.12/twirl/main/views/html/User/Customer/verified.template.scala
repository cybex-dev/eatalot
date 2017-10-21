
package views.html.User.Customer

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
/*1.2*/import views.html.Global.Static.masterpage

object verified extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*5.2*/bodyContent/*5.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.17*/("""
    """),format.raw/*6.5*/("""<h2>Email has been verified</h2>
    <br/>
    <p>Please login to complete registration</p>
    <br/>
    """),_display_(/*10.6*/helper/*10.12*/.form( action = controllers.User.routes.UserController.login())/*10.75*/{_display_(Seq[Any](format.raw/*10.76*/("""
        """),format.raw/*11.9*/("""<button class="btn btn-default" type="submit">Login</button>
    """)))}),format.raw/*12.6*/("""
""")))};
Seq[Any](format.raw/*3.4*/("""

"""),format.raw/*13.2*/("""

"""),_display_(/*15.2*/masterpage/*15.12*/.apply("Verified", bodyContent)))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Oct 21 09:12:57 SAST 2017
                  SOURCE: /home/cybex/Projects/eatalot-temp/app/views/User/Customer/verified.scala.html
                  HASH: ea342b8d25ec443cf3e3bc9167c1ae3168cacd46
                  MATRIX: 665->1|1008->46|1088->51|1107->62|1187->66|1218->71|1351->178|1366->184|1438->247|1477->248|1513->257|1609->323|1649->48|1678->325|1707->328|1726->338
                  LINES: 24->1|29->3|33->5|33->5|35->5|36->6|40->10|40->10|40->10|40->10|41->11|42->12|44->3|46->13|48->15|48->15
                  -- GENERATED --
              */
          