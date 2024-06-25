package java.io.refactoring.buckpal.account.domain;

import lombok.NonNull;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.io.refactoring.buckpal.account.domain.Account.*;

public class ActivityWindow {

    private List<Activity> activities;

    public LocalDateTime getStartTimestamp() {
        return activities.stream()
                .min(Comparator.comparing(Activity::getTimestamp))
                .orElseThrow(IllegalStateException::new)
                .getTimestamp();
    }

    public LocalDateTime getEndTimestamp() {
        return activities.stream()
                .max(Comparator.comparing(Activity::getTimestamp))
                .orElseThrow(IllegalStateException::new)
                .getTimestamp();
    }

    public ActivityWindow(@NonNull List<Activity> activities) {
        this.activities = activities;
    }

    public Money calculateBalance(AccountId accountId) {
        Money depositBalance = activities.stream()
                .filter(a -> a.getTargetAccountId().equals(accountId))
                .map(Activity::getMoney)
                .reduce(Money.ZERO, Money::add);
        return null;
    }

    public List<Activity> getActivities() {
        return Collections.unmodifiableList(this.activities);
    }

    public void addActivity(Activity activity) {
        this.activities.add(activity);

    }
}
