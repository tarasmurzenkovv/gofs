package command;

import com.taras.murzenkov.behavior.command.code.Agent;
import com.taras.murzenkov.behavior.command.code.Order;
import com.taras.murzenkov.behavior.command.code.impl.AgentImpl;
import com.taras.murzenkov.behavior.command.code.impl.BuyStockOrder;
import com.taras.murzenkov.behavior.command.code.impl.SellStockOrder;
import com.taras.murzenkov.behavior.command.code.impl.Stock;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * UTs for the Command pattern.
 *
 * @author Taras Murzenkov
 */
public class CommandImplTest {

    @Test
    public void shouldExecuteOrderRequests() {
        final Stock stock = Mockito.mock(Stock.class);
        final Agent agent = new AgentImpl();
        Order buyCommand = new BuyStockOrder(stock);
        Order sellCommand = new SellStockOrder(stock);
        agent.placeOrder(buyCommand);
        agent.placeOrder(sellCommand);

        Mockito.verify(stock).buy();
        Mockito.verify(stock).sell();
    }
}
