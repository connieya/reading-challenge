package clean.io.refactoring.buckpal.account.adapter.in.web;

import clean.io.refactoring.buckpal.account.application.port.in.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
 class AccountController {

 private final GetAccountBalanceQuery getAccountBalanceQuery;
 private final ListAccountQuery listAccountQuery;
 private final LoadAccountQuery loadAccountQuery;

 private final SendMoneyUseCase sendMoneyUseCase;
 private final CreateAccountUseCase createAccountUseCase;

// @GetMapping("/accounts")
// List<AccountResource> listAccounts() {
//  ...
// }
//
// @GetMapping("/accounts/{accountId}")
// AccountResource getAccount(@PathVariable("accountId") Long accountId) {}
// ...
//}
//
//@GetMapping("/accounts/{accountId}/balance")
//long getAccountBalance(@PathVariable("accountId") Long accountId) {
// ...
//}
//
//@PostMapping("/accounts")
//AccountResource createAccount(@RequestBody AccountResource account) {
// ...
//
//}
//
//@PostMapping("/account/send/{sourceAccountId}/{targetAccountId}/{amount}")
//void sendMoney(
//        @PathVariable("sourceAccountId") Long sourceAccountId ,
//        @PathVariable("targetAccountId") Long targetAccountId ,
//        @PathVariable("amount") Long amount
//) {
// ...
//
//}

}
