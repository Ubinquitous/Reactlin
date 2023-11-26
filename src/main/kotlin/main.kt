import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.a
import styled.css
import styled.styledDiv

@JsExport
class Main : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        styledDiv {
            a {
                +"HAHAHA"
            }
        }
        styledDiv {
            a {
                +"HELLO WORLD"
            }
        }
    }
}
