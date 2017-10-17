
package views.html.Global.Html5

import _root_.play.twirl.api.Html

object nav extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(clazz: String, content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<nav class="""),_display_(/*3.13*/clazz),format.raw/*3.18*/(""">
    """),_display_(/*4.6*/content),format.raw/*4.13*/("""
"""),format.raw/*5.1*/("""</nav>"""))
      }
    }
  }

  def render(clazz:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(clazz,content)

  def f:((String,Html) => play.twirl.api.HtmlFormat.Appendable) = (clazz,content) => apply(clazz,content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Oct 17 23:44:31 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Global/Html5/nav.scala.html
                  HASH: fe2fc94f74be698e499577718ce409916dde7628
                  MATRIX: 964->1|1089->31|1117->33|1155->45|1180->50|1212->57|1239->64|1266->65
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|36->4|37->5
                  -- GENERATED --
              */
          