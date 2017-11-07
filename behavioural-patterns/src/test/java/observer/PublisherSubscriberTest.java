package observer;

import com.taras.murzenkov.behavior.observer.Publisher;
import com.taras.murzenkov.behavior.observer.Subscriber;
import com.taras.murzenkov.behavior.observer.impl.PublisherImpl;
import com.taras.murzenkov.behavior.observer.impl.SubscriberImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;


public class PublisherSubscriberTest {
    private Publisher<Subscriber> sut = new PublisherImpl();
    private List<SubscriberImpl> subscribers;

    @Before
    public void initMocks() {
        List<SubscriberImpl> listOfMocks = new ArrayList<>();
        final SubscriberImpl subscribe1 = Mockito.mock(SubscriberImpl.class);
        final SubscriberImpl subscribe2 = Mockito.mock(SubscriberImpl.class);
        final SubscriberImpl subscribe3 = Mockito.mock(SubscriberImpl.class);
        listOfMocks.add(subscribe1);
        listOfMocks.add(subscribe2);
        listOfMocks.add(subscribe3);
        doCallRealMethod().when(subscribe1).call();
        doCallRealMethod().when(subscribe2).call();
        doCallRealMethod().when(subscribe3).call();

        this.subscribers = listOfMocks;
    }

    @Test
    public void shouldCallEachSubscriberMethod() {
        subscribers.forEach(sut::register);
        sut.notifySubscribers();
        subscribers.forEach(subscriber -> verify(subscriber).call());
    }

    @Test
    public void shouldNotCallTheUnregisteredSubscriberMethod() {
        subscribers.forEach(sut::register);
        final SubscriberImpl subscriber3 = subscribers.get(2);
        subscribers.remove(subscriber3);
        sut.remove(subscriber3);
        sut.notifySubscribers();
        subscribers.forEach(subscriber -> verify(subscriber).call());
        verifyNoMoreInteractions(subscriber3);
    }
}
