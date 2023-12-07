package observers;

import models.User;

public interface UserObserver {
    void notify(User user);
}
