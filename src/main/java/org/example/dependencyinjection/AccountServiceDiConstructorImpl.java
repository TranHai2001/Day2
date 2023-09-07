package org.example.dependencyinjection;

import org.example.pojo.Account;
import org.example.pojo.AccountRepository;
import org.example.pojo.AccountService;
import org.example.pojo.AccountServiceImpl;

public class AccountServiceDiConstructorImpl {
    public class AccountServiceImpl implements AccountService{
        private AccountRepository accountRepository;

        public AccountServiceImpl(AccountRepository accountRepository){
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
}
