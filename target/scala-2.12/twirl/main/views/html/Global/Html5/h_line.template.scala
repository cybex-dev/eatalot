
package views.html.Global.Html5

object h_line extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(width: Integer = 90):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.23*/("""

"""),format.raw/*3.1*/("""<hr width="""),_display_(/*3.12*/String/*3.18*/.valueOf(width)),format.raw/*3.33*/(""""%">"""))
      }
    }
  }

  def render(width:Integer): play.twirl.api.HtmlFormat.Appendable = apply(width)

  def f:((Integer) => play.twirl.api.HtmlFormat.Appendable) = (width) => apply(width)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Oct 17 23:44:31 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Global/Html5/h_line.scala.html
                  HASH: 7fcda8c38ca1b46c8710bce92c838d54e3f71c4d
                  MATRIX: 963->1|1079->22|1107->24|1144->35|1158->41|1193->56
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3
                  -- GENERATED --
              */
          