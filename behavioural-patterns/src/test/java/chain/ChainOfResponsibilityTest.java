package chain;

import com.taras.murzenkov.behavior.chain.code.Filter;
import com.taras.murzenkov.behavior.chain.code.impl.FilterOnlyNumbers;
import com.taras.murzenkov.behavior.chain.code.impl.FilterOnlyVowels;
import com.taras.murzenkov.behavior.chain.code.impl.FilterSpecialCharacters;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.verify;

/**
 * UTs for the {@link Filter}.
 *
 * @author Taras_Murzenkov
 */
public class ChainOfResponsibilityTest {

    private Filter<String> numberFilter = Mockito.mock(FilterOnlyNumbers.class);
    private Filter<String> specialCharactersFilter = Mockito.mock(FilterSpecialCharacters.class);
    private Filter<String> sut;

    /**
     * Tetst setup.
     */
    @Before
    public void initFilterChain() {
        this.sut = buildFilterChain();
    }

    @Test
    public void shouldAllMethodsInChainBeCalledInOrder() {
        final String message = "1122%^aaaaaaffff";
        doCallRealMethod().when(numberFilter).doFilter(any(String.class));
        doCallRealMethod().when(specialCharactersFilter).doFilter(any(String.class));

        this.sut.doFilter(message);

        verify(numberFilter).doFilter(eq(message));
    }

    private Filter<String> buildFilterChain() {
        Filter<String> chain = new FilterOnlyVowels();
        specialCharactersFilter.next(null);
        numberFilter.next(specialCharactersFilter);
        chain.next(numberFilter);
        return chain;
    }
}
