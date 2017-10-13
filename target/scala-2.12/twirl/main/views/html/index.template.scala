
package views.html

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
/*1.2*/import views.html.global.main

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.4*/("""

"""),_display_(/*4.2*/main("Welcome to Play")/*4.25*/ {_display_(Seq[Any](format.raw/*4.27*/("""
  """),format.raw/*5.3*/("""<h1>Welcome to Play!</h1>
""")))}),format.raw/*6.2*/("""
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
                  DATE: Thu Oct 12 15:36:11 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/index.scala.html
                  HASH: dace264a2f663035eed39db95aa70da014a09293
                  MATRIX: 651->1|978->32|1074->34|1102->37|1133->60|1172->62|1201->65|1257->92
                  LINES: 24->1|29->2|34->2|36->4|36->4|36->4|37->5|38->6
                  -- GENERATED --
              */
          