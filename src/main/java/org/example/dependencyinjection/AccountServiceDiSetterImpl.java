package org.example.dependencyinjection;

import org.example.pojo.Account;
import org.example.pojo.AccountRepository;
import org.example.pojo.AccountService;

    public class AccountServiceDiSetterImpl implements AccountService {
        private AccountRepository accountRepository;

        public void setAccountRepository(AccountRepository accountRepository) {
            this.accountRepository = accountRepository;
        }

        @Override
        public void transferMoney(long fromAccountId, long toAccountId, double amount) {

        }

        @Override
        public void depositMoney(long accountId, double amount) throws Exception {

        }

        @Override
        public Account getAccount(long accountId) {
            return null;
        }
    }