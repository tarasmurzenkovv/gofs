**GoF Definition** 

Define a one-to-many dependency between objects so that when one object changes state,
all its dependents are notified and updated automatically.

**Concept**

In this pattern, there are many observers (objects) which are observing a particular subject (object).
Observers are basically interested and want to be notified when there is a change made inside that subject.
So, they register themselves to that subject. When they lose interest in the subject they simply unregister
from the subject. Sometimes this model is also referred to as the Publisher-Subscriber model.