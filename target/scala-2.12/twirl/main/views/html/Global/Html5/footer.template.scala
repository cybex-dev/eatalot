
package views.html.Global.Html5

import _root_.play.twirl.api.Html

object footer extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(clazz: String, content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<footer class="""),_display_(/*3.16*/clazz),format.raw/*3.21*/(""">
    """),_display_(/*4.6*/content),format.raw/*4.13*/("""
"""),format.raw/*5.1*/("""</footer>"""))
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
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Global/Html5/footer.scala.html
                  HASH: 22a950eeb5d2e608d9b85760bd01568189ef5924
                  MATRIX: 967->1|1092->31|1120->33|1161->48|1186->53|1218->60|1245->67|1272->68
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|36->4|37->5
                  -- GENERATED --
              */
          