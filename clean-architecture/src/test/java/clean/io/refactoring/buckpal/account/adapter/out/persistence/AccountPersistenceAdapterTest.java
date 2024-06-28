package clean.io.refactoring.buckpal.account.adapter.out.persistence;

import clean.io.refactoring.buckpal.account.domain.Account;
import clean.io.refactoring.buckpal.account.domain.ActivityWindow;
import clean.io.refactoring.buckpal.account.domain.Money;
import clean.io.refactoring.buckpal.common.AccountTestData;
import clean.io.refactoring.buckpal.common.ActivityTestData;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.jdbc.Sql;

import java.time.LocalDateTime;

import static clean.io.refactoring.buckpal.account.domain.Account.*;
import static clean.io.refactoring.buckpal.common.AccountTestData.*;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@Import({AccountPersistenceAdapter.class , AccountMapper.class})
class AccountPersistenceAdapterTest {

    @Autowired
    private AccountPersistenceAdapter adapterUnderTest;

    @Autowired
    private ActivityRepository activityRepository;

    @Test
    @Sql("AccountPersistenceAdapterTest.sql")
    void loadAccount() {
        Account account = adapterUnderTest.loadAccount(
                new AccountId(1L),
                LocalDateTime.of(2018,8,10,0,0)
        );

        assertThat(account.getActivityWindow().getActivities()).hasSize(2);
        assertThat(account.calculateBalance()).isEqualTo(Money.of(500L));

    }

    @Test
    void updateActivities() {
        Account account = defaultAccount()
                .withBaselineBalance(Money.of(555L))
                .withActivityWindow(new ActivityWindow(
                        ActivityTestData.defaultActivity()
                                .withId(null)
                                .withMoney(Money.of(1L)).build()
                )).build();

        adapterUnderTest.updateActivities(account);

        assertThat(activityRepository.count()).isEqualTo(1);

        ActivityJpaEntity savedActivity = activityRepository.findAll().get(0);
        assertThat(savedActivity.getAmount()).isEqualTo(1L);

    }
}