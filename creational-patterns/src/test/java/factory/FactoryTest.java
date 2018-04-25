package factory;

import com.taras.murzenkov.factory.code.Button;
import com.taras.murzenkov.factory.code.ButtonFactory;
import com.taras.murzenkov.factory.code.impl.ButtonFactoryImpl;
import com.taras.murzenkov.factory.code.impl.GuiButtonBuilder;
import com.taras.murzenkov.factory.code.impl.HtmlButtonBuilder;
import com.taras.murzenkov.factory.code.model.ButtonType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * UTs for the {@link ButtonFactory}.
 *
 * @author Taras Murzenkov
 */
public class FactoryTest {
    private ButtonFactory sut = new ButtonFactoryImpl();

    /**
     * Setup.
     */
    @Before
    public void initFactory() {
        sut.register(ButtonType.GUI, new GuiButtonBuilder());
        sut.register(ButtonType.HTML, new HtmlButtonBuilder());
    }

    @Test
    public void shouldBuildGuiButton() {
        Button guiButton = this.sut.build(ButtonType.GUI);
        String renderedResult = "GuiButtonInfo Coordinates: ={10, 10}, Shape: ={10, 10}";
        Assert.assertEquals(guiButton.render(), renderedResult);
    }

    @Test
    public void shouldBuildHtmlButton() {
        Button htmlButton = this.sut.build(ButtonType.HTML);
        String renderedResult = "HtmlButtonInfo Coordinates: ={0, 0}, Shape: ={0, 0}";
        Assert.assertEquals(htmlButton.render(), renderedResult);
    }
}
