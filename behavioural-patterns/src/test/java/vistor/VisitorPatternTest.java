package vistor;

import com.taras.murzenkov.behavior.visitor.code.Service;
import com.taras.murzenkov.behavior.visitor.code.impl.ServiceImpl;
import com.taras.murzenkov.behavior.visitor.code.impl.VisitorImpl;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.verify;

/**
 * Unit tests for the {@link VisitorImpl}.
 *
 * @author Taras Murzenkov
 */
public class VisitorPatternTest {

    private VisitorImpl visitorMock = Mockito.mock(VisitorImpl.class);
    private Service<VisitorImpl> sut = new ServiceImpl();

    /**
     * Performs the initialisation of the {@link Service}.
     */
    @Before
    public void init() {
        sut.accept(visitorMock);
    }

    @Test
    public void shouldCallTheServiceMethod() {
        doCallRealMethod().when(visitorMock).visit(any(ServiceImpl.class));
        this.sut.doLogic();
        verify(visitorMock).visit(any(ServiceImpl.class));
    }
}
