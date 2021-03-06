package org.dominokit.domino.ui.scroll;

import elemental2.dom.HTMLDivElement;
import org.dominokit.domino.ui.utils.BaseDominoElement;

import static org.jboss.elemento.Elements.div;

public class ScrollPanel extends BaseDominoElement<HTMLDivElement, ScrollPanel> {

    private HTMLDivElement element = div().css("scroll-panel").element();

    public static ScrollPanel create(){
        return new ScrollPanel();
    }

    public ScrollPanel() {
        init(this);
    }

    @Override
    public HTMLDivElement element() {
        return element;
    }
}
