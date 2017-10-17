
package views.html.Global.Html5

object time extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(time: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""

"""),format.raw/*3.1*/("""<time>"""),_display_(/*3.8*/time),format.raw/*3.12*/("""</time>"""))
      }
    }
  }

  def render(time:String): play.twirl.api.HtmlFormat.Appendable = apply(time)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (time) => apply(time)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Oct 17 23:44:31 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Global/Html5/time.scala.html
                  HASH: 4d95af531c961abdbadbd63135be840b27eee2d6
                  MATRIX: 960->1|1069->15|1097->17|1129->24|1153->28
                  LINES: 28->1|33->1|35->3|35->3|35->3
                  -- GENERATED --
              */
          