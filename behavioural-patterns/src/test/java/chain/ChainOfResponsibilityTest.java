package chain;

import com.taras.murzenkov.behavior.chain.code.Filter;
import com.taras.murzenkov.behavior.chain.code.impl.filter.FilterOnlyNumbers;
import com.taras.murzenkov.behavior.chain.code.impl.filter.FilterOnlyVowels;
import com.taras.murzenkov.behavior.chain.code.impl.filter.FilterSpecialCharacters;

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
    private Filter<String> sut = new FilterOnlyVowels();

    @Test
    public void shouldAllMethodsInChainBeCalledInOrder() {
        final String message = "1122%^aaaaaaffff";
        specialCharactersFilter.next(null);
        numberFilter.next(specialCharactersFilter);
        sut.next(numberFilter);
        doCallRealMethod().when(numberFilter).doFilter(any(String.class));
        doCallRealMethod().when(specialCharactersFilter).doFilter(any(String.class));
        this.sut.doFilter(message);

        verify(numberFilter).doFilter(eq(message));
    }
}
