
package views.html.User.Customer

import views.html.Global.Static.masterpage

object invalid extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*5.2*/bodyContent/*5.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.17*/("""
    """),format.raw/*6.5*/("""<p>"""),_display_(/*6.9*/message),format.raw/*6.16*/("""</p>
""")))};
Seq[Any](format.raw/*3.19*/("""

"""),format.raw/*7.2*/("""

"""),_display_(/*9.2*/masterpage/*9.12*/.apply(" :: Invalid", bodyContent)))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Oct 17 23:44:33 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Customer/invalid.scala.html
                  HASH: e53e3f514b8929e5f8677a50dd90da8ec83d7d08
                  MATRIX: 665->1|1014->46|1109->66|1128->77|1208->81|1239->86|1268->90|1295->97|1340->63|1368->103|1396->106|1414->116
                  LINES: 24->1|29->3|33->5|33->5|35->5|36->6|36->6|36->6|38->3|40->7|42->9|42->9
                  -- GENERATED --
              */
          