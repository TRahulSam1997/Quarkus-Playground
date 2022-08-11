package Beans.EventsAndObservers;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Event;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

class TaskCompleted {

}

@ApplicationScoped
public class ComplicatedService {
    @Inject
    Event<TaskCompleted> event;

    void doSomething() {
        event.fire(new TaskCompleted());
    }
}

@ApplicationScoped
class Logger {
    void onTaskCompleted(@Observes TaskCompleted task) {
        // ...log the task
    }
}
