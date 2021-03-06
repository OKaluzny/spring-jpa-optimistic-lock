package sample.data.jpa.service;

import org.springframework.data.jpa.repository.JpaRepository;
import sample.data.jpa.domain.Account;


/**
 * @author eg
 * @version 4.0
 * @since 2015-03-03
 */
public interface AccountRepository extends JpaRepository<Account, Integer>, AccountRepositoryCustom {
}
